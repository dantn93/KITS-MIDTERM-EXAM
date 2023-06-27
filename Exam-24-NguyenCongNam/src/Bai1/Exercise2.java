package Bai1;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String a = Arrays.toString(takeMiddle("abed"));
        System.out.println(a);
    }

    public static String[] takeMiddle(String str){
        String[] str3 = new String[1];
        int length = str.length();
        if(str.equals("")){
            str3[0] = "";
        }else {
            str3[0] = String.valueOf(str.charAt((length/2)));
        }
        return str3;
    }
}
