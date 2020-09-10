package com.company;

// 2020/09/10 11:55 ~ 13:10
public class MultiplicationTable {

    public void ShowMultiplicationTable() {
        System.out.println("   1  2  3  *  5  6  7  8  9");
        for(int i = 1; i <= 9; i++) {
            if(i == 4) {
                System.out.print("* ");
            }
            else {
                System.out.print(i + " ");
            }
            for(int j = 1; j <= 9; j++) {
                if(j == 9) {
                    if(i * j < 10) {
                        System.out.println(" " + i * j);
                    }
                    else {
                        System.out.println(i * j);
                    }
                }
                else {
                    if(i * j == 4) {
                        System.out.print(" * ");
                    }
                    else if(i * j < 10) {
                        System.out.print(" " + i * j + " ");
                    }
                    else {
                        System.out.print(i * j + " ");
                    }
                }
            }
        }
    }
}
