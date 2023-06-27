package exercise2;

public class Main {
    /*
    * String takeMiddle(String str);

takeMiddle("abc"); // "b"
takeMiddle("abcd"); // "c"
takeMiddle("abecd"); // "e"
takeMiddle("a"); // "a"
takeMiddle(""); // ""*/
    public static  String takeMiddle(String str){
        String[] splitString = str.split("");
        String middleValue = splitString[Math.round(str.length()/2)];
        System.out.println("Middle String is: " + middleValue);
        return middleValue;
    }
    public static void main(String[] args) {
        takeMiddle("abc"); // "b"
        takeMiddle("abcd"); // "c"
        takeMiddle("abecd"); // "e"
        takeMiddle("a"); // "a"
        takeMiddle(""); // ""
    }
}
