package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요[0이면 종료]");
		//do while문 사용
		/*
		do {
		num =sc.nextInt();
		sum+=num;//누적시키눈 대입연산자
		System.out.println("합계: "+sum);
		}while(num!=0);//num이 0이 아니라면 true즉 반복
		//질문이 지속적으로 같아야 할때 사용하는 방법
		*/
		//다른표현
		while (true) {
			num=sc.nextInt();
			sum+=num;
			System.out.println("합계: "+sum);
			if (num==0) {
				break;
			}
			
		}
		
	

		System.out.println("종료");
		sc.close();

	}

}
