package src.Collection;

// Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó

public class Bai3 {
    static int wordCounter(String text, String word) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step")); // 2
        System.out.println(wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the")); // 6
    }

}
