package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wook16204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken()); 
       
      
       
       int count1 = n - m;
       int count2 = n - count1;
       
       int count3 = n - k;
       int count4 = n - count3;
       
       int sum1 = 0;
       int sum2 = 0;
       
       if(count1 > count3) {
    	   sum1 += count3;
       } else sum1 += count1;
       
       if(count2 > count4) {
    	   sum2 += count4;
       } else sum2 += count2;
		       
	       System.out.println(sum1 + sum2);
		}
	}


