package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook2439 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for ( int i = 1 ; i <= N ; i++ ){
			for( int j = 1 ; j <= N-i ; j++ ) {
				System.out.print(" ");
			}
			for( int k = 1 ; k <= i ; k++ ){
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}


