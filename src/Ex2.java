public class Ex2 {
    public static void main(String[] args) {
        System.out.println(takeMiddle("abcde"));
    }

    static String takeMiddle(String str) {
        if (str.length() == 0) {
            return "";
        }
        int midle = (int)Math.floor((str.length() / 2));
        String strMidle= str.charAt(midle) + "";
        return strMidle;
    }
}
