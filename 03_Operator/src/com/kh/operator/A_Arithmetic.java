package com.kh.operator;

import java.util.Scanner;

// ��� ������
public class A_Arithmetic {
	
	/*
	 * * ��� ������ : ���׿����ڷν� ���� ����� �켱 ������ �Ϲ� ���� ����� ����
	 * [����]
	 *  + : ���� 
	 *  - : ����
	 *  * : ����
	 *  / : ������		  => ���������� ���� ����
	 *  % : ��ⷯ(Modular) => ���������� �������� ����
	 */
	
	public void method1() {
		// ������ ���
		int num1 = 10;
		int num2 = 3;
		
//		System.out.println("num1 + num2 = " + num1 + num2); // num1 + num2 = 103
		System.out.println("num1 + num2 = " + (num1 + num2)); // num1 + num2 = 13
		// ���ڿ��� int�� ��������ִ� +�� ���ڳ����� ��������� ���ִ� +�� �켱������ �����ϱ� ������
		// ���ʿ������� ���ʴ�� ������ ����Ǳ� ������ ()�� ���� ��������� +�� �켱������ ������
		
//		System.out.println("num1 - num2 = " + num1 - num2); // �����߻� (���ڿ� - ���� => undefined)
		System.out.println("num1 - num2 = " + (num1 - num2)); // num1 - num2 = 7
		// ���ڿ��� int�� ��������ִ� +�� ���ڳ����� ��������� ���ִ� -�� �켱������ �����ϱ� ������ 
		// ���ʿ������� ���ʷ� ������ ����Ǳ� ������ ()�� ���� ��������� -�� �켱������ ������
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		// ����, ������, ��ⷯ�� ��� �������� �켱������ ���⶧���� ()�� ���� �ʾƵ� ��Ȯ�� ����� ����
		// => �ٸ� �������� ���� ����� ()�� �����ִ°��� ����!!
		
//		System.out.println(10 / 0);
//		System.out.println(10 % 0);
		// ArithmeticException : / by zero
		// ���а� ���������� ���α׷��� �󿡼� 0���� ������� �Ұ���!! ����!!
		
		
		// �Ǽ��� ���
		double a = 35; // �ڵ�����ȯ -> 35.0
		double b = 10; // �ڵ�����ȯ -> 10.0
		
		System.out.println("a + b = " + (a + b)); // 45.0
		System.out.println("a - b = " + (a - b)); // 25.0
		System.out.println("a * b = " + (a * b)); // 350.0
		System.out.println("a / b = " + (a / b)); // 3.5 
		System.out.println("a % b = " + (a % b)); // 5.0
		// �Ǽ������� ������� �������� �Ǽ�
		
	}

	// ���빮��
	public void method2() {
		
		/*
		 * �ο� ���� ������ ������ Ű����κ��� �Է¹ް�
		 * 1�δ� �����ϰ� �������� ������ ������
		 * ���� ������ ������ ����ϼ���
		 * 
		 * ���࿹��
		 * �ο��� : x
		 * �������� : x
		 * 
		 * 1�δ� �������� �������� : x
		 * ���� �������� : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο����� �Է��ϼ��� : ");
		int p = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("���������� �Է��ϼ��� : ");
		int c = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("�ο��� : " + p);
		System.out.println("�������� : " + c);
		System.out.println();
		// println�� �̿�
//		System.out.println("1�δ� �������� �������� : " + (c / p));
//		System.out.println("���� �������� : " + (c % p));
		// printf�� �̿�
		System.out.printf("1�δ� �������� �������� : %d\n", (c / p));
		System.out.printf("���� �������� : %d\n", (c % p));
	}
	
	
	
}
