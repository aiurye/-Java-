package text;

import java.util.Scanner;
/*���ߵ�̨��RS���źű�������������������ɵģ�
R(Readability) �źſɱ�ȼ�������.
S(Strength)    �ź�ǿ�ȼ���С.
����Rλ�ڱ����һλ������5������1��5���ֱ�ʾ.
1---Unreadable
2---Barely readable, occasional words distinguishable
3---Readable with considerable difficulty
4---Readable with practically no difficulty
5---Perfectly readable
����ڶ�λ��S�����־Ÿ�������1��9�е�һλ���ֱ�ʾ
1---Faint signals, barely perceptible
2---Very weak signals
3---Weak signals
4---Fair signals
5---Fairly good signals
6---Good signals
7---Moderately strong signals
8---Strong signals
9---Extremely strong signals
���ڣ���ĳ���Ҫ����һ���źű�������֣�Ȼ�������Ӧ�ĺ��塣�����59���������
Extremely strong signals, perfectly readable.*/
public class Text2_24 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int rs = in.nextInt();
		int r,s;
		r=rs/10;
		s=rs%10;
		if (rs>=11 && rs<=59)
		{
			switch(s)
			{
			case 1:
				System.out.print("Faint signals, barely perceptible, ");
				break;
			case 2:
				System.out.print("Very weak signals, ");
				break;
			case 3:
				System.out.print("Weak signals, ");
				break;
			case 4:
				System.out.print("Fair signals, ");
				break;
			case 5:
				System.out.print("Fairly good signals, ");
				break;
			case 6:
				System.out.print("Good signals, ");
				break;
			case 7:
				System.out.print("Moderately strong signals, ");
				break;
			case 8:
				System.out.print("Strong signals, ");
				break;
			case 9:
				System.out.print("Extremely strong signals, ");
				break;
			
			}
			
			switch(r)
			{
			case 1:
				System.out.print("unreadable.");
				break;
			case 2:
				System.out.print("barely readable, occasional words distinguishable.");
				break;
			case 3:
				System.out.print("readable with considerable difficulty.");
				break;
			case 4:
				System.out.print("readable with practically no difficulty.");
				break;
			case 5:
				System.out.print("perfectly readable.");
				break;
						
			}
		
		
		
	}

}

}