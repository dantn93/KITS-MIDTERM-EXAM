public class getOdd {
    public String[] takeOddOnly(String str) {
        String[] splitString = str.split("");
        String[] result = new String[(str.length() % 2 != 0) ? str.length() / 2 + 1 : str.length() / 2];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result[j] = splitString[i];
                j++;
            }
        }
        return result;
    }
}
