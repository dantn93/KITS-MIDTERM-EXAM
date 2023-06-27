public class Exercise1 {
    // 1. Viết hàm nhận vào 1 chuỗi và trả về mảng có chứa ký tự đầu mà cuối (1d)
    String[] takeHeadAndTail(String str) {
        String[] arr = str.split("");
        String[] result = new String[0];

        result[0] = arr[0];
        result[1] = arr[arr.length - 1];

        return result;
    }

    // 2. Viết hàm nhận vào 1 chuỗi và trả về ký tự ở giữa (1d)
     String takeMiddle(String str){
        String[] arr = str.split("");

        int position = Math.abs((arr.length-1) / 2);

        if(str.length() % 2 == 0) {
            position += 1;
        }

        return arr[position];
    }

    // 3. Viết hàm nhận vào 1 chuỗi trả về chuỗi chỉ có các ký tự ở vị trí lẻ (2d)
    String[] takeOddOnly(String str) {
        String[] arr = str.split("");
        String[] result = new String[0];
        for( int i = 0; i < arr.length; i++) {
            if((i % 2) != 0) {
                result[i] = arr[i];
            }
        }

        return arr;
    }
}
