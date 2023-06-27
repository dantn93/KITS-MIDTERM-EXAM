import java.util.*;

public class MidtermExam {
    public static void main(String[] args) {
        //cau 1
        System.out.println(takeHeadAndTail("abc"));
        //
        convert(new String[] { "a", "b", "c" }); // ArrayList { "a", "b", "c" }
        System.out.println( convert(new String[] { "a", "b", "c" }));
        convert(new String[] {}); // ArrayList { "a", "b", "c" }
        System.out.println( convert(new String[] { }));
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));
        swap(strs, 0, 3); // strs: ["d", "b", "c", "a"]
        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
        //Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
        takeOddOnly("xyz"); // ["x", "z"]
        takeOddOnly("abcd"); // ["a", "c"]
        takeOddOnly(""); // []
        //
        wordCounter("I slowly walked, step by step , through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "step"); // 2
        wordCounter("I slowly walked, step by step , through the tranquil forest, feeling the softness of the leaves under my feet and the whispers of the wind through the trees", "the"); // 6
    }

    private static void takeOddOnly(String str) {
        String[] words = str.split("");
        ArrayList<String> list= new ArrayList<>(List.of(words));
        ArrayList<String> listNew= new ArrayList<>();

        for(int i=0;i< list.size();i++){
            if(i%2==0)
            listNew.add(list.get(i));
        }
        System.out.println(listNew);
    }

    //Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    static String [] takeHeadAndTail(String str){
//        List<String> arr=new ArrayList<>(Collections.singleton(str));
        int len= str.length();
        String[] strArr= new String[]{Arrays.toString(str.toCharArray())};
        String[] arr  = new String[2];
        arr[0]=strArr[0];
        arr[1]=strArr[strArr.length-1];
        return new String[]{Arrays.deepToString(arr)};
    }
   // Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
    static List<String> convert(String[] strs){
        List<String> list= new ArrayList<>(List.of(strs));
        return list;

    }
   // Viết hàm swap 2 vị trí trong 1 collection (2d)
   static void swap(List<String> strs, int first, int second){
        String temp="temp";
        temp=strs.get(first);
        strs.set(first,strs.get(second));
       strs.set(second,temp);
       System.out.println(strs);
       //Tạo hàm nhận vào 1 đoạn text và 1 từ, trả về số lần xuất hiện của từ đó (3d)

   }
    static void wordCounter(String text, String word){
        String[] words = text.split("\\s"); // Tách các từ
        // Tạo một HashMap để đếm tần suất xuất hiện của từng từ
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String w : words) {
//            if(w==word)
            wordCountMap.put(w, wordCountMap.getOrDefault(w, 0) + 1);
        }

        // In ra các từ và tần suất xuất hiện của chúng
//        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//            String w = entry.getKey();
//            int frequency = entry.getValue();
//            System.out.println(w+ ": " + frequency);
//        }
        System.out.println(word + wordCountMap.get(word));

    }


//    convert(new String[] { "a", "b", "c" }); // ArrayList { "a", "b", "c" }
//    convert(new String[] {}); // ArrayList { "a", "b", "c" }

//    takeHeadAndTail("abc"); // ["a", "c"]
//    takeHeadAndTail("a"); // ["a", "a"]
//    takeHeadAndTail(""); // ["", ""]
}
