package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        odd=oddCount(number);
        even=numberLength(number)-odd;
        System.out.println(String.format("Even: %d Odd: %d", even,odd));
    }

    private static int oddCount(int number) {
        int oddCount = 0;
        int len = numberLength(number);
        for (int i = 0; i < len; i++) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddCount++;
            }
            number = number / 10;
        }
        return oddCount;
    }


    private static int numberLength(int number) {
        return String.valueOf(number).length();
    }




}
