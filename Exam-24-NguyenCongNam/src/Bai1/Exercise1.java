package Bai1;

import java.util.Arrays;
import java.util.Objects;

public class Exercise1 {
    public static void main(String[] args) {
        String[] a = takeHeadAndTail("");
        System.out.println(Arrays.toString(a));
    }
    public static String[] takeHeadAndTail(String str){
        String[] str2 = new String[2];
        if(Objects.equals(str, "")){
            str2[0] = "";
            str2[1] = "";
        }else{
            int lenght = str.length();
            str2[0] = String.valueOf(str.charAt(0));
            str2[1] = String.valueOf(str.charAt(lenght-1));
        }
        return str2;
    }
}
