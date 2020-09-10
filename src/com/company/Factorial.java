package com.company;

import java.util.Scanner;

// 2020/09/10 14:25 ~ 14:45
public class Factorial {
    long input = 0;

    public void Execute() {
        boolean hasError = true;

        while(true) {
            if(hasError) {
                System.out.println("数字(0~99)を入力してください。：");
            }
            else {
                System.out.println("数字は0~99で入力してください。：");
            }

            Scanner scan = new Scanner(System.in);
            input = scan.nextLong();

            if(input < 0 || 99 < input) {
                hasError = false;
                continue;
            }

            break;
        }

        long sum = Calculate(input);
        System.out.println(sum);
    }

    private long Calculate(long input) {
        long sum = 1;
        for(long i = 2; i <= input; i++) {
            sum *= i;
        }
        return sum;
    }
}
