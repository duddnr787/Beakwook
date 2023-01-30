package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook2445 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i < N; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			for(int j = N; j-i>0; j--) {
				System.out.print(" ");
			}
			for(int j = N; j-i>0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(int i = 0; i<N*2; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 1; i < N; i++) {
			for(int j = N; j-i>0; j--) {
				System.out.print("*");
			}
			for(int j = 0; j<i; j++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = N; j-i>0; j--) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}
}
