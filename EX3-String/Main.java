import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        getOdd str = new getOdd();
        System.out.println(Arrays.toString((str.takeOddOnly("xyz"))));
        System.out.println(Arrays.toString((str.takeOddOnly("abcd"))));
        System.out.println(Arrays.toString((str.takeOddOnly("abcgfhfsgteed"))));
        System.out.println(Arrays.toString((str.takeOddOnly("abcgfhfsgteaed"))));
        System.out.println(Arrays.toString((str.takeOddOnly(""))));
    }
}