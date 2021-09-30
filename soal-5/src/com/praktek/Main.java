package com.praktek;

import java.util.Scanner;

public class Main {
	public static void bukaTutupJalan(long plat) {
		if((plat-999999)%5==0) {
			System.out.println("berhenti");
		}else {
			System.out.println("jalan");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inPlat = null;
		long allPlat;
		
		in.hasNext();
		for(int i=0;i<4;i++) {
			if(inPlat==null)
				inPlat = in.next();
			else
				inPlat = inPlat + in.next();
		}
		allPlat = Long.parseLong(inPlat);
		bukaTutupJalan(allPlat);
		in.close();
	}
}
