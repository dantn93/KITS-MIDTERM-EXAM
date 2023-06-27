package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Viết hàm swap 2 vị trí trong 1 collection (2d)
public class Lab02 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(List.of("a", "b", "c", "d"));

        swap(strs, 1, 2); // strs: ["d", "c", "b", "a"]
    }

    public static void swap(List<String> strs, int first, int second){
        Collections.swap(strs, first, second);
    }
}
