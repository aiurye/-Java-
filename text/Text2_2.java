package text;

import java.util.Scanner;

public class Text2_2 {
// ��������ȡ���ֵ
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Scanner in = new Scanner(System.in);
		int x,y,z;
		int max;
		System.out.println("������������");
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
