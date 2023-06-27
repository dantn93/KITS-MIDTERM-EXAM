import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        swapElement swap = new swapElement();
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        System.out.println("Before swap: " + strs);
        swap.swap(strs, 0, 3);
        System.out.println("After swap 0 and 3: " + strs);
        swap.swap(strs, 1, 2);
        System.out.println("After swap 1 and 2: " + strs);

    }
}