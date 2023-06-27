//Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
package String;
import java.util.Scanner;
public class Ex2{
    public static void main(String[] args) {
    String chuoi;
    char kyTugiua;
    char kyTucuoi;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao chuoi bat ky: ");
    chuoi = scanner.nextLine();
         
    System.out.println("Ky tu giua trong mang la: ");

        int i= chuoi.length()/2;
        kyTugiua = chuoi.charAt(i);
        System.out.print(kyTugiua);
    }
}

