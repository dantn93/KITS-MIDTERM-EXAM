import java.util.ArrayList;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3);
        swap(strs, 1, 2);
    }

    static void swap(List<String> strs, int first, int second) {
        String a = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, a);
        System.out.println(strs);
    }
}
