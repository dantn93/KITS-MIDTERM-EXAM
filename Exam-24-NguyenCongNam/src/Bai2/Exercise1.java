package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(convert(new String[]{"a","b","c"}));
    }

    public static List<String> convert(String[] strs){
        return new ArrayList<>(List.of(strs));
    }
}
