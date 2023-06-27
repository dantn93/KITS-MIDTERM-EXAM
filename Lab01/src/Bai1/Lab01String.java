package Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
public class Lab01String {

    public static void main(String[] args) {
        takeHeadAndTail("abc");
        takeHeadAndTail("a");
        takeHeadAndTail("");
    }

    public static String[] takeHeadAndTail(String str){

        String[] arr = new String[2];
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 1) {
                char ch = str.charAt(0);  // Ký tự đầu tiên
                arr[0] = String.valueOf(ch);
                char ch1 = str.charAt(str.length() - 1);  // Ký tự cuối cùng
                arr[1] = String.valueOf(ch1);
            }
        }
        System.out.println("Phần tử đầu tiên là: " +arr[0]);
        System.out.println("Phần tử cuối cùng là: " +arr[1]);
        return arr;
    }
}
