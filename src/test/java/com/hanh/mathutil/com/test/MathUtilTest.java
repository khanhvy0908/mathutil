package com.hanh.mathutil.com.test;

import com.hanh.mathutil.com.MathUtil;
import org.junit.jupiter.api.Test;

import static com.hanh.mathutil.com.MathUtil.*;
// import static chỉ dành cho những hàm static, đễ giúp ta làm biếng gõ tên class. lẽ ra phải là MathUtil.getFactorial(2); thì nay chỉ cần gõ getFactorial(5); là đủ
// giả sử class có nhiều hàm static thì ta đổi qua dấu *;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    @Test
    public void testFactorialGivenRightArg5RunsWell(){  // mổi hàm này là main rồi nên ko cần

        assertEquals(120, getFactorial(5));
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell(){  // mổi hàm này là main rồi nên ko cần

        assertEquals(24, getFactorial(4));
    }


    @Test  // @TEST là ghi chú, đánh dấu, kí hiueu65 - annotation báo hiệu rằng ham này l hàm main() có thể run
    // 1 class test có thể có nhiều @TEST , vậy 1 class test có thể có nhie hàm main(), để ứng với nhiều kịch bản test, nhiều test case khác nhau đều run được.
    // test case #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0

    // Steps/ procedure:
    // 1. Given a valid n,  e.g. n = 0
    // 2. call.invoke getFactorial(n=0)
    // 3. execute
    // EXPECTED RESULT:
    // The expected value will return 1 as the result of 0!
    // STATUS (PASSED | FAIL)
    public void testFactorialGivenRightArg0RunsWell(){  // mổi hàm này là main rồi nên ko cần static nữa
        int n = 0;
        long expectedValue = 1; // hope to see 0! = 1, kì vọng

        // gọi hàm để xem actual long actualValue
        //long actualValue = MathUtil.getFactorial(n);
        long actualValue = getFactorial(n);
        // test nè - so sánh actual vs expected
        // dùng boolean hoặc in ta
        // System.out.println("0! expectedValue: " + expectedValue);
        // System.out.println("0! actualValue: " + actualValue);

            assertEquals(expectedValue, actualValue);

        // vietsub: so sánh xem 0! có trả về con số 1 hay không
        //                          actual          expected

        assertEquals(1, getFactorial(0));

        // hàm asserEquals so sánh giúp mình 2 value này, nó thảy ra 2 màu:
        // màu xanh passed nếu 2 gia trị bằng nhau
        // màu đỏ failed

    }
}