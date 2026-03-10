package org.future.lkapp.Solutions.expiringcache;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ExpiringCache<K, V> {

    private static class CacheEntry<V> {

        private final V value;
        private final Instant expiryTime;

        CacheEntry(V value, Duration ttl) {
            this.value = value;
            this.expiryTime = Instant.now().plus(ttl);
        }

        boolean isExpired() {
            return Instant.now().isAfter(expiryTime);
        }

    }

    private final ConcurrentHashMap<K, CacheEntry<V>> cCash = new ConcurrentHashMap<>();

    public void put(K key, V value, Duration ttl) {

    }

    public Optional<V> get(K key) {
        Optional<V> obtainedKey = Optional.ofNullable(null);
        return obtainedKey;
    }

    public void remove(K key) {

    }

    public int size() {
        return 0;
    }
}
