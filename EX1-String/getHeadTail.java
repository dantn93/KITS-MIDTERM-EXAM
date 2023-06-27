public class getHeadTail {
    public String[] takeHeadAndTail(String str) {
        String[] result = new String[2];
        String[] splitStr = str.split("");
        if (str.length() == 1 || str.length() == 0) {
            result[0] = splitStr[0];
            result[1] = splitStr[0];
        } else {
            result[0] = splitStr[0];
            result[1] = splitStr[str.length()-1];
        }

        return result;
    }
}