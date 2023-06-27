package Bai1;

public class Main {
    public static void main(String[] args) {
        HW1 hw = new HW1();

        String str = "abc";
        String str2 = "a";
        String str3 = "";

        // bai 1
        String[] a1 = hw.takeHeadAndTail(str);
        for (String a : a1){
            System.out.println(a);
        }
        System.out.println("=============");
        String[] a2 = hw.takeHeadAndTail(str2);
        for (String a : a2){
            System.out.println(a);
        }

        System.out.println("=============");
        String[] a3 = hw.takeHeadAndTail(str3);
        for (String a : a3){
            System.out.println(a);
        }


        // Bai 2
        String r2 = hw.takeMiddle("abc");
        String r2_2 = hw.takeMiddle("abcd");
        String r2_3 = hw.takeMiddle("abecd");
        String r2_4 = hw.takeMiddle("a");
        String r2_5 = hw.takeMiddle("");

        System.out.println("r2: "+ r2);
        System.out.println("r2_2: "+ r2_2);
        System.out.println("r2_3: "+ r2_3);
        System.out.println("r2_4: "+ r2_4);
        System.out.println("r2_5: "+ r2_5);

        // Bai 3
        System.out.println("Bai 3 ----------------");
        String[] r3_1 = hw.takeOddOnly("xyz");
        String[] r3_2 = hw.takeOddOnly("abcd");
        String[] r3_3 = hw.takeOddOnly("");
        for (String a : r3_3){
            System.out.println(a);
        }
    }
}
