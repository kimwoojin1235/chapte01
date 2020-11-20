package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		int[] arrA = new int[] {10,20,30};
		int[] arrB = new int[] {10,20,30};
		if(arrA.length==arrB.length) {
			for (int i = 0; i < arrA.length; i++) {
				
				if (arrA[i]!=arrB[i]) {
					System.out.println(i+"번째 값이 다름니다.");
				}
			}
		}else {
			System.out.println("두배열의 크기가 다름니다.");	
		}
	}		
}



