class Main {
    public static void main(String[] args) {
        BT bt = new BT();
        
        String[] bt1 = bt.takeHeadAndTail("abc");
        for(String s : bt1)
            System.out.print(s + " ");
        System.out.println();

        System.out.println("BT2: " + bt.takeMiddle(""));

        String[] bt3 = bt.takeOddOnly("");
        System.out.println("BT1.3");
        for(String s : bt3)
            System.out.print(s + " ");
        System.out.println();

        System.out.println("==== Bai 2 ====");
        System.out.println(bt.convert(new String[] { "a", "b", "c" }));
        System.out.println(bt.wordCounter("I slowly walked, step by step, through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"));

    }
}