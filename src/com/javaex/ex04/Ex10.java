package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i%2==0&&i%3==0) {
				continue;
				//조건에 맞는 6을 제외하고 반복문을 계속 시도한다.
				//System.out.println("break문");
				//break;
			}
			System.out.println(i);
		}
	}
}
