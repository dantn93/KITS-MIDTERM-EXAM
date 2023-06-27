public class getMiddle{
    public String takeMiddle(String str) {
        String result = "";
        String[] splitString = str.split("");
        result = splitString[str.length()/2];
        return result;
    }
}