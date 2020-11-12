package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int pey;
		int unit=8590;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		if (time<=8) {
			pey=time*unit;
		}else {
			//unit=8*10000+(time-8)*12000;
			pey = 8*unit+(int)(unit*1.5*(time-8));
		} 
		System.out.println("임금은"+pey+"입니다.");
		sc.close();
	}

}
