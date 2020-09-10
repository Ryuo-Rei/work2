package com.company;

// 2020/09/10 11:35 ~ 11:40
public class FizzBuzz {

    public void FizzBuzz() {
        // 1 ~ 40までの数字
        for(int i = 1; i <= 40; i++) {
            // 15で割れる場合、FizzBuzzと表示
            if(i % 15 == 0) {
                System.out.print("FizzBuzz ");
            }
            // 5で割れる場合、Buzzと表示
            else if(i % 5 == 0) {
                System.out.print("Buzz ");
            }
            // 3で割れる場合、Fizzと表示
            else if(i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
