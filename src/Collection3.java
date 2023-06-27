public class Collection3 {
    public static void main(String[] args) {
        System.out.println(wordCounter(
                "I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees",
                "step"));
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"));
    }

    static int wordCounter(String text, String word) {
        // String[] strList = text.split("\\W+");
        String str1 = text.replace(",", "");
        String str2 = str1.replace(".", "");
        String[] strList = str2.split(" ");
        int size = strList.length;
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (strList[index].equals(word)) {
                count = count + 1;
            }
        }
        return count;
    }
}
