package com.kh.variable;

// pr��ntf ������ ���� ����
public class D_Printf {
	
	public void printfTest() {
		
		/*
		 * * ��¹��� ����
		 * System.out.println(����ϰ����ϴ°�); => �� ��� �� �ٹٲ�(����) �־���
		 * System.out.print(����ϰ����ϴ°�); => �� ��¸� ����
		 * 
		 * System.out.printf("����ϰ����ϴ�����", ����ϰ����ϴ°�);
		 * => f�� format(����)�� �ǹ�
		 * => ���Ŀ� ���缭 ������ ���� ��µǴ� ����. �ٹٲ��� �߻�X
		 * => ��, ���ڿ� �ȿ� �� ���� �� �ڸ��� ������ ���� �������� ������ ��
		 * 
		 * ����
		 * %d : ������ �� �� �ִ� ����
		 * %f : �Ǽ��� �� �� �ִ� ����
		 * %c : ���ڰ� �� �� �ִ� ����
		 * %s : ���ڿ��� �� �� �ִ� ����
		 */
		
		// �����׽�Ʈ
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx �������� ����غ���
		// 1. println ���
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		// 2. printf ��� => �������̹Ƿ� %d�������� �ڸ��� ����ֱ�
		//				      �ٹٲ� ����� �����Ƿ� �ٹٲ��� �Ͼ �� �ֵ��� �������ֱ� => \n
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
				// ������ �� : ������ ������ ������ ���缭 �������ֱ�!!
		
		// 10 + 20 = 30 ����غ���
		// 1. println ���
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		// 2. printf ���
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1 + iNum2));
		
		// ���� ���İ� ���� �� �� �ִ� �ɼ�
		System.out.printf("%5d\n", iNum1); // 5ĭ Ȯ�� & ����������
		System.out.printf("%-5d\n", iNum1); // 5ĭ Ȯ�� & ��������
		
		
		// �Ǽ��׽�Ʈ
		double dNum = 4.27546789;
		
		// dNum : xx.xxx �������� ���
		System.out.println("dNum : " + dNum); // dNum : 4.27546789
		System.out.printf("dNum : %f\n", dNum); // dNum : 4.275468
		// %f : �Ҽ��� �Ʒ� 7��° �ڸ����� �ݿø��Ǿ� 6��° �ڸ����� ��µ�
		
		// �Ǽ� ���İ� ���� �� �� �ִ� �ɼ�
		System.out.printf("dNum : %.1f\n", dNum); // dNum : 4.3
		// %.1f : �Ҽ��� �Ʒ� 2��° �ڸ����� �ݿø��Ǿ� 1��° �ڸ����� ��µ�
		
		
		// ���ڿ� ���ڿ� �׽�Ʈ
		char c = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", c, str); // a Hello
		 
		// ���� �Ǵ� ���ڿ��� ���� �� �� �ִ� �ɼ�
		System.out.printf("%C %S\n", c, str); // A HELLO
		// %C, %S : ���� ���ĺ��� ��� �빮�ڷ� �����ؼ� ���
		
	}
	
}
