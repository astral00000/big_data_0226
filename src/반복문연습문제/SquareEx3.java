package 반복문연습문제;
// 10을 입력하면 10 미만의 소수의 합을 출력

import java.util.Scanner;

public class SquareEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) sum += primeFunc(i);
        System.out.println(n + "미만의 소수의 합 : " + sum);

    }
    static int primeFunc(int n){
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0) isPrime = false;
        }
        if (isPrime) return n;
        else return 0;
    }
}
