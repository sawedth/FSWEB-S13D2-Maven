package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(numberToWords(101));
    }
    public static boolean isPalindrome(int num){
        int value = Math.abs(num);
        String[] digits = String.valueOf(value).split("");
        for (int i = 0; i < digits.length/2; i++){
            if(digits[i].equals(digits[digits.length-i-1])  ){

            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int num){
        if(num < 0){
            return false;
        }
        int dividers = 1;
        for(int i = 2 ; i <= num/2; i++){
            if(num%i == 0){
                dividers = dividers + i;
            }
        }
        if(dividers == num){
            return true;
        }else{
            return false;
        }
    }


    public static String numberToWords(int num){
        if(num < 0){
            return "Invalid Value";
        }
        String result = "";
        String newNum = String.valueOf(num);
        for(int i = 0; i < newNum.length(); i++){
            switch (newNum.charAt(i)){
                case '0':
                    result = result + "Zero ";
                    break;
                case '1':
                    result = result + "One ";
                    break;
                case '2':
                    result = result + "Two ";
                    break;
                case '3':
                    result = result + "Three ";
                    break;
                case '4':
                    result = result + "Four ";
                    break;
                case '5':
                    result = result + "Five ";
                    break;
                case '6':
                    result = result + "Six ";
                    break;
                case '7':
                    result = result + "Seven ";
                    break;
                case '8':
                    result = result + "Eight ";
                    break;
                case '9':
                    result = result + "Nine ";
                    break;

            }
        }
        return result.trim();
    }
}
