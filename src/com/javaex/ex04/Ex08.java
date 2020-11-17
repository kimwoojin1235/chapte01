package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		//예제1
		/*
		int num= 1;
		while (true) {//true면 빠져나간다.
			if (num %6==0 && num%14==0) {
				System.out.println(num);
				break;//6과14의 최소 공배수 라면 탈출
			}
			num++;
		}
		*/
		for (int i = 1; i <=100; i++) {
			if (i%6==0&&i%14==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
