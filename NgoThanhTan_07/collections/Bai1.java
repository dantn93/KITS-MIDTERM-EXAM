package NgoThanhTan_07.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
    public static List<String> convert(String[] strs) {
        List<String> list = new ArrayList<>(Arrays.asList(strs));

        return list;
    }

    public static void print(List<String> list) {
        System.out.print("ArrayList {");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print('"' + list.get(i) + '"' + ", ");
        }
        System.out.print('"' + list.get(list.size() - 1) + '"');
        System.out.print("}");
        System.out.println();
    }

    public static void main(String[] args) {
        print(convert(new String[] { "a", "b", "c" }));
        print(convert(new String[] { "" }));
    }
}
