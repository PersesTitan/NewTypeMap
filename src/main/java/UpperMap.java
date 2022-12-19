import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class UpperMap<V> extends HashMap<String, V> {
    @Override
    public V get(Object key) {
        return super.get(key.toString().toUpperCase(Locale.ROOT));
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key.toString().toUpperCase(Locale.ROOT));
    }

    @Override
    public V put(String key, V value) {
        return super.put(key.toUpperCase(Locale.ROOT), value);
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> m) {
        m.forEach((k, v) -> this.put(k.toUpperCase(Locale.ROOT), v));
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return super.getOrDefault(key.toString().toUpperCase(Locale.ROOT), defaultValue);
    }

    @Override
    public V putIfAbsent(String key, V value) {
        return super.putIfAbsent(key.toUpperCase(Locale.ROOT), value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return super.remove(key.toString().toUpperCase(Locale.ROOT), value);
    }

    @Override
    public boolean replace(String key, V oldValue, V newValue) {
        return super.replace(key.toUpperCase(Locale.ROOT), oldValue, newValue);
    }

    @Override
    public V replace(String key, V value) {
        return super.replace(key.toUpperCase(Locale.ROOT), value);
    }

    @Override
    public V computeIfAbsent(String key, Function<? super String, ? extends V> mappingFunction) {
        return super.computeIfAbsent(key.toUpperCase(Locale.ROOT), mappingFunction);
    }

    @Override
    public V computeIfPresent(String key, BiFunction<? super String, ? super V, ? extends V> remappingFunction) {
        return super.computeIfPresent(key.toUpperCase(Locale.ROOT), remappingFunction);
    }

    @Override
    public V compute(String key, BiFunction<? super String, ? super V, ? extends V> remappingFunction) {
        return super.compute(key.toUpperCase(Locale.ROOT), remappingFunction);
    }

    @Override
    public V merge(String key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return super.merge(key.toUpperCase(Locale.ROOT), value, remappingFunction);
    }

    @Override
    public void forEach(BiConsumer<? super String, ? super V> action) {
        super.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super V, ? extends V> function) {
        super.replaceAll(function);
    }

    @Override
    public V remove(Object key) {
        return super.remove(key.toString().toUpperCase(Locale.ROOT));
    }
}
