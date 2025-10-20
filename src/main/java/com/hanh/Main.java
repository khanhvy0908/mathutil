package com.hanh;

import com.hanh.mathutil.com.MathUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        //testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }
    // test case #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0

    // Steps/ procedure:
    // 1. Given a valid n,  e.g. n = 0
    // 2. call.invoke getFactorial(n=0)
    // 3. execute
    // EXPECTED RESULT:
    // The expected value will return 1 as the result of 0!
    // STATUS (PASSED | FAIL)
    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expectedValue = 1; // hope to see 0! = 1, kì vọng

        // gọi hàm để xem actual long actualValue
        long actualValue = MathUtil.getFactorial(n);
        // test nè - so sánh actual vs expected
        // dùng boolean hoặc in ta
        System.out.println("0! expectedValue: " + expectedValue);
        System.out.println("0! actualValue: " + actualValue);


    }

    // test case #2: Check/Verify getFactorial() method with valid parameter, e.g. n = 5
    // Steps/ procedure:
    // 1. Given a valid n,  e.g. n = 5
    // 2. call.invoke getFactorial(n=5)
    // 3. execute
    // EXPECTED RESULT:
    // The expected value will return 120 as the result of 5!
    // STATUS (PASSED | FAIL)

    public static void testFactorialGivenRightArg5RunsWell(){
        int n = 5;
        long expectedValue = 120; // hope to see 5! = 120, kì vọng

        // gọi hàm để xem actual long actualValue
        long actualValue = MathUtil.getFactorial(n);
        // test nè - so sánh actual vs expected
        // dùng boolean hoặc in ta
        System.out.println("5! expectedValue: " + expectedValue);
        System.out.println("5! actualValue: " + actualValue);
    }

    // test case #3: Check/Verify getFactorial() method with valid parameter, e.g. n = 6
    // Steps/ procedure:
    // 1. Given a valid n,  e.g. n = 6
    // 2. call.invoke getFactorial(n=6)
    // 3. execute
    // EXPECTED RESULT:
    // The expected value will return 720 as the result of 6!
    // STATUS (PASSED | FAIL)
    public static void testFactorialGivenRightArg6RunsWell(){
        System.out.println("6! expected = 720 | actual = " + MathUtil.getFactorial(6));
    }

    // test case #4: Check/Verify getFactorial() method with INvalid parameter, e.g. n = -5
    // Steps/ procedure:
    // 1. Given aN INvalid n,  e.g. n = -5
    // 2. call.invoke getFactorial(n=-5)
    // 3. execute
    // EXPECTED RESULT:
    // The METHOD will throw an exception.
    // STATUS:
    // (PASSED | FAIL) đoán xem, chạy app đã
    public static void testFactorialGivenWrongArgMinus5ThrowsException(){
        MathUtil.getFactorial(-5);   // hàm passed, vì expected value = actual value = hàm ném ra ngoại lệ. Ngoại lệ với số âm giai thừa.
    }

}