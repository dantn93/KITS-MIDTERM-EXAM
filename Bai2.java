import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        // Bai 2: 1/
        System.out.println("convert:");
        System.out.println(convert(new String[] { "a","b" }));
    }
    public static List<String> convert (String[] strs) {
        List<String> list = new ArrayList<>();
        for (String str:strs) {
            list.add(str);
        }
        return list;
    }
    public static void swap(List<String> strs,int first,int second) {
        String temp="";
        temp = strs.get(first);
    }
}
