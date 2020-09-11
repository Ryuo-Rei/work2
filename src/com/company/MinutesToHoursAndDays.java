package com.company;

import java.util.Scanner;

// 2020/9/11 10:40 ~ 11:05
public class MinutesToHoursAndDays {

    int input = 0;

    public void Execute() {
        try {
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();
        }
        catch(Exception e) {
            e.getCause();
        }

        ConvertMinutes(input);
    }

    private void ConvertMinutes(int input) {
        // 分→日 入力値/6o/6o
        int days = input / 1440 ;
        // 入力値/1440の余りを分に代入
        int minutes = input % 1440;
        // 分→時間 分/6o
        int hours = minutes / 60;
        // 分/60の余りを分に代入
        minutes = minutes % 60;

        System.out.println("入力値：" + input);
        String outputResult = "出力：";

        if(days > 0) {
            outputResult += days + "日 ";
        }

        if(hours > 0) {
            outputResult += hours + "時間 ";
        }

        if(minutes > 0 || input == 0) {
            outputResult += minutes + "分";
        }

        System.out.println(outputResult);
    }
}
