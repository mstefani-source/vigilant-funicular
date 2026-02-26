package org.future.lkapp.Solutions.expiringcache;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExpiringCacheTest {
    @Test
    @DisplayName("CacheTest")
    public void putgettest() {
        
        ExpiringCache<Object, Object> cache = new ExpiringCache<>();
        String key = "testkey";
        String value = "{testvalue}";
        Duration ttl = Duration.ofMillis(0);

        cache.put(key,value, ttl);

    }
}
