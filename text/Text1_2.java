package text;

import java.util.Scanner;

public class Text1_2 {
/*英制转公制
  	输入英尺，英尺，输出厘米*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int foot;
		double inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"CM");
		
	}

}
