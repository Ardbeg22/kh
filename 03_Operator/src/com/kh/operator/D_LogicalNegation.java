package com.kh.operator;

// ������ ������
public class D_LogicalNegation {
	
	/*
	 * * ������ ������ : ���׿����ڷν� ����(true/false)�� �ݴ�� �ٲ��ִ� ������
	 * 
	 * [ǥ����]
	 * !����
	 */
	
	public void method() {
		
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		boolean b = true;
		boolean b2 = !b; // b2���� false�� ����
		System.out.println("b : " + b); // b : true => b�� �״�� true ����
		System.out.println("b2 : " + b2); // b2 : false
		// ������ �����ڴ� �������� �ٽ� �ڱ��ڽſ��� �������� ����!!
		
		System.out.println(3 + 5 < 1); // false
		System.out.println(!(3 + 5 < 1)); // true
		// ������ �����ڴ� ���������, �񱳿����ں��� �켱������ ���⶧���� ()�� 3+5<1�� �켱������ ���������
		
	}
	
}
