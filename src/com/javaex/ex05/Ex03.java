package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		int[] lotto = new int[8];
		/*
		lotto[0] =  (int) (Math.random()*50)+1;
		lotto[1] =  (int) (Math.random()*50)+1;
		lotto[2] =  (int) (Math.random()*50)+1;
		lotto[3] =  (int) (Math.random()*50)+1;
		lotto[4] =  (int) (Math.random()*50)+1;
		lotto[5] =  (int) (Math.random()*50)+1;
		*/
	  //이름[방번호] = (강제변환)(렌덤으로 한다()*50)+1;
		System.out.println(lotto.length);

		for (int i = 0; i <=7; i++) {
	   //방번호가 0부터 시작이니까 i는 초기값이 0이다
			lotto[i]=(int)(Math.random()*50)+1;
	      //방들간에 공통점이 있기 때문에 이런식으로 사용도 할수가 있다.
		}
		for (int i = 0; i <lotto.length; i++) {
			//처음부터 끝까지 돌아야 한다면lotto.length을 쓴다.
			System.out.println(lotto[i]);
		}
	}

}
