package com.company;

import java.util.List;

// 2020/09/11 10:00 ~ 10:20
public class MaxMinAve {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\minmaxave.csv";

    public void Execute() {
        List<String> fileContentList = null;
        try {
            fileContentList = ReadTextFile.ReadFile(FILE_PATH);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        Calculate(fileContentList);
    }

    private void Calculate(List<String> fileContentList) {
        // 最小値用変数
        int min = Integer.parseInt(fileContentList.get(0));
        // 最大値用変数
        int max = Integer.parseInt(fileContentList.get(0));
        // 平均値用変数
        double ave = 0;

        for(int i = 0; i < fileContentList.size(); i++) {
            int num = Integer.parseInt(fileContentList.get(i));

            if(num < min) {
                min = num;
            }

            if(max < num) {
                max = num;
            }

            ave += num;
        }
        // 平均値を少数第3位を四捨五入
        ave = ((double)Math.round((ave / fileContentList.size()) * 100)) / 100;

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
        System.out.println("平均値：" + ave);

    }
}
