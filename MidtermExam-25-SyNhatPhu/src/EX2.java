import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX2 {

    public static List<String> convert(String[] strs) {
        List<String> list = new ArrayList<>(List.of(strs));
        return list;
    }

    public static void main(String[] args) {
//        System.out.println( wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"));
//        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"));
        List<String> arr = new ArrayList<String>(List.of("a", "b", "c"));
        swap(arr, -1, 2);//position start from 1
        System.out.println(arr);
    }

    public static void swap(List<String> strs, int first, int second) {
        if (first > 0 && second > 0 && first <= strs.size() && second <= strs.size()) {
            first -= 1; //index
            second -= 1;
            String temp = strs.get(first);
            strs.set(first, strs.get(second));
            strs.set(second, temp);
        } else {
            System.out.println("index cannot long over list size or negative");
        }
    }

    public static int wordCounter(String text, String word) {
        String[] texts = text.split("\\s+");
        int count = 0;
        for (String s : texts) {
            String txt = s.toLowerCase().replace(",", "");
            if (word.equalsIgnoreCase(txt)) {
                count++;
            }
        }
        return count;
    }
}
