import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        getHeadTail str = new getHeadTail();
        System.out.println(Arrays.toString((str.takeHeadAndTail("abc"))));
        System.out.println(Arrays.toString((str.takeHeadAndTail("a"))));
        System.out.println(Arrays.toString((str.takeHeadAndTail(""))));
    }
}