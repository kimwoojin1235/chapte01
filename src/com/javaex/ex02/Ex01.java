package com.javaex.ex02;

import javax.naming.spi.DirStateFactory.Result;

public class Ex01 {

	public static void main(String[] args) {
		int i =2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s="한";
		String name="김우진";
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.println("11/11");
		
		System.out.println(2+5);
		System.out.println(i+i);
		System.out.println(i+d);
		double result = i+d;
		System.out.println(result);
		
		System.out.println(str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result01 = str+d;
		System.out.println(result01);
		
		System.out.println(str+" 랑 "+i);
		
		System.out.println(name);//메모라 공간의 이름
		System.out.println("name");//name이라는 문자출력
		
		//제이름은 김우진 입니다.
		System.out.println("제이름은 "+name+" 입니다");
		
		//char
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s);
		//안녕하세요
		System.out.println("안녕하세요");
		//안녕"하"세요
		System.out.println("안녕\"하\"세요");
		//안녕\하\세요
		System.out.println("안녕\\하\\세요");
		//안녕	하세요
		System.out.println("안녕\t하세요");
		//줄바꿈
		System.out.println("안녕\n하세요");
		//줄바꿈 같은 표현
		System.out.println("안녕");
		System.out.println("하");
		System.out.println("세요");
	}

}
