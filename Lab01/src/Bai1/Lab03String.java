package Bai1;
//Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ
public class Lab03String {
    public static void main(String[] args) {
        System.out.println( takeOddOnly("xyz"));
        System.out.println(takeOddOnly("abcd"));
        System.out.println(takeOddOnly(""));

    }

    public static String takeOddOnly(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
