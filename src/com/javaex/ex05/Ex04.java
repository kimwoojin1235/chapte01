package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		/*
		int[] intArray = new int[3];
		//가장 기초적인 방법이라서 익숙치 안다면은 추천
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		
		int[] intArray = new int[] {3,6,9,};
		//생성과 동시에 초기화를 하였고 길아정보도 생략이 가능하다
		//길이는 초기화를 한만큼으로 나온다.
		 */
		int[] intArray ={3,6,9,};
		//익숙해 진다면 사용하는 것을 추천한다.

		//intArray.length -->3
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
