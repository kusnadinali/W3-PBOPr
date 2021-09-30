package com.praktek;

import java.util.Scanner;

public class Main {
	public static void result(int A, int B, String operator) {
		switch((int) operator.charAt(0)) {//case dibawah ini adalah nilai nilai ascii dari character operator
			case 43:
				System.out.println(A+B);
				break;
			case 45 :
				System.out.println(A-B);
				break;
			case 42:
				System.out.println(A*B);
				break;
			case 47:
				System.out.println(A/B);
				break;
			case 37:
				System.out.println(A%B);
				break;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B;
		String operator;
		
		in.hasNext();
		A = in.nextInt();
		operator = in.next();
		B = in.nextInt();

		result(A,B,operator);
		in.close();
	}
}
