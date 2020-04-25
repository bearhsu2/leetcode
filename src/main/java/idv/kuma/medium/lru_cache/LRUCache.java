package idv.kuma.medium.lru_cache;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    private final int CAPACITY;

    public Map<Integer, Integer> cache;


    public LRUCache(int capacity) {
        CAPACITY = capacity;
        cache = new LinkedHashMap<>();
    }


    public int get(int key) {

        int value = -1;

        if (cache.containsKey(key)) {

            value = cache.get(key);

            cache.remove(key);

            cache.put(key, value);

            return value;

        }

        return value;
    }


    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            cache.remove(key);
        } else if (cache.size() == CAPACITY) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);


    }
}
