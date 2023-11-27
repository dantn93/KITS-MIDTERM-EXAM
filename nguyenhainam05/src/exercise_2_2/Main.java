package exercise_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    * void swap(List<String> strs, int first, int second);

List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
    * */
    public  static  void swap(List<String> strs, int first, int second){
        Collections.swap(strs,first,second);
        System.out.println(strs);
    }
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
    }
}
