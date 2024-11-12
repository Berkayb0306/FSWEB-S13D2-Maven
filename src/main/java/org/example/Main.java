package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords((1234)));
        System.out.println(numberToWords((231321)));
        System.out.println(numberToWords((1232134)));
        System.out.println(numberToWords((123142124)));
    }
        public static boolean isPalindrome(int number){
           int original = Math.abs(number);
           int reversed = 0;

           while ( original > 0){
               reversed = reversed* 10 + original % 10 ;
               original /= 10;
           }
           return reversed == Math.abs(number);

        }
    public static boolean isPerfectNumber(int param1){
        if (param1 < 1) {
            return false;
        }

        int sum = 0;


        for (int i = 1; i <= param1 / 2; i++) {
            if (param1 % i == 0) {
                sum += i;
            }
        }


        return sum == param1;
    }

    public static String numberToWords(int param2) {
        if (param2 < 0) {
            return "Invalid Value";
        }
        if (param2 == 0) {
            return "Zero";
        }

        String result = "";
        while (param2 > 0) {
            result = digitToWord(param2 % 10) + " " + result;
            param2 /= 10;
        }
        return result.trim();
    }

    private static String digitToWord(int digit) {
        switch (digit) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
}
