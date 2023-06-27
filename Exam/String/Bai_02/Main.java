package Exam.String.Bai_02;

public class Main {
    public static void main(String[] args) {

    }

    public static void takeMiddle(String str) {

        int length = str.length();
        int middle = length / 2;

        if (length > 0) {
            char charAtMiddle = str.charAt(middle);
            System.out.println(charAtMiddle);
        } else if (length == 1) {
            char firstChar = str.charAt(0);
            System.out.println(firstChar);
        } else {
            System.out.println("");
        }
        System.out.println();

    }
}
