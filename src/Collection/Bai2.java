package src.Collection;

// Viết hàm swap 2 vị trí trong 1 collection

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    static void swap(List<String> strs, int first, int second) {
        String vitri = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, vitri);
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        System.out.println(strs);
        System.out.println();
        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
        System.out.println(strs);
    }
}
