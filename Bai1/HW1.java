package Bai1;

public class HW1 {
    // 1. Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    public String[] takeHeadAndTail(String str){
        String[] a = new String[2];
        if (str.length() == 0 ){
            a[0] = "";
            a[1] = "";
            return a;
        }else{
            a[0] = String.valueOf(str.charAt(0));
            a[1] = String.valueOf(str.charAt(str.length()-1));
        }

        return a;
    }

    // 2. Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
    public String takeMiddle(String str){
        int length = str.length();
        int c =  (int) Math.round(Math.floor(length/2)); 
        
        if (str.length() == 0 ){
            return "";
        }
            
        String results = String.valueOf(str.charAt(c));
        return results;
    }

    // 3. Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    public String[] takeOddOnly(String str){
        String[] results = new String[10];
        if (str.length() == 0 ){
            return results;
        }
        int j = 0;
        for(int i =0; i<str.length(); i++){
            if (i%2 ==0){
                results[j] = String.valueOf(str.charAt(i));
                j++;
            }  
        }
        return results;
    }
}
