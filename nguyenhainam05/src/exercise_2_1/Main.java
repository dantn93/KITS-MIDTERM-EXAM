package exercise_2_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    * List<String> convert(String[] strs);

convert(new String[] { "a", "b", "c" }); // ArrayList { "a", "b", "c" }
convert(new String[] {}); // ArrayList { "a", "b", "c" }*/
    public  static  List<String> convert(String[] strs){
        List<String> output = new ArrayList<>();
        for(String s: strs){
            output.add(s);
        }
        System.out.println("ket qua: " + output);
        return output;
    }
    public static void main(String[] args) {
        convert(new String[] { "a", "b", "c" });
        convert(new String[] {});
    }
}
