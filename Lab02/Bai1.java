package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static List<String> convert(String[] strs){
        List<String>result=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            result.add(strs[i]);
        }
       
        return result;

    }
    public static void main(String[] args) {
        System.out.println( convert(new String[] { "a", "b", "c" }));
        // ArrayList { "a", "b", "c" }
        System.out.println(convert(new String[] {}));
         // ArrayList { "a", "b", "c" }
        
    }
    
}
