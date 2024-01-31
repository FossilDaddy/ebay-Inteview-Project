package com.ebay.interview;
// Implement utility class StringUtils with static method shiftString(input, times), and return shifted string.
// E.g. input: “abcdefghijklmnopqrstuvwxyz”, shift right 2 times, the result is: “yzabcdefghijklmnopqrstuvwx”
public class StringUtils {
    public static String shiftString(String input, int times){
        int length = input.length();
        times = (times + length) % length;

        if(times == 0)return input;

        String left = input.substring(length - times, length);
        String right = input.substring(0, length - times);

        return left + right;
    }

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        int times = 0;

        System.out.println(shiftString(input, times));

    }
}
