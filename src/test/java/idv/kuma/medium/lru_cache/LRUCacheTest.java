package idv.kuma.medium.lru_cache;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void Official_Example() {

        LRUCache cache = new LRUCache(2 /* capacity */);

        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertThat(cache.get(1)).isEqualTo(1);

        cache.put(3, 3);    // evicts key 2
        Assertions.assertThat(cache.get(2)).isEqualTo(-1);

        cache.put(4, 4);    // evicts key 1
        Assertions.assertThat(cache.get(1)).isEqualTo(-1);       // returns -1 (not found)
        Assertions.assertThat(cache.get(3)).isEqualTo(3);       // returns 3
        Assertions.assertThat(cache.get(4)).isEqualTo(4);       // returns 4

    }
}