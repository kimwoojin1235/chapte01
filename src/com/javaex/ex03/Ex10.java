package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을입력하세요");
		System.out.print("월: ");
		int moon = sc.nextInt();
		
		switch (moon) {
		case 4: case 6: case 9: case 11:
			System.out.println("30일입니다.");
			break;
		case 2: System.out.println("28일입니다.");
		 	break;
		default:
			System.out.println("31일입니다.");
			break;
		}
		sc.close();
	}

}
