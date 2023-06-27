import java.util.List;
import java.util.ArrayList;

public class Collection_Exam2 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3);
        System.out.println(strs);

        swap(strs, 1, 2);
        System.out.println(strs);
    }

    public static void swap(List<String> strs, int first, int second) {
        if (first < 0 || second < 0 || first >= strs.size() || second >= strs.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        String temp = strs.get(first);
        strs.set(first, strs.get(second));
        strs.set(second, temp);
    }
}
