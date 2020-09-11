package com.company;

import java.util.Calendar;
import java.util.Scanner;

// 2020/09/11 9:10 ~ 9:50
public class CalendarSample {

    int year = 0;
    int month = 0;

    public void Execute() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("年を入力してください：");
            year = scan.nextInt();
            System.out.println("月を入力してください：");
            month = scan.nextInt();
        }
        catch(Exception e) {
            e.getCause();
        }

        CreateCalender(year, month);
    }

    private void CreateCalender(int year, int month) {
        Calendar cal = Calendar.getInstance();

        cal.set(year, month-1, 1);
        // 月の初日の曜日を取得
        int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
        // 月の日数を取得
        int maxDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("SUN MON TUE WED THU FRI SAT");

        for(int i = 1; i < weekIndex; i++) {
            System.out.print("    ");
        }

        for(int j = 1; j <= maxDays; j++) {
            System.out.print(String.format("%3d ", j));

            if((weekIndex + j - 1) % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
