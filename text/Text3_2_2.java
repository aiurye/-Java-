package text;

import java.util.Scanner;

/* С��Ϸ
 * ������������һ������
 * �²����֣���ʾ���˻�С��
 * ֱ������
 */
public class Text3_2_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int num = (int)(Math.random()*100+1);//�������һ��[1,100]������
		//Math.random() �������һ��[0,1)�ĸ�����
		int a;
		int count=0;
		 
		do {
			a = in.nextInt();
			count = count+1;
			if ( a>num )
			{
				System.out.println("����");
			}
			else if ( a<num )
			{
				System.out.println("С��");
			}
				
		}
		while ( a!=num );
		System.out.println("��ϲ����¶��ˣ�"+count+"��");				
		
		
	}

}
