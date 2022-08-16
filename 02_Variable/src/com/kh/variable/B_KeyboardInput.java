package com.kh.variable;

import java.util.Scanner; // 2�ܰ�

// ����ڰ� Ű����� �Է��� ���� ������ ��� ���
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * * �ڹٸ� ���ؼ� ����ڷκ��� ��� ���� "�Է�"��������
		 * 	  �ڹٿ��� �����ϴ� java.util.Scanner Ŭ������ �̿� 
		 * 	 => Scanner Ŭ�������� �����ϴ� �̹� ������� �޼ҵ���� ȣ��
		 * 
		 * - ���� ���� ���� �ۼ� ���� Ŭ������ �ٸ� Ŭ������ �ִ� �޼ҵ带 ȣ���ϰ� �ʹٸ�?
		 * 1. ȣ���ϰ��� �ϴ� �޼ҵ尡 �ִ� Ŭ������ �뺯���̸��� ���� (new)
		 * 2. ���� �� Ŭ������ �ٸ� ��Ű���� ���� ��� import�� �߰�
		 * 3. �뺯���̸� ���ؼ� �ش� �޼ҵ� ȣ�� 
		 */
		
		Scanner sc = new Scanner(System.in); // 1�ܰ�
		// System.in : �Է¹��� ������ ����Ʈ ������ �о���̰ڴٴ� �ǹ�
		
		// ������� ���������� �Է¹޴� ���α׷� ���� - �̸�, ����, Ű
		
		// �Է¹ް����ϴ� ������ ���� ����ؼ� �Է��� ����
		System.out.print("����� �̸��� �����Դϱ�? : "); // �̸� : String(���ڿ�)
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� : next(), nextLine()

//		sc.next(); // �Է¸� �ް� ���� ������ ����� ����
//		String name = sc.next(); // ��������� ���ÿ� Ű����κ��� �Է¹����� ����
		// next() : ����ڰ� �Է��� �� �߿��� ������ �ִ� ��� ���� ���������� �Է��� ���� 
		//	        ex.ȫ �浿 -> ȫ
		
//		sc.nextLine(); // �Է¸� �ް� ��
		String name = sc.nextLine(); 
		// nextLine() : ����ڰ� �Է��� �� �߿��� ������ ���� ��� ���鿡 �����ϰ� �� �� ������ ���� �Է� ����
		// => Ư�� ����ڰ� �Է��� ���� ������ ���Ե� ������ ���� ��� nextLine()�� ����ϴ°� �� ���� ex) �ּ���
//		System.out.println(name); // �Է°� Ȯ�ο�
				
		System.out.print("����� ���̴� �� ���Դϱ�? : "); // ���� : int(������)
		// ����ڰ� �Է��� ���� ������ �޾ƿ��� �޼ҵ� : nextInt()
		int age = sc.nextInt();
//		System.out.println(age); // �Է°� Ȯ�ο�
		
		System.out.print("����� Ű�� �� cm�Դϱ�? : "); // Ű : double(�Ǽ���)
		// ����ڰ� �Է��� ���� ����� �޾ƿ��� �޼ҵ� : nextDouble()
		double height = sc.nextDouble();
//		System.out.println(height); // �Է°� Ȯ�ο�
		System.out.println(name+"���� ���̴� "+age+"���̰�, Ű�� "+height+"cm�Դϴ�.");
		
		// Scanner���� �����ϴ� �Է� �޼ҵ���� ��� ���͸� ġ�� ������ ������ ��������
		
	} // inputTest1 �޼ҵ� ������ ��
	
	
	// Ű����� ���� �Է¹��� �� ���� �߻��Ǵ� ����
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		// stack������ name�̶�� �̸��� �� string���� ���� -> ���۾ȿ� ȫ�浿�̶�� �Է°��� ���
		// -> ����Ű�� ������ ���� \n�� ���� ������ ������ �Է°� ȫ�浿�� heap������ ��� 
		// -> ȫ�浿�� ��� heap������ string������ �ּҰ��� stack������ name�� ���
		// -> nextLine�� �Է°��� ������ ���� ���� ���๮�ڸ� ���ּ� ���۸� �����
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		// stack������ age��� �̸��� �� int���� ���� -> ���۾ȿ� 16�̶�� �Է°��� ���
		// -> ����Ű�� ������ ���� \n�� ���� ������ ������ �Է°� 16�� stack������ age�� ���
		// nextInt�� �Է°��� ������ ���� ���� ���๮��(\n)�� �������� ����
		
		// ���ۿ� ���๮�ڰ� �����ִ� ���� => ���� �ذ��� ���� ���۸� �ѹ� ��������!!!!!
		sc.nextLine(); // ������ �뵵�� �ƴϹǷ� �Է¸� ������ ��
		// ���۰� ����� ����
		
		// nextLine()�޼ҵ�� ���ۿ��� "����"���������� ��� ���� ������ �� ���۸� ����ִ� ����
		// nextLine() �̿��� �޼ҵ���� ���۸� �������� ����!!
		// ��� => nextLine() �̿��� �޼ҵ带 ȣ���� ��� nextLine()�� ȣ���Ͽ� ���� ����ֱ�
		
		System.out.print("�ּ� : "); // �ּ� : Ű : �� ���
		String address = sc.nextLine(); // �� �ڵ� �ν� �� ��
		// stack���� address��� �̸��� �� string���� ���� -> ���۾ȿ� ������ ���� ���๮�ڰ� ����
		// -> ���๮�� ���� ���ڿ�("")�� heap������ ���
		// -> ���ڿ��� ��� heap������ string������ �ּҰ��� stack������ address�� ���
		// -> nextLine�� �Է°��� ������ ���� ���� ���๮��(\n)�� ���ּ� ���۸� �����
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		// stack������ height��� �̸��� �� double���� ���� -> ���۾ȿ� 170.2�̶�� �Է°��� ���
		// -> ����Ű�� ������ ���� \n�� ���� ������ ������ �Է°� 170.2�� stack������ height�� ���
		// -> nextDouble�� �Է°��� ������ ���� ���� ���๮��(\n)�� �������� ����
		
		sc.nextLine(); // ���� ����ֱ�

		
		// xxx���� xx���̸�, ��� ���� xxxx�̰�, Ű�� xxxcm�Դϴ�.
		System.out.println(name+"���� "+age+"���̸�, ��� ���� "+address+"�̰�, Ű�� "+height+"cm�Դϴ�.");
		
	} // inputTest2 �޼ҵ� ������ ��
	
	
	// �� �̿��� �Է� �޼ҵ�� 
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * * Scanner�� �Է¿� �޼ҵ��
		 * ���ڿ��� �Է¹ް��� �� �� : next(), nextLine()
		 * �������� �Է¹ް��� �� �� : nextInt(), nextByte(), nextShort(), nextLong()
		 * �Ǽ����� �Է¹ް��� �� �� : nextDouble(), nextFloat()
		 * ������ �Է¹ް��� �� �� : nextBoolean()
		 * ���ڰ��� �Է¹ް��� �� �� : �ش� �޼ҵ尡 ����
		 */
		
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		// gender�� ����(char)Ÿ������ �Է¹ް��� ��
		
		// index : ����, ���� 
		// "apple" ���ڿ����� a�� ��ġ�� ã������?
		//  01234
		// => a�� ��ġ��(index)�� 0 
		// => e�� ��ġ��(index)�� 4
		
		// �켱������ nextLine() �޼ҵ带 �̿��Ͽ� ���ڿ� ���·� �Է¹ް� 
		// �� �Է¹��� ���ڿ��κ��� 0��° �ε����� ���ڰ� �ϳ��� ����
		// => charAt(��ġ��) : ���ڿ��κ��� �ش� ��ġ���� �ش�Ǵ� ���� �ϳ��� �����ִ� �޼ҵ�
		//                   ��ġ���� 0���� ���� 
		//    [ǥ����] ���ڿ�.charAt(��ġ��);
		char gender = sc.nextLine().charAt(0); // ���� ���ڿ��� �Է¹��� �� 0��° ���ڸ� �����Ͽ� gender�� ����
		
//		char err = sc.nextLine().charAt(100); // �����߻� - StringIndexOutOfBoundsException
		// StringIndexOutOfBoundsException : �����ϰ��� �ϴ� �ε������� ���ڿ��� ���̸� �Ѿ�� �� �߻�
		// => �迭������ ����� ���� �߻� ���� 
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // ���� ����
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		sc.nextLine(); // ���� ���� (�������̶� �����൵ �Ǳ� ��)
		
		System.out.println(name + " ���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
	} // inputTest3 �޼ҵ� ������ ��
	
	
	// �ǽ� - ���빮��1
	public void inputTest4() {
		
		/*
		 * ���� ���ڿ� ���� Ű����� �Է¹��� ��
		 * �� ���ڿ��κ��� �տ��� ������ ����غ���
		 * 
		 * ��¿���
		 * ù��° ���� : x
		 * �ι�° ���� : x
		 * ����° ���� : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3���� �̻��� ���ڿ��� �Է��ϼ��� : ");
		
		// ���� �ϴ� �Ǽ� 
		//char ch1 = sc.nextLine().charAt(0);
		//char ch2 = sc.nextLine().charAt(1);
		//char ch3 = sc.nextLine().charAt(2);
		
		// ù��° Ǯ�� - �������O
//		String str = sc.nextLine(); // �켱������ ���ڿ��� �ѹ� �Է¹޾Ƽ� ������ �����صα�
//		char ch1 = str.charAt(0);
//		char ch2 = str.charAt(1);
//		char ch3 = str.charAt(2);
//		
//		System.out.println("ù��° ���� : " + ch1);
//		System.out.println("�ι�° ���� : " + ch2);
//		System.out.println("����° ���� : " + ch3);
		
		// �ι�° Ǯ�� - �������X
//		String str = sc.nextLine();
//		System.out.println("ù��° ���� : " + str.charAt(0));
//		System.out.println("�ι�° ���� : " + str.charAt(1));
//		System.out.println("����° ���� : " + str.charAt(2));
		
		
		// Apple �Է½� App�� ���·� ����ϰ� �ʹٸ�?
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
//		System.out.println(ch1 + ch2 + ch3); // ��� : 289
		// char�� int���̶� ���� ����ȯ�� ������ ���� => int������ ����ȯ�Ͽ� ���� ��µ�
		
		// �츮�� ��� ������ �ذ��� �� �ִ� ���
		// �ذ���1
//		System.out.print(ch1);
//		System.out.print(ch2);
//		System.out.print(ch3);
		
		// �ذ���2
		System.out.println(""+ ch1 + ch2 + ch3); // ���ڿ�("")�� ���ϸ� ���ڿ��� �ν�
		
		
	} // inputTest4 �޼ҵ� ������ ��
	
	
	// ���빮��2
	public void inputTest5() {
		
		/*
		 * Ű����� ���� 2���� �Է¹޾� 
		 * �μ��� ��, ��, ��, �������� ����� ���� ���
		 * 
		 * ��¿���
		 * ���ϱ� ��� : x
		 * ���� ��� : x
		 * ���ϱ� ��� : x
		 * ������ ��� : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// ������ �켱���� : ����,������ -> ����,���� & ���� �������� ������� ����
		System.out.println("���ϱ� ��� : " + (num1+num2));
		System.out.println("���� ��� : " + (num1-num2));
		System.out.println("���ϱ� ��� : " + num1*num2);
		System.out.println("������ ��� : " + num1/num2);
	}
	
	// ���� 
	public void inputTest6() {
		
		/*
		 * Ű����� ����, ���ΰ��� �Ǽ������� �Է¹޾Ƽ�
		 * �簢���� ������ �ѷ��� ���
		 * 
		 * ��Ʈ
		 * �簢�� ���� : ����*����
		 * �簢�� �ѷ� : (����+����)*2
		 * 
		 * ���࿹��
		 * ���α��̸� �Է��ϼ��� : 
		 * ���α��̸� �Է��ϼ��� :
		 * 
		 * ���� : xx
		 * �ѷ� : xx
		 */
		
	}
	
	
}
