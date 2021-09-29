package com.praktek;

import java.util.Scanner;

public class Main {
	public static final int gajiPokok = 500000;
	public static final int hargaItem = 50000;
	public static int hitungGaji(int item) {
		double gaji;
		if(item > 80) {//35%
			gaji = ((item*hargaItem)*0.35)+gajiPokok;
		}else if(item >= 40) {//25%
			gaji = ((item*hargaItem)*0.25)+gajiPokok;
		}else if(item < 15) {// -15%
			gaji = gajiPokok - (((15-item)*hargaItem)*0.15);
		}else {
			gaji = ((item*hargaItem)*0.10)+gajiPokok;
		}
		return (int)gaji;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gaji,item;
		
		item = in.nextInt();
		gaji = hitungGaji(item);
		System.out.println(gaji);
		in.close();
		
	}
}
