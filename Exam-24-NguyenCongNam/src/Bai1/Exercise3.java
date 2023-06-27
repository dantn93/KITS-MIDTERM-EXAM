package Bai1;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        String content = Arrays.toString(takeOddOnly("xyz"));
        System.out.println(content);
    }
    public static String[] takeOddOnly(String str){
        int length = str.length();
        String[] str4 = new String[length/2];


        for (int i = 1; i< length; i++){
                str4[0] = String.valueOf(str.charAt(0));
                if(i%2 == 0){
                    for (int j = 1; j < length/2; j++){
                        str4[j] = String.valueOf(str.charAt(i));
                    }
            }

        }
        return str4;
    }
}
