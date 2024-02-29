package 짝수홀수판별하기;

import java.util.Scanner;

// 임의의 정수를 입력 받아 해당 값이 짝수 인지 홀수 인지 출력 하는 문제
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위해 스캐너 객체 생성
        System.out.print("정수 입력 : ");
        int num = sc.nextInt(); //
        String outString = (num % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
        System.out.println(outString);
    }
}