package com.javaex.ex01;

public class Ex05 {
	public static void main(String[]args) {
		final double pi = 3.14; 
		//일반적 경우
		double reault01 = pi*5*5;
		System.out.println(reault01);
		//pi값을 변경하는 경우
		//pi=3.141519; 상수로 정의되어 오류발생
		double reault02=pi*5*5;
		System.out.println(reault02);
		
		final double PI=3.14;
		
		double reault03=PI*5*5;
		System.out.println(reault03);
	}
}
