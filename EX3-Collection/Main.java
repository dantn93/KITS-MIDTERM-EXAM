

public class Main {
    public static void main(String[] args) {
        wordCount wCount = new wordCount();
        System.out.println(wCount.wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"));
        System.out.println(wCount.wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"));
    }
}