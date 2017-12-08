package text;

import java.util.Scanner;

public class Text4_1 {

	public static void main(String[] args) {
		// ¼ÆËã½×³Ën£¡
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int factor = 1;
		
//		int i = 1;
//		while(i <= n) 
//		{
//		factor = factor * i;
//		i = i+1;		
//		}
		
		for(int i = 1;i<=n;i++)
		{
			factor = factor*i;
		}
		System.out.println(factor);
	}

}
