package Lab01;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static String[] takeOddOnly(String str) {
        List<String> oddChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i += 2) {
            oddChars.add(String.valueOf(str.charAt(i)));
        }
        return oddChars.toArray(new String[0]);
    }

    public static void main(String[] args) {

        System.out.println(takeOddOnly("xyz")); // ["x", "z"]
        System.out.println(takeOddOnly("abcd")); // ["a", "c"]
        System.out.println(takeOddOnly("")); // []

    }

}
