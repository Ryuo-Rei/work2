package com.company;

import java.util.Arrays;
import java.util.regex.Pattern;

// 2020/9/11 15:15 ~ 16:20
public class Queue {

    String[][] queue = {
            {"1", "2", "3", "A"},
            {"4", "5", "6", "B"},
            {"7", "8", "9", "C"}
    };

    public void Execute() {
        System.out.println("返還前行列：");
        ShowTwoDimensionQueue(queue);
        String[][] exchangedQueue = ExchangeQueue(queue);
        System.out.println("返還後行列：");
        ShowTwoDimensionQueue(exchangedQueue);
        int[] lineAddition = LineAddition(exchangedQueue);
        System.out.println("行の要素の集計：");
        ShowOneDimensionQueue(lineAddition);
        int[] rowAddition = RowAddition(exchangedQueue);
        System.out.println("列の要素の集計：");
        ShowOneDimensionQueue(rowAddition);
        int num = AllElementAddition(exchangedQueue);
        System.out.println("全要素の集計：");
        System.out.println(num);
    }

    private void ShowTwoDimensionQueue(String[][] queue) {
        for(int i = 0; i < queue.length; i++) {
            for(int j = 0; j < queue[0].length; j++) {
                if(j != 0) {
                    System.out.print(" ");
                }
                System.out.print(queue[i][j]);
            }
            System.out.print("\r\n");
        }
    }

    private void ShowOneDimensionQueue(int[] list) {
        for(int i = 0; i < queue.length; i++) {
            System.out.println(list[i]);
        }
    }

    private String[][] ExchangeQueue(String[][] queue) {
        String[][] exchangedQueue = new String[queue[0].length][queue.length];
        for(int i = 0; i < queue.length; i++) {
            for(int j = 0; j < queue[0].length; j++) {
                exchangedQueue[j][i] = queue[i][j];
            }
        }
        return exchangedQueue;
    }

    private int[] LineAddition(String[][] queue) {
        int[] lineSumList = new int[queue.length];
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for (int i = 0; i < queue.length; i++) {
            num = 0;
            for (int j = 0; j < queue[0].length; j++) {
                if (p.matcher(queue[i][j]).find()) {
                    num += Integer.parseInt(queue[i][j]);
                }
            }
            lineSumList[i] = num;
        }
        return lineSumList;
    }

    private int[] RowAddition(String[][] queue) {
        int[] rowSumList = new int[queue[0].length];
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for (int i = 0; i < queue[0].length; i++) {
            num = 0;
            for (int j = 0; j < queue.length; j++) {
                if (p.matcher(queue[j][i]).find()) {
                    num += Integer.parseInt(queue[j][i]);
                }
            }
            rowSumList[i] = num;
        }
        return rowSumList;
    }

    private int AllElementAddition(String[][] queue) {
        int num = 0;
        String regex = "^-?[0-9]*$";
        Pattern p = Pattern.compile(regex);
        for (int i = 0; i < queue.length; i++) {
            for (int j = 0; j < queue[0].length; j++) {
                if (p.matcher(queue[i][j]).find()) {
                    num += Integer.parseInt(queue[i][j]);
                }
            }
        }
        return num;
    }
}
