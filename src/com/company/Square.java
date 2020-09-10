package com.company;

import java.util.List;
import java.util.Scanner;

// 2020/09/10 15:10 ~ 15:25
public class Square {

    int input = 0;

    public void Execute() {
        boolean hasError = true;

        while(true) {
            if(hasError) {
                System.out.println("数字(0より大きい値)を入力してください。：");
            }
            else {
                System.out.println("数字は0より大きい値で入力してください。：");
            }

            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();

            if(input < 1) {
                hasError = false;
                continue;
            }

            break;
        }

        CreateSquare(input);
    }

    private void CreateSquare(int input) {
        for(int i = 0; i < input; i++) {
            // 上辺と下辺の場合、辺の差が差分*を出力
            if(i == 0 || i == input - 1) {
                for(int j = 0; j < input; j++) {
                    // 辺の最後の場合、改行
                    if(j == input - 1) {
                        System.out.println("*");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            else {
                System.out.print("*");
                // 辺の中に空白を入力
                for(int k = 0; k < input - 2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
