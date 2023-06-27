package NgoThanhTan_07.collections;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void swap(List<String> strs, int first, int second) {
        String temp = "";
        try {
            temp = strs.get(first);
            strs.set(first, strs.get(second));
            strs.set(second, temp);
        } catch (Exception e) {
            System.out.println("first >= 0 and first <" + strs.size());
            System.out.println("second >= 0 and second <" + strs.size());
        }
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3);
        System.out.println(strs);
        swap(strs, 1, 2);
        System.out.println(strs);
    }
}
