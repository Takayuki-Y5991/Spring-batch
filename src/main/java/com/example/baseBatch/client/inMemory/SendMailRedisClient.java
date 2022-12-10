package com.example.baseBatch.client.inMemory;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.common.Constance;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;

@Repository
public class SendMailRedisClient implements InMemoryRepository<List<MailInformation>> {
    @Autowired
    private RedisTemplate<String, String> client;

    @Override
    public void createBucket(String key, List<MailInformation> source) {
        // change Collection<?> to Json String , because redis can't deal java list type
        Gson gson = new Gson();
        this.client.opsForValue().set(key, gson.toJson(source));
        this.client.expire(key, Constance.FETCH_DATA_STORE_LIMIT, Constance.FETCH_DATA_STORE_LIMIT_TIMEUNIT);
    }

    @Override
    public void deleteBucket(String key) {
        this.client.delete(key);
    }

    @Override
    public List<MailInformation> getBucket(String key) {
        // Custom Type define, because redis can't deal java list type
        Type collectionType = new TypeToken<Collection<MailInformation>>() {
        }.getType();
        // Gson custom, because normal Setting can't change json to java.time.localDate
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                Instant instance = Instant.ofEpochMilli(json.getAsJsonPrimitive().getAsLong());
                return LocalDate.ofInstant(instance, ZoneId.systemDefault());
            }
        }).create();
        return gson.fromJson(this.client.opsForValue().get(key), collectionType);
    }
}
