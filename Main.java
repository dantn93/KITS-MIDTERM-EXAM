package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Test case String 1:
        String[] s = takeHeadAndTail("");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        //Test case String 2:
        System.out.println(takeMiddle(""));

        //Test case String 3:
        String[] s3 = takeOddOnly("");
        for (int i = 0; i < s3.length; i++) {
            System.out.println(s3[i]);
        }

        //Test case Collection 1:
        String[] strings = new String[]{"a", "bc"};
        List<String> list = convert(strings);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Test case Collection 2:
        List<String> sc2 = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(sc2, 0, 3);


        //Test case Collection 3:
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"));
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"));
    }

    //String 1:
    public static String[] takeHeadAndTail(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        } else {
            String[] strings = new String[2];
            strings[0] = String.valueOf(str.charAt(0));
            strings[1] = String.valueOf(str.charAt(str.length() - 1));
            return strings;
        }
    }

    //String 2:
    public static String takeMiddle(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            int middle = str.length() / 2 + 1 - 1;
            return String.valueOf(str.charAt(middle));
        }
    }

    //String 3:
    public static String[] takeOddOnly(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        } else {
            int numberOfOdd = ((str.length() % 2 == 0) ? str.length() / 2 : str.length() / 2 + 1);
            System.out.println(numberOfOdd);
            String[] strings = new String[numberOfOdd];
            int index = 0;
            for (int i = 0; i < str.length(); i += 2) {
                strings[index] = String.valueOf(str.charAt(i));
                index++;
            }
            return strings;
        }
    }

    //Collection 1:
    public static List<String> convert(String[] strs) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            strings.add(strs[i]);
        }
        return strings;
    }

    //Collection 2:
    public static void swap(List<String> strs, int first, int second){
        if (strs.size() == 0) {
            System.out.println("String is empty!");
            return;
        }
        else {
            if (strs.size() < first || strs.size() < second) {
                System.out.println("First and Second must smaller than String Size");
                return;
            }
            else {
                String temp;
                temp = strs.get(first);
                strs.set(first, strs.get(second));
                strs.set(second, temp);
            }
        }

    }

    //Collection 3:
    public static int wordCounter(String text, String word){
        int counter = 0;
        text = text.replaceAll(",", "");
        System.out.println(text);
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(word)) {
                counter++;
            }
        }
        return counter;
    }

}