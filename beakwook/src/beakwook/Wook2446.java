package beakwook;


import java.io.IOException;

import java.util.Scanner;


public class Wook2446 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = N; j-i > 1; j--) {
				System.out.print("*");
			}
			System.out.print("*");
			for(int j = N; j-i > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < N; i++) {
			for(int j = N; j-i > 1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.print("*");
			for(int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
