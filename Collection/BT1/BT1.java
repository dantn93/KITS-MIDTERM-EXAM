package Collection.BT1;

import java.util.ArrayList;
import java.util.List;

public class BT1 {
    public static void main(String[] args) {
        convert(new String[] { "a", "b", "c" });
        convert(new String[] {});
    }

    public static List<String> convert(String[] arr) {
        List<String> result = new ArrayList<>();
        for(String array: arr){
            result.add(array);
        }
        System.out.println(result);
        return result;
    }
}
