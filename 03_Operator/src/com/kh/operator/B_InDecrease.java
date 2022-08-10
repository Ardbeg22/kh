package com.kh.operator;

// ���� ������
public class B_InDecrease {
	
	/* 
	 * * ���� ������ : ���׿����ڷν� ���� 1���� ������Ű�ų� Ȥ�� ���ҽ�Ű�� ������
	 * 
	 * [����]
	 * ++ : ���� 1�� ������Ű�� ������
	 * 	    ++�� (����������)
	 * 		��++ (����������)
	 * -- : ���� 1�� ���ҽ�Ű�� ������
	 * 		--�� (����������)
	 * 		��-- (����������)
	 * 
	 * (����������)�� : �������� => ������ ��ó��
	 * ��(����������) : �������� => ��ó�� ������
	 * 
	 */
	
	public void method1() {
		
		int num = 10;
		
		System.out.println("num : " + num);
		
		num++; // num�� ���� 1 ������Ű�ڴٴ� �ǹ�
			   // num = num + 1;�� ���� �ǹ�
		System.out.println("����� num : " + num);
		
		int num2 = 10;
		
		System.out.println("num2 : " + num2);
		
		num2--; // num2�� ���� 1 ���ҽ�Ű�ڴٴ� �ǹ�
				// num2 = num2 - 1;�� ���� �ǹ�
		System.out.println("����� num2 : " + num2);
		
	}
	
	public void method2() {
		
		// ++ �������� 
		// �������� : ������ ��ó��
		int a = 10; // 1) a�� ���� 10
		int b = ++a; // 2) a�� ���� �켱������ 1 ���� �� b�� ����
					 //    => ��, a�� b ��� 11
		System.out.println("a : " + a + " b : " + b); // a : 11 b : 11
		// �������� : ��ó�� ������
		int c = 10; // 1) c�� ���� 10
		int d = c++; // 2) �켱������ d�� c�� �� ����. ���Ŀ� c�� ���� 1 ����
					 //    => ��, d�� 10 c�� 11
		System.out.println("c : " + c + " d : " + d); // c : 11 d : 10
		
	}

	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		
		System.out.println("num1 : " + num1); // num1 : 21
		System.out.println("result1 : " + result1); // result1 : 60
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println("num2 : " + num2); // num2 : 21
		System.out.println("result2 : " + result2); // result2 : 63
		
		// ��� : ������������ ���, �ϴ� ���ٰ� �����ϰ� ó���� �� �� �� ���������� �����ڸ� ó��
	}
	
	// ����
	public void method4() {
		
		int a = 5; // a = 6 -> 7
		int b = 10; // b = 9
		int c = ++a + b; // c = 6+10 = 16 -> 15
		int d = c / a; // d = 16/6 = 2 -> 1
		int e = c % a; // e = 16%6 = 4 -> 5 -> 6
		int f = e++; // f = 4
		int g = --b + d--; // g = 9+2 = 11 -> 10
		int h = 2; 
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		// i = 6+9/(15/4)*(11-1)%(6+2) = 6+9/3*10%8 = 6+30%8 = 6+6 = 12
		
		System.out.printf("a:%d b:%d c:%d d:%d e:%d f:%d g:%d h:%d i:%d", a,b,c,d,e,f,g,h,i);
	}
	
}
