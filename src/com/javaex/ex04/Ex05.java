package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int num;
		int sum;
		 for(num = 2; num <=9; num++) {
			 for(sum = 1; sum <=10; sum++) {
				 int sun = num*sum;
				 System.out.println(num+"*"+sum+"="+sun);
			 }
			 System.out.println();//한줄을 띄운다.
		 }

	}

}
