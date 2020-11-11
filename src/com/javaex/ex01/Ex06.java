package com.javaex.ex01;

import javax.naming.spi.DirStateFactory.Result;

public class Ex06 {

	public static void main(String[] args) {
		//자동형변환
		int num1=1;
		float num2=1.0f;
		float result =num1+num2;
		System.out.println(result);
		//자동형변환2
		long num3=12345L;
		float num4=1.1f;
		float result02=num3+num4;
		System.out.println(result02);
	
		
		//강제형변환
		int i = (int)1112.42323;//소수점을 버려도 된다는 뜻
		System.out.println(i);
		
		float var01 = 12.5f;
		int var02 = (int)var01;
		
		//강제형변환: 확대변환
		byte v01 = 10;
		int v02 = (int)v01;//int가 byte보다 크기때문에 형변환을 안해도 오류가 없음
		System.out.println(v02);
		
		//강제형변환:축소변환(정상)
		int v03 = 10;
		byte v04 = (byte)v03;//int가 byte보다 크기때문에 형변환을 안하면 오류가 생김
		System.out.println(v04);
		//강제형변환:축소변환(비정상)
		int v05=123023290;
		byte v06 = (byte)v05;//어느정도의 값이 망가지는 것은 감수해야함
		System.out.println(v06);
		
		//강제형변환:실수-->정수(소수점 이하 없어짐)
		double v07 = 5.57;
		int v08 =  (int)v07;//실를 정수를 강제변환 시킨거라 소수점 이하삭제
		System.out.println(v08);
		
		//강제형변환:정수-->실수
		int v09 = 56657;
		double v10 = (double)v09;
		System.out.println(v10);
	}

}
