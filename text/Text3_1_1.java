package text;
/*计算输入的整数的位数
 */
import java.util.Scanner;

public class Text3_1_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do
		{
			number = number / 10;
			count = count + 1;
//			System.out.println("number="+number+";count="+count);
//			查看程序工作思路
		}while (number > 0);
		System.out.println(count);
	}

}
