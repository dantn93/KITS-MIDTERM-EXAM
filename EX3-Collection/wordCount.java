import java.util.Arrays;

public class wordCount {
    public int wordCounter(String text, String word) {
        int result = 0;
        String[] splitText = text.split("\\W+");
        for (String string : splitText) {
            if (string == word) {
                result++;
            }
        }
        System.out.println(Arrays.toString(splitText));
        return result;
    }
}
