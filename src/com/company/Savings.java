package com.company;

import java.util.Scanner;

// 2020/9/11 16:25 ~ 17:20
public class Savings {

    int initialBalance = 0;

    public void Execute() {
        try {
            System.out.print("初期残高：");
            Scanner scan = new Scanner(System.in);
            initialBalance = scan.nextInt();
        }
        catch(Exception e) {

        }
        DoubleSavings(initialBalance);
    }

    private void DoubleSavings(int input) {
        int sum = initialBalance;
        int savings = 0;
        int dayCount = 0;
        if(initialBalance <= 100000) {
            savings = 1;
            dayCount = 1;
            sum += savings;
        }

        while (sum < 100000) {
            System.out.println(dayCount + "日までの合計金額 本日の貯金額 " + savings + "円 貯金総額" + sum + "円");

            savings *= 2;
            dayCount++;
            sum += savings;
        }
        System.out.println(dayCount + "日までの合計金額 本日の貯金額 " + savings + "円 貯金総額" + sum + "円");
    }
}
