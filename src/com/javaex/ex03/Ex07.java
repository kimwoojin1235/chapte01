package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int point = sc.nextInt();
		String st="";
		
		if (point>0) {
			if (point%2==0) {
				st="짝수입니다.";
			}
			else { 
				st="홀수입니다.";
			}
		}
		else if(point<0) {
			st = "음수입니다";
		}else {
			st = "0입니다";
		}
		System.out.println(st);
		sc.close();
	}

}
