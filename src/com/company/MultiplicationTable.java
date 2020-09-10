package com.company;

// 2020/09/10 11:55 ~ 13:10
public class MultiplicationTable {

    public void ShowMultiplicationTable() {
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for(int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            for(int j = 1; j <= 9; j++) {
                int num = i * j;
                String strBefore = String.valueOf(num);
                String strAfter = strBefore;
                if (strBefore.contains("4")) {
                    strAfter = strBefore.replace("4", "*");
                }

                if (j == 9) {
                    // 掛けた結果が一桁の場合、インデント合わせのために空白を追加
                    if (num < 10) {
                        System.out.println(" " + strAfter);
                    } else {
                        System.out.println(strAfter);
                    }
                }
                else {
                    // 掛けた結果が一桁の場合、インデント合わせのために空白を追加
                    if(num < 10) {
                        System.out.print(" " + strAfter + " ");
                    }
                    else {
                        System.out.print(strAfter + " ");
                    }
                }
            }
        }
    }
}
