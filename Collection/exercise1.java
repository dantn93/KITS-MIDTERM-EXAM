package Collection;

import java.util.ArrayList;
import java.util.List;

public class exercise1 {
    public static void main(String[] args) {
        List<String> convert = new ArrayList<>(List.of("a", "b", "C"));
        ArrayList<String> arrayList = new ArrayList<>(convert);
        System.out.println(arrayList);
    }

}
