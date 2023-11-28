import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        System.out.println(convert(new String[] { }));
    }

    static List<String> convert(String[] strs) {
        return new ArrayList<>(Arrays.asList(strs));
    }
}
