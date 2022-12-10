package com.example.baseBatch.config.chunks.reader;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.client.inMemory.SendMailRedisClient;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@StepScope
@Component
public class SendMailReader implements ItemReader<MailInformation> {

    @Autowired
    private SendMailRedisClient client;

    @Value("${redis.key}")
    private String key;

    private Iterator<MailInformation> iterator;

    // Fetch data in memory
    private List<MailInformation> sources = new ArrayList<MailInformation>();

    @Nullable
    @Override
    public MailInformation read() {
        if (CollectionUtils.isEmpty(sources)) {
            sources = client.getBucket(key);
            iterator = sources.iterator();
        }
        if (iterator.hasNext()) {
            return iterator.next();
        } else {
            return null;
        }
    }
}
