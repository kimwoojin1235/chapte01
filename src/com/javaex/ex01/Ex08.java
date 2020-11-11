package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		//산술 연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("===========");
		System.out.println(7.0/2.0);//정수형 나누기랑 비교
		System.out.println(7.0%2.0);
		System.out.println("===========");
		
		//부호연산자
		int var01 = -3;
		System.out.println(var01);
		System.out.println(-var01);
		System.out.println(+var01);
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a);//실제 변수 a의 값이 변경이 된다.7-->8 출력
		System.out.println(a);

		System.out.println(b);
		System.out.println(--b);//실제 변수b의 값이 변경이 된다. 2-->1출력
		System.out.println(b);

		System.out.println("============");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		b++;//별일없다면 ++b와 같음
		System.out.println(b);


	}

}
