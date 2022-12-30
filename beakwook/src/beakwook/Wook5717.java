package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook5717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       
	       StringBuilder sb = new StringBuilder();
	       
	       for(;;) {
	    	   StringTokenizer st = new StringTokenizer(br.readLine());
	    	   int a = Integer.parseInt(st.nextToken());
		       int b = Integer.parseInt(st.nextToken());
		       if( a == 0 && b == 0 ) { 
		    	   break;
		       }
		       sb.append(a+b).append("\n");
		       
	       }
	      System.out.println(sb);
	       
		}
	}


