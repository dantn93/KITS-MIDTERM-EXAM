import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
//          cau 1
//      System.out.println(takeHeadAndTail("abc"));
//          cau 2
//      System.out.println(takeMiddle("abc"));
//          cau3
//      takeOddOnly("abcsda");
//          cau4
//      String[] a = {"a", "b", "c"};
//      System.out.println(convert(a));
//          cau5
//      List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
//      swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
//      System.out.println(strs);
//      swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
//      System.out.println(strs);
    }

    public static String[] takeHeadAndTail(String str) {
        String[] a = str.split(str);
        String[] text = new String[2];
        text[0] = a[0];
        text[1] = a[str.length() - 1];
        return text;
    }

    public static String takeMiddle(String str) {
        String[] value = new String[1];
        int vitri = str.length() / 2;
        String[] a = str.split(str);
        return a[vitri];
    }

    public static String[] takeOddOnly(String str) {
        String[] q = new String[str.length()];
        q = str.split(str);
        System.out.println(q[0]);
        System.out.println(q.length);
        return q;
    }

    public static List<String> convert(String[] strs) {
        List<String> str = new ArrayList<>();
        for (String a : strs) {
            str.add(a);
        }
        return str;
    }

    public static void swap(List<String> strs, int first, int second) {
        String a = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, a);
    }

    public static  int  wordCounter(String text, String word){
        Map<String,Integer> hashmap = new HashMap<>();
        List<String> a= new ArrayList<>();
        return 0;
    }
}
