package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex1 {
    public static void main(String[] args) {
        List<String> result1 = convert(new String[] { "a", "b", "c" });
        System.out.println(result1); // [a, b, c]

        List<String> result2 = convert(new String[] {});
        System.out.println(result2); // []
    }

    public static List<String> convert(String[] strs) {
        List<String> list = new ArrayList<>();

        for (String str : strs) {
            list.add(str);
        }

        return list;
    }
}
