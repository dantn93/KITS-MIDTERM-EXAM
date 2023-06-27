package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a","b","c","d"));
        swap(strs, 0,3);
    }

    public static void swap(List<String> strs, int first, int second){
        String ob = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, ob);
        System.out.println(strs);
    }
}
