package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// 2020/09/10 13:20 ~ 13:35
public class ReadTextFile {

    final static String FILE_PATH = "C:\\Users\\ryuorei\\Desktop\\Git\\work2\\ReadTextFile用テキスト.txt";

    public void Execute() {
        List<String> fileContentList = ReadFile(FILE_PATH);

        System.out.println(fileContentList);
    }

    public static List<String> ReadFile(String path) {
        Path file = Paths.get(path);
        List<String> fileContentList = null;
        try {
            fileContentList = Files.readAllLines(file);
        } catch (IOException e) {
            System.out.println("ファイル読込みに失敗しました。");
        }

        return fileContentList;
    }
}
