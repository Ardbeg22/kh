package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest {

	/*
	 * �� Ŭ���� ���� �������� �޼ҵ带 ������ �� �� ����
	 * ������ ���� �޼ҵ带 ������ �ʿ䵵 ����
	 */
	
	// �Ϲ� �޼ҵ�� �ۼ�
	public void testPrintA() {
		
		// �� �޼ҵ尡 ȣ��Ǵ� ���� ������ ���� �ۼ�
		System.out.println("testPrintA �޼ҵ� ����");
		
		// testPrintA�� ���� Ŭ���� ���� ��ġ�ϹǷ� �޼ҵ�� ȣ��
		testPrintB(); // testPrintB �޼ҵ� ȣ�� 
					  // testPrintB()������ ������ �ٽ� ȣ���� ������ ���ƿ�

//		testPrintC(); // testPrintC �޼ҵ� ȣ���ϴ� ��� 1
	}
	
	public void testPrintB() {
		
		System.out.println("testPrintB �޼ҵ� ����");
		
		testPrintC(); // testPrintC �޼ҵ� ȣ���ϴ� ��� 2
	}
	
	public void testPrintC(){
		
		System.out.println("testPrintC �޼ҵ� ����");
		
//		testPrintA(); 
		// ���� �� �������� testPrintA �޼ҵ带 ȣ���� ���? 
		// => Run���Ͽ��� A, B, C,�� ���ѹݺ��� ȣ�� 
		// => �� ��� ���ѹݺ����� ����� ����Ǵٰ� StackOverflowError�� �߻�
		// StackOverflowError : �޸𸮰� ���̻� �ߵ��� ���ϰ� ���α׷��� �����Ŵ
		
		/*
		 * �������
		 * 1. �ڵ� �ۼ� => �ϵ��ũ(HDD)�� ���� (������ ���� == "���α׷�")
		 * 2. �����Ϸ��� ���� ����� ����
		 * 3. JVM�� ���ؼ� ���� => �޸𸮿���(RAM)���� �ε��ʰ� ���ÿ� ���� (������ ���� == "���μ���")
		 * 
		 * Stack : �޸� ������ ���� �� �ϳ�. Stack�� ũ�⸦ ��� ��� StackOverflowError �߻�
		 */
	}
	
}
