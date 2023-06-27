//Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
package String;
import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
    String chuoi;
    char kyTudau;
    char kyTucuoi;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao chuoi bat ky: ");
    chuoi = scanner.nextLine();
         
    System.out.println("Ky tu dau va cuoi trong mang la: ");
    //for (int i = 0; i < chuoi.length(); i++) {
        int i= chuoi.length();
        kyTudau = chuoi.charAt(0);
        kyTucuoi = chuoi.charAt(i-1);
        System.out.print(kyTudau);
        System.out.print(" "+kyTucuoi);
    }
}

