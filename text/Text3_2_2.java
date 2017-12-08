package text;

import java.util.Scanner;

/* 小游戏
 * 计算机随机产生一个数字
 * 猜测数字，提示大了或小了
 * 直到结束
 */
public class Text3_2_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);//随机产生一个[1,100]的整数
		//Math.random() 随机产生一个[0,1)的浮点数
		int a;
		int count=0;
		 
		do {
			a = in.nextInt();
			count = count+1;
			if ( a>num )
			{
				System.out.println("大了");
			}
			else if ( a<num )
			{
				System.out.println("小了");
			}
				
		}
		while ( a!=num );
		System.out.println("恭喜，你猜对了！"+count+"次");				
		
		
	}

}
