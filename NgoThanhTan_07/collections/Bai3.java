package NgoThanhTan_07.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai3 {
    public static int wordCounter(String text, String word) {
        int count = 0;
        ArrayList<String> hashSet = new ArrayList<>(Arrays.asList(text.replace(".", "").replace(",", "").split(" ")));
        System.out.println(hashSet);

        for (String string : hashSet) {
            if (word.equalsIgnoreCase(string)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(wordCounter(
                "I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees",
                "step"));

        System.out.println(wordCounter(
                "I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees",
                "the"));
    }
}
