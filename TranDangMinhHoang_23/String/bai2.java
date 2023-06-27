package String;

public class bai2 {
    public static void main(String[] args) {
        System.out.println(takeMiddle("abc"));
    }

    public static String takeMiddle(String str){
        String[] input = str.split("");
        int index = input.length / 2;
        return input[index];
    }

}
