package com.company;

// 2020/09/10 11:35 ~ 11:40
public class FizzBuzz {

    public void FizzBuzz() {
        for(int i = 1; i <= 40; i++) {
            if(i % 15 == 0) {
                System.out.print("FizzBuzz ");
            }
            else if(i % 5 == 0) {
                System.out.print("Buzz ");
            }
            else if(i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
