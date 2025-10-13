package com.hanh.mathutil.com;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {

    // chuẩn bị bộ data để riêng, sau đó fill vào lệnh Test
    // mảng 2 chiều, gồm giá trị kỳ vọng | con n!
    public static Object[][] initTestData(){
        // trả về mảng 2 chiều
       // Object dataset = {}; // = {cac phan mang cach nhau ,}
                            //{5, 10, 15, 20}
        Object[][] dataset = {
                {5, 120},
                {6, 720},
                {4, 24},
                {3, 6},
                {2, 2},
                {1, 1},
                {0, 1}
        }; //[7][2]
        return dataset;
    }

    // @Test
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }


}