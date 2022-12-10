package com.example.baseBatch.client.inMemory;

public interface InMemoryRepository<T> {

    void createBucket(String key, T value);

    void deleteBucket(String key);

    T getBucket(String key);
}
