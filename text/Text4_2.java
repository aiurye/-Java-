package text;

import java.util.Scanner;

public class Text4_2 {
/*����k��
	���ǰk������
*/
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
