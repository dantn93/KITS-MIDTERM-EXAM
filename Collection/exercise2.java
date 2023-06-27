package Collection;

import java.util.ArrayList;
import java.util.List;

public class exercise2 {
    public static void swap(List<String> strs, int first, int second) {

        String temp = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, temp);
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 1, 3);
        System.out.println(strs);
    }
}
