import java.util.*;

public class HashMapExample<K, V> implements java.util.Map<K, V> {
    private final java.util.Map<K, V> map;

    public HashMapExample() {
        map = new java.util.HashMap<>();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean containsKey(Object k) {
        return map.containsKey(k);
    }

    @Override
    public boolean containsValue(Object v) {
        return map.containsValue(v);
    }

    @Override
    public boolean equals(Object obj) {
        return map.equals(obj);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public V get(Object k) {
        return map.get(k);
    }

    @Override
    public V getOrDefault(Object k, V defaultValue) {
        return map.getOrDefault(k, defaultValue);
    }

    @Override
    public V put(K k, V v) {
        return map.put(k, v);
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public List<V> values() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }

    @Override
    public V remove(Object k) {
        return map.remove(k);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }
}
