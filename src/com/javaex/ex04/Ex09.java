package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean action = true;
		while (action) {//true
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if (num==0) {
				System.out.println("종료");		
				action = false;//true를 fales로 바꿔 브레이크 역할을함
			}else if (num%3==0) {
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수아닙니다.");
			}
		}
	}
}
