package Java_exam;

import java.util.Arrays;

public class Main {
public static void main(String []args){
    // test case bai 1
    String[] result = takeHeadAndTail("");
    // ["a", "a"]
    System.out.println(Arrays.toString(result));
    // test case bai 3
    String [] result3 = takeOddOnly("abc");
    System.out.println(Arrays.toString(result3));
    }
   //bai1
    public static String[] takeHeadAndTail(String str){
        if (str.length() == 0) {
            return new String[]{"", ""};
        } else {
            char head = str.charAt(0);
            char tail = str.charAt(str.length() - 1);
            return new String[]{Character.toString(head), Character.toString(tail)};
        }
    }
    //bai3
    public static String takeOddOnly(String str){
        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i)%2==0){

            }
        }
        return takeOddOnly(str);
    }
}
