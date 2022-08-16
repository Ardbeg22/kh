package com.kh.variable;

public class A_Variable { // A_Variable == com.kh.variable.A_Variable

	// * ������ �ʿ伺
	// �ñް� �ٹ��ð��� �ٹ��ϼ��� ���ؼ� ������ ����ϴ� ���α׷�
	public void printSalary() {
		
		System.out.println("===== ���� ��� �� ====="); // ������ ���
		
		System.out.println("�ñ� : 10000 ��");
		System.out.println("�ٹ��ð� : 6 �ð�");
		System.out.println("�ٹ��ϼ� : 5 ��");
		
		// ���� = �ñ� x �ٹ��ð� x �ٹ��ϼ�
		// ȫ�浿 : 00000 �� �������� ���
		
//		System.out.println("������ : 9160 x 6 x 5 ��");
//		System.out.println("������ : 9160 x 6 x 5 ��");
//		System.out.println("�赵�� : 9160 x 6 x 5 ��");
//		System.out.println("����� : 9160 x 6 x 5 ��");
		// ���� �������δ� ���ϴ� ����� ������ ����
		
		// ��Ģ 1. �ڹٿ��� ���ڿ��� ""(�ֵ���ǥ) �ȿ� ǥ��
		// ��Ģ 2. �ڹٿ��� ���������� xǥ�ð� �ƴ� *ǥ�÷� ǥ��
		// ��Ģ 3. �ڹٿ��� ���� �ٸ� ������ ������ ���̾� ���̰� ���� ������ +ǥ�ø� ���
		
		System.out.println("������ : " + 10000*6*5 + " ��");
		System.out.println("������ : " + 10000*6*5 + " ��");
		System.out.println("�赵�� : " + 10000*6*5 + " ��");
		System.out.println("����� : " + 10000*6*5 + " ��");
		
		// ������ ������� ���� ���
		// => ���� ������ ��� ������ ���� ã�ƴٴϸ鼭 �����ϱ� �ſ� ������
		// => �Ǽ��� �߸��� ���� �Է��� ���� ����
		
		System.out.println(); // EnterŰ�� ģ ȿ��
		System.out.println("===== ���� ��� �� =====");
		
		// ���� ������ �ϴ� ������ "����"�� ��Ƶα�
		// ��Ģ 4. �ڹٿ����� = ǥ�ô� "�����ϰڴ�"��� �ǹ�
		// 		  �߰������� �ڹٿ����� "����"��� �ǹ̴� == ��ȣ�� ���
//		int pay = 10000; // pay��� �̸��� ���� ���ڿ� 10000�̶�� ���� �����ϰڴٴ� �ǹ�
		int pay = 11000; // pay�� 10000���� 11000���� ����
		int time = 6; // time�̶�� �̸��� ���� ���ڿ� 6�̶�� ���ڸ� �����ϰڴٴ� �ǹ�
		int day = 5; // day��� �̸��� ���� ���ڿ� 5��� ���ڸ� �����ϰڴٴ� �ǹ�
		
		System.out.println("�ñ� : " + pay + " ��");
		System.out.println("�ٹ��ð� : " + time + " �ð�");
		System.out.println("�ٹ��ϼ� : " + day + " ��");
		
		System.out.println("������ : " + pay*time*day + " ��");
		System.out.println("������ : " + pay*time*day + " ��");
		System.out.println("�ڼ��� : " + pay*time*day + " ��");
		
		
		/*
		 * * ������ ����ϴ� ����
		 * 1. ������ �켱������ ���� �ǹ̸� �ο��� �������� ���� => �������� ������
		 * 2. �� �ѹ� ���� ����صΰ� �ʿ��� ������ ��� ����� �������� ���� => ���뼺�� ������ (�ڵ差 ����)
		 * 3. ���������� ���� ���ϰ� �� �� ����
		 */
	} // printSalary �޼ҵ� ������ ��
	
	// ������ ����
	public void declareVariable() {
		
		/*
		 * * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ �Ҵ��ϰڴ�
		 * == ���� ����ϱ� ���� ������ �޸� ������ Ȯ���صΰڴ� (�����Ա�)
		 * == ���� ��Ƶ� �� �ִ� ���ڸ� ����ڴ�
		 * 
		 * [ǥ����] �ڷ��� ������;
		 * - �ڷ��� : ������ ũ�� �� ��� ����(������ ����)
		 * - ������ : ������ �̸� ����
		 * 
		 * * ���� ����� ������ ��
		 * 1. �������� �ҹ��ڷ� �����ϰԲ� �̸� ������ �� (��,��Ÿǥ��� ��Ű�� )
		 * 2. ���� ����({}) �ȿ����� ������ ������ ���� �Ұ� (������ �ߺ� �Ұ�)
		 * 3. �ش� ����({})�� ����� ������ �ش� ���� �ȿ����� ��� ����
		 * 	  => �ٸ� �޼ҵ忡���� ��� �Ұ� (���������� ����)
		 */
		
		// ----- �ڷ����� ���� ���� -----
		// �⺻�ڷ��� / �����ڷ���
		// 1. ����(���� - true/false)
		boolean isTrue; // 1byte¥�� �� ���� ������
		
		// 2. ������ 
		// 2_1. ������(�Ҽ��� x)
		byte bNum; // 1byte (-128 ~ 127)
		short sNum; // 2byte (-32768 ~ 32767)
		int iNum; // 4byte (-21��XX ~ 21��XX) => ������ �ڷ����� �⺻ (CPU�� ������ 4byte ������ ó���ϱ� ����)
		long lNum; // 8byte (���� ���� ������ ���� ǥ�� ����)
		// 2_2. �Ǽ���
		float fNum; // 4byte (�Ҽ��� �Ʒ� 7�ڸ����� ǥ�� ����)
		double dNum; // 8byte (�Ҽ��� �Ʒ� 15�ڸ����� ǥ�� ����) => �Ǽ��� �ڷ����� �⺻ (�� ������ ǥ���� �����ϱ� ����)
		
		// 3. ������
		char ch; // 2byte
		
		// ----- ������� �� 8���� �⺻ �ڷ��� -----
		
		// �����ڷ��� 1����
		// 4. ���ڿ���
		String str; // ǥ������δ� 4byte => ���ڿ��� ���̴� ������ �� ���� ������ 4byte¥�� ���ڿ� ���� ���� ������� ����!!
		
		// ----- ������� �� 9���� �� ���ڰ� ������ -----
		
		/*
		 * * ������ ���� ����
		 * ������ ���� ��� == �� ���ڿ� �� ���
		 * 
		 * [ǥ����] ������ = ��;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long Ÿ���� ��� long Ÿ������ �˷��ֱ� ���� L�� ��� (l, L �� �� ���������� L�� �� ����)
		fNum = 4.0f; // float Ÿ���� ��� float Ÿ������ �˷��ֱ� ���� "�ݵ��" f��� 
		dNum = 8.0;
		ch = 'A'; // ���ڴ� �ݵ�� ''(Ȭ����ǥ) �ȿ� �ۼ��ؾ���
		str = "ABC"; // ���ڿ��� �ݵ�� ""(�ֵ���ǥ) �ȿ� �ۼ��ؾ���
		
		// �� ������ ��� ������ ���
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
	} // declareVariable �޼ҵ� ������ ��
	
	// ���� ����� ���ÿ� �ʱ�ȭ (�����ε� ���� ���� �̷������ ������ �ʱ�ȭ�� ��)
	public void initVariable() {
		
		/*
		 * * ���� ����� ���ÿ� �ʱ�ȭ
		 * ���ڸ� ����� ���ÿ� ���� ä���ִ´ٴ� �ǹ�
		 * 
		 * [ǥ����] �ڷ��� ������ = ��; 
		 *    �������   1     3 2  
		 */
		
		// �⺻�ڷ��� 8����
		// 1. ����
		boolean isTrue = 3 + 5 < 1; // 1byte 
		//boolean isTrue = false; �� ����
		// 3 + 5 < 1 : "8 < 1 ?"�� �ǹ� => false
		// ���� �������� ���� true / false�� �� �� ������ �������� ������ ���ĵ� �� �� �ִ�
		
		// 2_1. ������
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte
		long lNum = 8L; // 8byte
		
		// 2_2. �Ǽ���
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte
		
		// 3. ������
		char ch = '��'; // 2byte
		
		// �����ڷ��� 1����
		// 4. ���ڿ���
		String str = "�ڹ� ������"; 
		
		// �� ������ ��� �� ���
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
	} // initVariable �޼ҵ� ���� ��
	
	// ��� 
	public void constant() {
		
		// ������ ��� 
		int age = 20;
		System.out.println("age : " + age); // 20
		
		age = 25;
		System.out.println("����� age : " + age); // 25
		
		
		// ��� : �ѹ� ��ϵ� ���� ���� �Ұ�(�׻� �������� ���� ����� �� ���)
		// [ǥ����] final �ڷ��� �����; 
		//        final �ڷ��� ����� = ��;
		// => ������� �빮�ڷ� ���´�
		
		// ����� ���
		final int AGE = 20;
		System.out.println("��� age : " + AGE); // 20
		
		// ���� AGE��� ������ ���� �� �����ϴ� ������ ���´ٸ�?
//		AGE = 21; // ���� �߻�
		
		
	}
		
	
}
