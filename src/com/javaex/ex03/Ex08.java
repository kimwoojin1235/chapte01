package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하시오");
		System.out.println("(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호: ");
		int point = sc.nextInt();
		
		String st = "";
		
		if (point==1) {
			st="R101호";
		}
		else if (point==2) {
			st="R102호";
		}
		else if (point==3) {
			st="R103호";
		}
		else if (point==4) {
			st="R104호";
		}else {
			st="상담원에게 문의해주세요";
		}
		System.out.println(st);
		
	}

}
