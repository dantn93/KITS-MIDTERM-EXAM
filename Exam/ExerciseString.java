

import java.util.Arrays;

public class ExerciseString{
    public static void main(String[] args) {
        System.out.println("Result Q1: ");
        System.out.println(Arrays.toString(takeHeadAndTail("abc"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeHeadAndTail("a"))); // ["a", "a"]
        System.out.println(Arrays.toString(takeHeadAndTail(""))); // ["", ""]
        System.out.println("Result Q2: ");
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abecd")); // "e"
        System.out.println(takeMiddle("a")); // "a"
        System.out.println(takeMiddle("")); // ""
        System.out.println("Result Q3: ");
        System.out.println(Arrays.toString(takeOddOnly("xyz"))); // ["x", "z"]
        System.out.println(Arrays.toString(takeOddOnly("abcd"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeOddOnly(""))); // []
    }
    //1.Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuố
    static String[] takeHeadAndTail(String str){
        String[] arr = str.split("");
        String[] rs = {arr[0] , arr[arr.length - 1]};
        return rs;
    }
    //2.Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa
    static String takeMiddle(String str){
        int size = str.length();
        if (size % 2 != 0) {
            return Character.toString(str.charAt(size / 2));
        } else {
            return "";
        }
    }
    //3.Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ 
    static String[] takeOddOnly(String str){
         if (str == null) {
            return new String[0];
        }

        int length = (str.length() + 1) / 2;
        String[] oddStr = new String[length];
        for (int i = 0; i < length; i++) {
            oddStr[i] = String.valueOf(str.charAt(i * 2));
        }
        return oddStr;
    }
}