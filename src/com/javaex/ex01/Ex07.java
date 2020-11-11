package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		double v01 = 5/4;//정수/정수여서 1이지만 자료형이double이라서 1.0이다.
		System.out.println(v01);//4와5에 자동형변환이 된다.
		
		double v02 = (double)5 / 4 ; //5를 강제로 형변환 해서 1.25가 나온다. 5.0/4
        System.out.println(v02);//4에 자동형변환이 된다.   

        double v03 = 5 / (double)4 ;  //4를 강제현변환 한것  5/4.0 = 1.25
        System.out.println(v03);//5에 자동 형변환이 된다.      

        double v04 = (double)5 / (double)4 ;  //두정수 모두 강제형변환 한것 5.0/4.0
        System.out.println(v04);    

        int v05 = (int)1.3 + (int)1.8 ;//정수로 형변환이 되어 소수점 이상만 더해짐 1+1=2
        System.out.println(v05);//두 정수모두 강제형변환으로 진행   
        
        int v06 = (int)(1.3+1.8);//1.3+1.8을 먼저 더한뒤 소수점 뒤자리를 날린다.
        System.out.println(v06);//계산뒤 강제형변환    

	}

}
