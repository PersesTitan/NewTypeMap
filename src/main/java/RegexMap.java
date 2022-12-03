import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMap<V> extends LinkedHashMap<String, V> {
    private final Map<String, Matcher> regex = new HashMap<>();

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        V value = get(key);
        if (value == null) return defaultValue;
        else return value;
    }

    @Override
    public V get(Object key) {
        return getVal(key.toString());
    }

    @Override
    public V put(String key, V value) {
        return putVal(key, value);
    }

    private V putVal(String key, V value) {
        regex.put(key, Pattern.compile(key).matcher(""));
        return super.put(key, value);
    }

    @Override
    public V remove(Object key) {
        regex.remove(key);
        return super.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> m) {
        m.forEach(this::put);
    }

    @Override
    public void clear() {
        regex.clear();
        super.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    /**
     * No Override<br>
     * Tool private
     */
    // 일치하는 첫번째 값을 가져옴
    private V getVal(String key) {
        for (Map.Entry<String, Matcher> map : regex.entrySet()) {
            if (map.getValue().reset(key).find()) return super.get(map.getKey());
        }
        return null;
    }

    // 정규식에 일치하는 모든 값을 가져옴
    private List<V> getVals(String key) {
        List<V> list = new ArrayList<>();
        for (Map.Entry<String, Matcher> map : regex.entrySet()) {
            if (map.getValue().reset(key).find())
                list.add(super.get(map.getKey()));
        }
        return list;
    }

    // 일치하는 첫번째 Matcher 반환
    private Matcher getMatcher(String key) {
        for (Map.Entry<String, Matcher> map : regex.entrySet()) {
            Matcher matcher = map.getValue().reset(key);
            if (matcher.find()) return matcher.reset();
        }
        return null;
    }

    // 일치하는 모든 Matcher 반환
    private List<Matcher> getMatchers(String key) {
        List<Matcher> list = new ArrayList<>();
        for (Map.Entry<String, Matcher> map : regex.entrySet()) {
            Matcher matcher = map.getValue().reset(key);
            if (matcher.find()) list.add(matcher.reset());
        }
        return list;
    }

    /**
     * No Override<br>
     * can use : public
     */
    // 일치하는 모든 값 반환
    public List<V> gets(Object key) {
        return getVals(key.toString());
    }

    // 일치한느 첫 Matcher 반환
    public Matcher getMatcher(Object key) {
        return getMatcher(key.toString());
    }

    // 일치하는 모든 Matcher 반환
    public List<Matcher> getMatchers(Object key) {
        return getMatchers(key.toString());
    }
}
