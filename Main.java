import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("String ");
        System.out.println("Cau 1 String ");
        System.out.println(Arrays.toString(takeHeadAndTail("abc"))); // ["a", "c"]
        System.out.println(Arrays.toString(takeHeadAndTail("a"))); // ["a", "a"]
        System.out.println(Arrays.toString(takeHeadAndTail(""))); // ["", ""]

        System.out.println("cau 2 String");
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abecd"));
        System.out.println(takeMiddle("a"));
        System.out.println(takeMiddle(""));

        System.out.println("cau 3 String");
        System.out.println(Arrays.toString(takeOddOnly("xyz")));
        System.out.println(Arrays.toString(takeOddOnly("abcd")));
        System.out.println(Arrays.toString(takeOddOnly("abcdefgh")));
        System.out.println(Arrays.toString(takeOddOnly("")));



        System.out.println("Collection");
        System.out.println("cau1 Collection");


        System.out.println(   convert(new String[] { "a", "b", "c" }));
        System.out.println( convert(new String[] {}));

        System.out.println("cau 2 Collection");
        ArrayList<String> strs  = new ArrayList<>(List.of("a", "b", "c", "d"));
        System.out.println("Original list: " + strs);
        swap(strs , 0, 3);
        System.out.println("List after swapping elements: " + strs);
        swap(strs, 1, 2);
        System.out.println("List after swapping elements: " + strs);
    }



    public static String[] takeHeadAndTail(String str) {
        if (str.length() == 0) {
            return new String[]{"" , ""};
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            return new String[]{Character.toString(firstChar), Character.toString(lastChar)};
        }
    }

    public static  String takeMiddle(String str){
        int size = str.length();
        if (size % 2 != 0) {
            return Character.toString(str.charAt(size / 2));
        } else {
            return "";
        }
    }


    public static String[] takeOddOnly(String str) {
        if (str == null) {
            return new String[0];
        }

        int length = (str.length() + 1) / 2;
        String[] oddChars = new String[length];
        for (int i = 0; i < length; i++) {
            oddChars[i] = String.valueOf(str.charAt(i * 2));
        }
        return oddChars;
    }

    public static List<String> convert(String[] strs) {
        List<String> list = new ArrayList<>();

        for (String c : strs) {
            list.add(String.valueOf(c));
        }

        return list;
    }

    public static void swap(List<String> strs, int first, int second){
        Collections.swap(strs, first, second);
    }
}
