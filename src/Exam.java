import java.util.*;

public class Exam {
    public static void main(String[] args) {
        //Ex1 String
        takeHeadAndTail("abc");

        //Ex2 String
        takeMiddle("");

        //Ex3 String
        takeOddOnly("xyz");

        //Ex1 Collection
        convertToListString(new String[] {"a", "b", "c"});

        //Ex2 Collection
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swapTwoIndexOfList(strs,1,2);

        //Ex3 Collection
        wordCounter("I slowly walked, step by step, through the tranquil forest, " +
                "feeling the softness of " +
                "the leaves under my feet and the whispers of the wind through the trees","the");

    }

    public static String[] takeHeadAndTail(String str) {
        System.out.println("\nEx1 String:");
        String[] parts = new String[2];

        if (str == null || str.length() == 0) {
            return parts;
        }

        parts[0] = str.substring(0, 1);
        parts[1] = str.substring(str.length() - 1);

        System.out.println("Head: "+parts[0]);
        System.out.println("Tail: "+parts[1]);
        return parts;

    }

    public static void takeMiddle(String str) {
        System.out.println("\nEx2 String:");
        if (str == null || str.length() == 0) {
            return ;
        }

        double middle = (double) str.length() / 2;
        if(middle %2 == 0) {
            middle++;
            System.out.println(str.charAt((int)middle-1));
        } else {
            middle = middle -0.5;
            System.out.println(str.charAt((int)middle));
        }
    }

    public static String[] takeOddOnly(String str) {
        System.out.println("\nEx3 String:");
        String[] parts = new String[str.length()];

        for (int i = 0; i < str.length();i++) {
            if (i % 2 == 0) {
                parts[i] = String.valueOf(str.charAt(i));
                System.out.println(str.charAt(i));
            }
        }

        return parts;
    }

    public static void convertToListString(String[] str) {
        System.out.println("\nEx1 Collection:");
        List<String> list = new ArrayList<>(List.of(str));
        for (String s : list) {
            System.out.print(s + " ");
        }

    }

    public static void swapTwoIndexOfList(List<String> strs, int first, int second) {
        System.out.println("\nEx2 Collection:");
        String temp = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, temp);
        System.out.println(strs);
    }

    public static void wordCounter(String p , String wordToFind){
        TreeMap<String,Integer> map = new TreeMap<>();
        p = p.replaceAll("\\p{P}", ""); // replace all punctuations
        p = p.toLowerCase(); // turn all words into lowercase
        String[] words = p.split(" ");
        // Collect the word count
        for (String word : words) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        System.out.println("\nEx3 ");
        System.out.println("Find '"+wordToFind+ "' in text: " + map.get(wordToFind)+ " time(s)");

//        System.out.println("Counting on string '"+ check+ "' in paragraph is: " + map.get(check));
    }



}
