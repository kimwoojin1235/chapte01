package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목코드를 입력하세요");
		System.out.print("과목코드: ");
		
		int code= sc.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("R101호");
			break;
		case 2:	
			System.out.println("R202호");
			break;
		case 3:	
			System.out.println("R303호");
			break;
		case 4:	
			System.out.println("R404호");
			break;
		default:
			System.out.println("상담원에게 문의해주세요");
			break;
		} 
		sc.close();
	}

}
