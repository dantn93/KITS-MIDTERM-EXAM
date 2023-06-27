package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HW2 hw = new HW2();

        // bai1
        String[] strs = {"1", "2", "3"};
        List<String> r1 = hw.convert(strs);
        System.out.println(r1);

        // bai 2
        List<String> str_2 = new ArrayList<>(List.of("a", "b", "c", "d"));
        hw.swap(str_2, 0, 3);
        hw.swap(str_2, 1, 2);
        System.out.println(str_2);

        // Bai 3
        int r3 = hw.wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"); // 2
        int r3_1 = hw.wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"); // 6
        System.out.println(r3);
        System.out.println(r3_1);
    }
}
