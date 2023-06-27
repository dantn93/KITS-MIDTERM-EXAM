package String;

public class bai3 {
    public static void main(String[] args) {
         System.out.println(takeOddOnly("null"));
    }
    
    public static String[] takeOddOnly(String str) {
        String[] input = str.split("");
        int size;
        if (input.length % 2 == 0) {
            size = input.length / 2;
        } else {
            size = input.length / 2 + 1;
        }
        String[] arr = new String[size];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                arr[index] = input[i];
                index++;
            }
        }
        return arr;
    }
}
