package text;

import java.util.Scanner;

public class Text2_2 {
// 三个数中取最大值
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner in = new Scanner(System.in);
		int x,y,z;
		int max;
		System.out.println("请输入三个数");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if ( x>y )
			max=x;
		else 
			max=y;
		if ( max<z )
			max=z;
		System.out.println("max="+max);
	}

}
