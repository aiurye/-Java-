package text;

import java.util.Scanner;

public class Text4_2 {
/*输入k；
	输出前k个素数
*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int t = 0;
		int n=2;
		while(t<k)
		{
			boolean isPrime = true;
			for(int i=2;i<n;i++)
			{
				if(	n % i ==0 )
				{
					isPrime = false;
					break;
				}
			}
			n++;
			if(isPrime)
			{
			System.out.print(n+" ");
			t++;
			}
		}	
	}

}
