
public class Ex3 {
    // Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó (3d)
    public static void main(String[] args) {
        // wordCounter("I slowly walked, step by step, through the tranquil forest,
        // feeling the softness of the leaves under my feet and the whispers of the wind
        // through the trees", "step"); // 2
        // wordCounter("I slowly walked, step by step, through the tranquil forest,
        // feeling the softness of the leaves under my feet and the whispers of the wind
        // through the trees", "the"); // 6

    }

    public static int wordCounter(String text, String word) {
        int count = 0;
        String[] words = text.split("[^a-zA-Z0-9']");

        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }

}
