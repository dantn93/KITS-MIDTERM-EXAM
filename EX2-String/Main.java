

public class Main{
    public static void main(String[] args) {
        getMiddle str = new getMiddle();
        System.out.println(str.takeMiddle("abc"));
        System.out.println(str.takeMiddle("abcd"));
        System.out.println(str.takeMiddle("abecd"));
        System.out.println(str.takeMiddle("a"));
        System.out.println(str.takeMiddle(""));
    }
}