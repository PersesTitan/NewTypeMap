import java.util.*;

public class ContainsMap<V>  extends HashMap<String, V> {

    @Override
    public boolean containsKey(Object key) {
        return getVal(key.toString()) != null;
    }

    @Override
    public V get(Object key) {
        return getVal(key.toString());
    }

    @Override
    public V remove(Object key) {
        String k = key.toString();
        for (Entry<String, V> entry : super.entrySet()) {
            if (entry.getKey().contains(k)) return entry.getValue();
        }
        return null;
    }

    /**
     * No Override<br>
     * can use : private
     */
    private V getVal(String key) {
        for (Entry<String, V> entry : super.entrySet()) {
            if (entry.getKey().contains(key)) return entry.getValue();
        }
        return null;
    }

    /**
     * No Override<br>
     * can use : public
     */
    public List<V> gets(Object key) {
        String k = key.toString();
        List<V> list = new ArrayList<>();
        for (Entry<String, V> entry : super.entrySet()) {
            if (entry.getKey().contains(k)) list.add(entry.getValue());
        }
        return list;
    }

    public List<V> removes(Object key) {
        String k = key.toString();
        List<V> list = new ArrayList<>();
        for (Entry<String, V> entry : super.entrySet()) {
            if (entry.getKey().contains(k)) {
                list.add(super.remove(entry.getValue()));
            }
        }
        return list;
    }
}
