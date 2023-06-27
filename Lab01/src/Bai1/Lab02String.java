package Bai1;

//Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
public class Lab02String {
    public static void main(String[] args) {
        System.out.println( takeMiddle("abc"));
        System.out.println( takeMiddle("abc"));
        System.out.println( takeMiddle("abcd"));
        System.out.println( takeMiddle("abecd"));
        System.out.println( takeMiddle("a"));
        System.out.println( takeMiddle(""));
    }

   public static char takeMiddle(String str) {
       int length1 = str.length();
       char ch ;
       if (length1 % 2 == 0) {
            ch =  str.charAt(length1 / 2 - 1);
           // Chuỗi có số ký tự là số chẵn
       }
       else {
           // Chuỗi có số ký tự là số lẻ
           ch = str.charAt(length1 / 2);
       }
        return ch;
   }
}
