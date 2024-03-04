package 반복문연습문제;

import java.util.Scanner;

public class SquareEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        boolean isPrime = true; //소수인지 아닌지 판별하는 변수
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (n == 1) System.out.println("소수가 아닙니다.");
        else {
            if (isPrime) System.out.println(n + "은 소수 입니다.");
            else System.out.println(n + "은 소수가 아닙니다.");
        }
    }
}


