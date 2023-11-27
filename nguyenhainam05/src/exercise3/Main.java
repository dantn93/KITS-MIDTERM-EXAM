package exercise3;

public class Main {
        /*
        * String[] takeOddOnly(String str);

    takeOddOnly("xyz"); // ["x", "z"]
    takeOddOnly("abcd"); // ["a", "c"]
    takeOddOnly(""); // []
    * */
    public static  String[] takeOddOnly(String str){
        String[] splitString = str.split("");
//        int count = 0;
        String evenString = "";
        for(int i = 0;i<splitString.length;i++){
            if((i+1)%2!=0){
//                count += 1;
                evenString+=splitString[i];
            }
        }
        String[] output = evenString.split("");
        for (String s: output){
            System.out.println("String vi tri le cua" + str +  " la: " + s);
        }
        return output;
    }
    public static void main(String[] args) {
        takeOddOnly("xyz"); // ["x", "z"]
        takeOddOnly("abcd"); // ["a", "c"]
        takeOddOnly(""); // []
    }
}
