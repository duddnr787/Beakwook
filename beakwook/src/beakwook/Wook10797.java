package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook10797 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	       
	       
		int count = 0;
		int a =  Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<5; i++) {
			if(Integer.parseInt(st.nextToken()) == a) {
				count ++;
			} 
		}
		System.out.println(count);
		}
	}


