import java.util.HashMap;
import java.util.Map;

public class UniqueMapTest {
    public static void main(String[] args) {
        UniqueMap<String, String> unique = new UniqueMap<>();
        unique.put("a", "1");
        unique.put("b", "2");
        unique.put("c", "1");
        System.out.println(unique);
    }
}
