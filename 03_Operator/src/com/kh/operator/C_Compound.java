package com.kh.operator;

// ���մ��� ������
public class C_Compound {
	
	/*
	 * * ���մ��� ������ : ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� ������
	 * 
	 * [����]
	 * 	+=
	 *  -=
	 *  *=
	 *  /=
	 *  %=
	 *  => �ش� ������� ���� �� �ڱ� �ڽſ��� �����ϰڴٴ� �ǹ�
	 *  
	 *  ex) a = a + 3;
	 *  	a += 3; // ������ a���� 3�� ���� �� �̸� �ٽ� a���� �����ϰڴٴ� �ǹ�
	 */
	
	
	public void method() {
		
		int num = 12;
		System.out.println("���� num : " + num); // 12
		
		// num�� 3 ������Ű��
		num = num + 3;
		System.out.println("3 ������Ų num : " + num); // 15
		
		num += 3; // num = num + 3
		System.out.println("3 ������Ų num : " + num); // 18
		
		// num�� 5 ���ҽ�Ű�� 
		num -= 5; // num = num - 5
		System.out.println("5 ���ҽ�Ų num : " + num); // 13
		
		// num�� 6�� ������Ű��
		num *= 6; // num = num * 6
		System.out.println("6�� ������Ų num : " + num); // 78
		
		// num�� 2�� ���ҽ�Ű��
		num /= 2; // num = num / 2
		System.out.println("2�� ���ҽ�Ų num : " + num); // 39
		
		// num�� 4�� ���������� �������� num�� ����
		num %= 4; //num = num % 4;
		System.out.println("���� num : " + num); // 3
		
		
		// + : ���ڳ��� �����ϸ� ����. ���ڿ��� �ٸ�Ÿ�Գ��� �����ϸ� ����(�� ���� ���ڿ��� ���̾���)
		// += : ���ڿ����� ���� ����
		String str = "Hello";
		
		str += "World"; //str = str + "World";
		System.out.println(str);
		
	}
	
}
