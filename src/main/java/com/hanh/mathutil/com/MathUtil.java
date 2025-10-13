package com.hanh.mathutil.com;

public class MathUtil {

    // class này chứa các hàm tiện ích dùng cho mọi nơi
    // hàm tiện ích dùng cho mọi nơi , c nghĩa là nó không lưu lại kết quả xử lý của nó bên trong, vậy nó sẻ đc thiết kế là STATIC METHOD

    // hàm tính n! = 1, 2, 3 ...n; trong đó n phải > 0
    // quy ước 0! = 1, 1! = 1
    // 20! vừa đủ kiểu long, 18 con số 0; 21! long chứa ko nổi
    // ko có âm giai thừa
    // bài này giai thừa chỉ tính từ 0 ... 20, ngoài vùng này gọi là ko hợp lệ n!
    // 0... 20-> valid boundary validated boundary - vùng giá trị hợp ệ
    // 0, 20 -> boudary value - biên giới cua tập giá trị
    //          sích qua 1 síu là sang vùng invalid boundary
    // 0 , xích nhẹ sang trái 1 đơn vị, ko ổn, ko tính đc, -1 sao tính
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            // ném ngoại lệ, kèm câuchui73i, và dừng hàm ngay, ko có value nào dc tra về
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        // biến trung gian để tính phép nhân
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;    // thuật toán heo đất
        }

        return result;
    }
}
