package com.praktek;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		String[] b= new String[3];
		
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<2;j++) {
			    in.hasNext();
		        if (in.hasNextInt()) {
		        	a[i] = in.nextInt();
		        }else 
		        	b[i] = in.next();
			}
		}
		
		System.out.println("================================");
		for(int i = 0;i<a.length;i++) {
			if(a[i]<100)
				System.out.format("%s \t 0%d \n",b[i],a[i]);
			else
				System.out.format("%s \t %d \n",b[i],a[i]);
		}
		System.out.println("================================");
		in.close();
	}
}
