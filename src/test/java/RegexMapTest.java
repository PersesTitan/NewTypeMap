public class RegexMapTest {
    public static void main(String[] args) {
        RegexMap<Integer> regexMap = new RegexMap<>();
        regexMap.put("[0-9]+", 1);
        regexMap.put("[0-9]", 2);
        regexMap.put("[0-9]{1,2}", 3);
        regexMap.put("[0-9]{1,3}", 4);
        regexMap.put("\\s", 5);

        System.out.println(regexMap.get("0"));
        System.out.println(regexMap.gets("0"));
        System.out.println(regexMap.get("안녕 "));
        System.out.println(regexMap.get(""));
    }
}
