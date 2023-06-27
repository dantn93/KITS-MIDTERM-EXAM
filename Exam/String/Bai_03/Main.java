package Exam.String.Bai_03;

public class Main {
    public static void main(String[] args) {

    }

    String[] takeOddOnly(String str) {
        // String result[] =

        for (int i = 0; i <= str.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(str[i]);
            }
        }

        return 1;
    }

}
