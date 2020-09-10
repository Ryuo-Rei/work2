package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

// 2020/09/10 16:45 ~ 17:05
public class LeapYear {

    public void Execute() {
        boolean hasError = true;

        while (true) {
            if (hasError) {
                System.out.println("西暦を入力してください：");
            } else {
                System.out.println("西暦は数値で入力してください：");
            }

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            // 大文字小文字に限らず、endと入力されると終了
            if (input.equalsIgnoreCase("end")) {
                exit(0);
            }

            // 入力値が文字列、もしくは 0~9999でない場合、入力やり直し
            if(IsNumber(input) == false || Integer.parseInt(input) < 0 || 9999 < Integer.parseInt(input)) {
                hasError = false;
                continue;
            }

            // 閏年判定
            IsLeap(input);
        }
    }

    private void IsLeap(String input) {
        int num = Integer.parseInt(input);
        if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println("閏年");
        }
        else {
            System.out.println("平年");
        }
    }

    private boolean IsNumber(String input) {
        try {
            int num = Integer.parseInt(input);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
