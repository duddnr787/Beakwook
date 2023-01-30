package beakwook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wook2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
		 StringBuilder sb = new StringBuilder();

		for(int i = 0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int count = 0;
			
			int A =  Integer.parseInt(st.nextToken());
			int B =  Integer.parseInt(st.nextToken());
			int C =  Integer.parseInt(st.nextToken());
			int D =  Integer.parseInt(st.nextToken());
			
			count += A+B+C+D;
			if(count == 3) {
				sb.append("A").append("\n");
			} else if(count == 2) {
				sb.append("B").append("\n");
			} else if (count == 1) {
				sb.append("C").append("\n");
			} else if ( count == 0) {
				sb.append("D").append("\n");
			} else if ( count == 4) {
				sb.append("E").append("\n");
			}
		}
		System.out.println(sb);
		}
	}


