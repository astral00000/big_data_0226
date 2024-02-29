package 조건문연습문제일번;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 콘솔 입력을 의미. 파일 입력으로 변경 가능
        while(true) {
            System.out.print("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if(score < 0 || score > 100) continue;
            if(score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}