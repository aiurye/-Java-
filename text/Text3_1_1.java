package text;
/*���������������λ��
 */
import java.util.Scanner;

public class Text3_1_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do
		{
			number = number / 10;
			count = count + 1;
//			System.out.println("number="+number+";count="+count);
//			�鿴������˼·
		}while (number > 0);
		System.out.println(count);
	}

}
