import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[] s = takeHeadAndTail("a");
//        for(int i = 0; i < s.length; i++) {
//            System.out.print(s[i] + " ");
//        }


//        System.out.println(takeMiddle("abc"));

        String[] s = takeOddOnly("xyz");
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

//        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
//        swap(strs, 0, 3);
    }

    static String[] takeHeadAndTail(String str) {
       String head;
       String tail;

        if(str.length() == 0) {
            head = "";
            tail = "";
        }else {
            head = String.valueOf(str.charAt(0));
            tail = String.valueOf(str.charAt(str.length() - 1));
        }
        return new String[] {head, tail};
    }

    static String takeMiddle(String str) {
        String s;
        if(str.length() == 0) {
            s = "";
        }else{
            int index = str.length() / 2;
            s = String.valueOf(str.charAt(index));
        }
        return s;
    }
    static List<String> convert(String[] strs) {
        List<String> list = Arrays.asList(strs);
        return list;
    }

    static void swap(List<String> strs, int first, int second) {
        Collections.swap(strs, first, second);
        for(int i = 0; i < strs.size(); i++) {
            System.out.print(strs.get(i) + " ");
        }
    }
    static String[] takeOddOnly(String str) {

        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(((i + 1) % 2) != 0) {
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        String[] s = list.toArray(new String[0]);
        return s;
    }

    static int wordCounter(String text, String word) {
        Map<String, Integer> map = new HashMap<>();

        List<String> list = Arrays.asList(text.split(" "));

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                if(map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                }else {
                    map.put(word, 1);
                }
            }
        }
        return map.get(word);
    }
}