public class Bai1 {
    public static void main(String[] args) {
        // Bai 1: 1/
        String[] arr = takeHeadAndTail("a");
        System.out.println("lay dau cuoi");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Bai 1: 2/
        System.out.println("Lay giua");
        System.out.println(takeMiddle("abc"));

        //Bai 1: 3/
        String[] arr3 = takeOdd("xyz");
        System.out.println("lay vi tri le");
        for (int i=0;i< arr3.length;i++) {
            System.out.print(arr3[i]+" ");
        }
    }
    public static String[] takeHeadAndTail(String str) {
        String[] strToTake = new String[2];
        strToTake[0]="";
        strToTake[1]="";
        String[] convertStr = str.split("");
        if (str.length()==0){
            return strToTake;
        }
        strToTake[0] = convertStr[0];
        strToTake[1] = convertStr[convertStr.length-1];
        return strToTake;
    }
    public static String takeMiddle(String str) {
        int len = str.length();
        int index = len/2;
        String afterTake = "";
        if (len==0) {
            afterTake="";
            return afterTake;
        }
         afterTake = str.substring(index,index+1);
        return afterTake;
    }
    public static String[] takeOdd(String str) {
        String[] take = new String[(int) Math.ceil((double)(str.length())/2) ];
        int count=0;
        if (str.length()==0){
            return take;
        }
        for (int i=0;i<str.length();i++) {
            if (i%2==0) {
                take[count] = str.substring(i,i+1);
                count++;
            }
        }
        return take;
    }
}
