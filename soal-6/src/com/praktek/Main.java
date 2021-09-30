package com.praktek;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A,B;
		BigInteger B_A,B_B,kali,jumlah;
		
		A = in.next();
		B = in.next();
		B_A = new BigInteger(A);
		B_B = new BigInteger(B);
		jumlah = B_A.add(B_B);
		kali = B_A.multiply(B_B);
		System.out.println(jumlah);
		System.out.println(kali);
		//System.out.println(jumlah+kali);
	}
}
