package com.company;

import java.util.List;

// 2020/09/10 17:40 ~ 18:05
public class Scoring {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\Scoring用テキストファイル.csv";

    public void Execute() {
        List<String> fileContentList = null;
        try {
            fileContentList = ReadTextFile.ReadFile(FILE_PATH);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        Aggregate(fileContentList);
    }

    private void Aggregate(List<String> fileContentList) {

        int repairCount = 0;
        int additionalAssignmentCount = 0;
        int yesCount = 0;
        int goodCount = 0;
        int superiorityCount = 0;

        for(int i = 0; i < fileContentList.size(); i++) {
            int num = Integer.parseInt(fileContentList.get(i));
            if(0 <= num && num <= 20) {
                repairCount++;
            }
            else if(21 <= num && num <= 45) {
                additionalAssignmentCount++;
            }
            else if(46 <= num && num <= 59) {
                yesCount++;
            }
            else if(60 <= num && num <= 79) {
                goodCount++;
            }
            else if(80 <= num && num <= 99) {
                superiorityCount++;
            }
        }
        System.out.println("優：" + superiorityCount);
        System.out.println("良：" + goodCount);
        System.out.println("可：" + yesCount);
        System.out.println("追加課題：" + additionalAssignmentCount);
        System.out.println("補修：" + repairCount);
    }
}
