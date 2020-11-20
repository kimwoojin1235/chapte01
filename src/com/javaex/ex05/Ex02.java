package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
	  //주소를 담는 공간	     5개의방을 만듬
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 55;
	  //아파트의 호수      들어가는 수
	  //무조건 0부터 시작을 함	
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		for (int i = 0; i <=4; i++) {
			System.out.println(intArray[i]);
		//intArray[]안에 i를 넣어 intArray가 0~4까지 표현을 할수가 있다.
		//i는 0이고 4이하 일때 까지 
		}
		

	}

}
