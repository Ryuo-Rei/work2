package com.company;

// 2020/09/10 13:40 ~ 13:55
public class NumberOfPalindromes {

    public void Execute() {
        int number = 10;

        while(true) {
            // 2進数用変数
            String binaryNumber = Integer.toBinaryString(number);
            // 8進数用変数
            String octalNumber = Integer.toOctalString(number);
            // 10進数用変数
            String decimalNumber = Integer.toString(number);

            StringBuffer sb = new StringBuffer(binaryNumber);
            StringBuffer sb2 = new StringBuffer(octalNumber);
            StringBuffer sb3 = new StringBuffer(decimalNumber);

            if (binaryNumber.equals(sb.reverse().toString())
                    && octalNumber.equals((sb2.reverse().toString()))
                    && decimalNumber.equals(sb3.reverse().toString())) {
                System.out.println("10以上で最小の値は：" + number);
                break;
            }

            number++;
        }
    }
}
