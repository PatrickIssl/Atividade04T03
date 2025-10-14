package main.java.fag;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		recursao(0);
//		for (int i = 0; i < 10356; i++) {
//
//			System.out.println(i);
//		}
	}
	
	public static void recursao(int i) {
		if(i < 10354) {
			i++;
			System.out.println(i);
			recursao(i);
		}
		return;
	}
	
}