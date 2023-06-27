import java.util.List;

public class swapElement {

    public void swap(List<String> strs, int first, int second) {
        String temp = strs.get(first);

        strs.set(first, strs.get(second));
        strs.set(second, temp);
    }
}
