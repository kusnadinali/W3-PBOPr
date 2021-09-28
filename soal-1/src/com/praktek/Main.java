package com.praktek;

public class Main {
	public static void cekKata(String s) {
		int start = 0;
		boolean c = false;
		s = s + " ";
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i)<= 90) {
				if(c == false) {
					start = i;
					c = true;
				}
			}else if((int)s.charAt(i)>=97 && (int)s.charAt(i) <= 122) {
				if(c == false) {
					start = i;
					c = true;
				}
			}else {
				System.out.println(s.substring(start, i));
				c = false;
				start = -1;
			}
		}
	}
	
	public static void jumlahKata(String s) {
		int count = 0;
		boolean c = false;
		s = s + " ";
		for(int i = 0;i<s.length();i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i)<= 90) {
				c = true;
			}else if((int)s.charAt(i)>=97 && (int)s.charAt(i) <= 122) {
				c = true;
			}else {
				if(c==true)count +=1;
				c = false;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String s = "I wasn't home";
		//System.out.println(s.length()-2);
		jumlahKata(s);
		cekKata(s);
	}
}
