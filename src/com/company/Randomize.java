package com.company;

import java.util.Random;
import java.util.Scanner;

// 2020/9/11 11:25 ~ 11:40
public class Randomize {

    int input1 = 0;
    int input2 = 0;

    public void Execute() {
        boolean hasError = true;
        try {
            while (true) {
                if (hasError == false) {
                    System.out.println("値は2 ~ 9999の整数で入力してください。");
                }

                Scanner scan = new Scanner(System.in);
                System.out.print("入力値1：");
                input1 = scan.nextInt();
                System.out.print("入力値2：");
                input2 = scan.nextInt();

                if ((input1 < 2 || 9999 < input1) || (input2 < 2 || 9999 < input2)) {
                    hasError = false;
                    continue;
                }

                break;
            }
        }
        catch (Exception e) {

        }

        CreateRandomNumber(input1, input2);
    }

    private void CreateRandomNumber(int input1, int input2) {
        Random r = new Random();
        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        for (int i = 0; i < 100; i ++) {
            int randomNumber = r.nextInt(max - min) + min;
            System.out.println(randomNumber);
        }
    }
}
