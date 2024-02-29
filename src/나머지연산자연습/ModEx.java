package 나머지연산자연습;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 나눠 담기
// ex) 257 => a변수에 2, b변수에 5,c변수에 7
public class ModEx
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력 하세요 : ");
        int num = in.nextInt();
        int a = num / 100; // 100으로 나눈 몫을 구함
        int b = (num % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 구함
        int c = num % 10; // 10으로 나눈 나머지를 구함
        System.out.println("100의 자리 : " + a + ", 10의 자리 : " + b + ", 1의 자리 : " + c);

    }
}
