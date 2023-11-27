package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    * String[] takeHeadAndTail(String str);

takeHeadAndTail("abc"); // ["a", "c"]
takeHeadAndTail("a"); // ["a", "a"]
takeHeadAndTail(""); // ["", ""]*/
    public static String[] takeHeadAndTail(String str){
        String[] output = new String[2];
        String[] splitString = str.split("");
        for(int i = 0; i<splitString.length;i++){
            if(i==0 ){
                output[0] = splitString[i];
            }
            if(i == splitString.length-1){
                output[1] = splitString[i];
            }
        }
        for (String s: output){
            System.out.println("Ket qua cua: " + str + " la: " + s);
        }
        return output;
    }
    public static void main(String[] args) {
        takeHeadAndTail("abc"); // ["a", "c"]
        takeHeadAndTail("a"); // ["a", "a"]
        takeHeadAndTail("");
    }
}
