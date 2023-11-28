import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(takeOddOnly("")));
    }

    static String[] takeOddOnly(String str) {
        String[] strArr = str.split("");
        int size = str.length();
        String[] arr;
        arr = new String[size/2 + 1];
        if (size % 2 == 0) {
            arr = new String[size/2];
        }
        
        System.out.println(arr.length);
        if (size > 0) {
            arr[0] = strArr[0];
        }
        int count = 0;
        for (int index = 1; index < size; index++) {
            if (index % 2 == 0) {
                count++;
                arr[count] = strArr[index];
            }
        }
        return arr;
    }
}
