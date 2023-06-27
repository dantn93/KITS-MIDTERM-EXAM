public class Collection_exe3 {
    public static void main(String[] args) {
        String text = "I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees";
        String word1 = "step";
        String word2 = "the";

        int count1 = wordCounter(text, word1);
        System.out.println("Occurrences of"  + word1 + ":"  + count1);

        int count2 = wordCounter(text, word2);
        System.out.println("Occurrences of" + word2 + ":" + count2);
    }

    public static int wordCounter(String text, String word) {
        int count = 0;
        String[] words = text.split("\\W+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}
