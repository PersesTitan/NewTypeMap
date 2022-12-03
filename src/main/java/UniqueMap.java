import java.util.HashMap;
import java.util.Map;

public class UniqueMap<K, V> extends HashMap<K, V> {
    @Override
    public V put(K key, V value) {
        if (super.containsValue(value)) {
            K k = findValue(value);
            if (k != null) {
                super.remove(k, value);
                return super.put(key, value);
            }
        }
        return super.put(key, value);
    }

    private K findValue(V value) {
        for (Entry<K, V> v : super.entrySet()) {
            if (v.getValue().equals(value)) return v.getKey();
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        m.forEach(this::put);
    }
}
