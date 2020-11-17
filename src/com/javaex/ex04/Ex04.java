package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i = 1; i<=10;i++) {
			sum = sum+i;
			System.out.println(i+"까지의 합은"+sum);
		}
		System.out.println("1부터10까지의 합은"+sum+"입니다.");
	}
}
