import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    // Viết hàm swap 2 vị trí trong 1 collection (2d)
    public static void main(String[] args) {
        // List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        // swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        // swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]

    }

    public static void swap(List<String> strs, int first, int second) {
        String temp = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, temp);
    }

}
