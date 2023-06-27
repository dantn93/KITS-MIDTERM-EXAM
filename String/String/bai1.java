package String;

import java.util.Arrays;

public class bai1{
    public static void main (String[] args){
        String takeHeadAndTail1 = ("abc");
        String takeHeadAndTail2 = ("a");
        String takeHeadAndTail3 = ("");

        char[] result1= HeadTailChar(takeHeadAndTail1);
        System.out.println(Arrays.toString(result1));

        char[] result2= HeadTailChar(takeHeadAndTail2);
        System.out.println(Arrays.toString(result2));

        char[] result3= HeadTailChar(takeHeadAndTail3);
        System.out.println(Arrays.toString(result3));
    }
    public static char[] HeadTailChar (String str ){
        char result[] = new char[2];
        result[0]= str.charAt(0);
        result[1]=str.charAt(str.length()-1);
        return result;
    }
}