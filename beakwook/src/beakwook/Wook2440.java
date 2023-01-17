package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook2440 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for ( int i = 0 ; i < N ; i++ ){
			for( int j = i+1 ; j <= N ; j++ ) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}


