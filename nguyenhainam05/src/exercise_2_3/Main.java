package exercise_2_3;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static int wordCounter(String text, String word){
        HashMap<String, Integer> numberString = new HashMap<String,Integer>();
        String textReplace = text.replaceAll(",", "");
        List<String> splitString = List.of(textReplace.split(" "));
        for(String s: splitString){
            if(numberString.containsKey(s)){
                numberString.put(s,numberString.get(s)+1);
            }
            else {
                numberString.put(s,1);
            }
        }
        int output = numberString.get(word);
        System.out.println("Ket qua cua: " + word + " la: " +output);
        return output;

    }
    public static void main(String[] args) {
        wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step");
        wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the");
//        System.out.println(a.replaceAll(",",""));
    }
}
