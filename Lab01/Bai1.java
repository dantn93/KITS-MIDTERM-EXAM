package Lab01;

public class Bai1 {
    public static String[] takeHeadAndTail(String str) {

        String[] result = new String[2];
        result[0] = str.substring(0, 1);
        result[1] = str.substring(str.length() - 1);
        return result;

    }

    public static void main(String[] args) {
       System.out.println(takeHeadAndTail("abc")); ; // ["a", "c"]
       System.out.println(takeHeadAndTail("a") ); // ["a", "a"]
       System.out.println( takeHeadAndTail(""));// ["", ""]

    }

}
