package com.javaex.ex01;


public class Ex01 {
	public static void main(String[] args) {
		
		byte myAge ;
		myAge = -25 ;
		System.out.println(myAge);
		
		myAge = 26 ;
		System.out.println(myAge);
		
		//정수형
		//자료형(int를 정확하게 써야한다.)
		int Var01 = 3;
		double var02 = -3.4;
		
		//메모라 크기 확인
		//byte var04 = 123456789;
		//short var05 =123456789;
		int var03=12345678;
		long var06= 12345678;
		System.out.println(var06);
		
		//long형
		int var07=2147483647;//int의 범위보다 큰값
		long var08=2147593648l;//long형의대입이안됨 -->끝에 l을 붙여 long아라눈걸 인식
		//long에 들어가는 수중 int에 들어갈수 있는수면 l을 안넣어도 되나int를 넘으면 l을 넣엉야함
		int var09=2147483647;
	}
}
