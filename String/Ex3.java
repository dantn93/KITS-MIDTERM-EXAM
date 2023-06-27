//Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
package String;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String chuoi;
        char kyTudau;
        char kyTucuoi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();

        System.out.println("Ky tu o vi tri le trong mang la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            if(i%2==0){
                System.out.print(chuoi.charAt(i)+" ");

            }
        }
    }
}
