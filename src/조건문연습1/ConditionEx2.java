package 조건문연습1;

import java.util.Scanner;

public class ConditionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 콘솔 입력을 의미. 파일 입력으로 변경 가능
        System.out.print("문자를 입력 하세요 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("알파벳 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("알파벳 대문자 입니다.");
        } else {
            System.out.println("알파벳이 아닙니다.");
        }
    }
}
