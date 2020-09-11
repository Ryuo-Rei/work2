package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2020/9/11 11:45 ~ 14:25
public class UnUsedNumber {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\test.txt";
    final static String OUTPUT_FILE = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\output.txt";
    final static String OUTPUT_FILE2 = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\output2.txt";

    List<String> numberList = new ArrayList<String>();
    int[] countList = new int[10];

    public void Execute() {
        List<String> fileContentList = ReadTextFile.ReadFile(FILE_PATH);

        ParseData(fileContentList);

        Output();
    }

    private void Output() {
        try {
            File file = new File(OUTPUT_FILE);
            File file2 = new File(OUTPUT_FILE2);

            if(!file.exists()) {
                file.createNewFile();
            }
            if(!file2.exists()) {
                file2.createNewFile();
            }

            FileWriter fw = new FileWriter(file, false);
            FileWriter fw2 = new FileWriter(file2, false);

            fw.write(numberList.toString());
            fw.close();

            fw2.write(Arrays.toString(countList));
            fw2.close();
        }
        catch(IOException e) {

        }
    }

    private void ParseData(List<String> fileContentList) {
        for(int i = 0; i < fileContentList.size(); i++) {
            numberList = CheckNumber(fileContentList.get(i), numberList);
            countList = CountNumber(fileContentList.get(i), countList);
        }
    }

    private List<String> CheckNumber(String numbers, List<String> numberList) {
        String str = "";
        for(int i = 0; i <= 9; i++) {
            int num = numbers.indexOf(Integer.toString(i));
            if(num == -1) {
                str += Integer.toString(i);
            }
        }
        if(str == null || str.equals("")) {
            numberList.add("none\r\n");
        }
        else {
            numberList.add(str + "\r\n");
        }
        return numberList;
    }

    private int[] CountNumber(String numbers, int[] countList) {
        int count = 0;
        for(int i = 0; i <= 9; i++) {
            char targetChar =Integer.toString(i).charAt(0);
            for(int j = 0; j < numbers.length(); j++) {
                if (numbers.charAt(j) == targetChar) {
                    count++;
                }
            }
            countList[i] += count;
        }
        return countList;
    }



}
