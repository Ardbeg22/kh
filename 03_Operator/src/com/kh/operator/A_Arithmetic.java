package com.kh.operator;

import java.util.Scanner;

// 산술 연산자
public class A_Arithmetic {
	
	/*
	 * * 산술 연산자 : 이항연산자로써 연산 방법과 우선 순위가 일반 수학 산술과 동일
	 * [종류]
	 *  + : 덧셈 
	 *  - : 뺄셈
	 *  * : 곱셈
	 *  / : 나눗셈		  => 나눗셈에서 몫을 구함
	 *  % : 모듈러(Modular) => 나눗셈에서 나머지를 구함
	 */
	
	public void method1() {
		// 정수일 경우
		int num1 = 10;
		int num2 = 3;
		
//		System.out.println("num1 + num2 = " + num1 + num2); // num1 + num2 = 103
		System.out.println("num1 + num2 = " + (num1 + num2)); // num1 + num2 = 13
		// 문자열과 int를 연결시켜주는 +와 숫자끼리의 산술연산을 해주는 +의 우선순위가 동일하기 때문에
		// 왼쪽에서부터 차례대로 연산이 진행되기 때문에 ()로 실제 산술연산인 +의 우선순위를 높여줌
		
//		System.out.println("num1 - num2 = " + num1 - num2); // 오류발생 (문자열 - 숫자 => undefined)
		System.out.println("num1 - num2 = " + (num1 - num2)); // num1 - num2 = 7
		// 문자열과 int를 연결시켜주는 +와 숫자끼리의 산술연산을 해주는 -의 우선순위가 동일하기 때문에 
		// 왼쪽에서부터 차례려 연산이 진행되기 때문에 ()로 실제 산술연산인 -의 우선순위를 높여줌
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		// 곱셈, 나눗셈, 모듈러의 경우 덧셈보다 우선순위가 높기때문에 ()로 묶지 않아도 정확한 결과가 나옴
		// => 다만 가독성을 위해 연산시 ()로 묶어주는것을 권장!!
		
//		System.out.println(10 / 0);
//		System.out.println(10 % 0);
		// ArithmeticException : / by zero
		// 수학과 마찬가지로 프로그래밍 상에서 0으로 나누기는 불가함!! 주의!!
		
		
		// 실수일 경우
		double a = 35; // 자동형변환 -> 35.0
		double b = 10; // 자동형변환 -> 10.0
		
		System.out.println("a + b = " + (a + b)); // 45.0
		System.out.println("a - b = " + (a - b)); // 25.0
		System.out.println("a * b = " + (a * b)); // 350.0
		System.out.println("a / b = " + (a / b)); // 3.5 
		System.out.println("a % b = " + (a % b)); // 5.0
		// 실수끼리의 산술연산 실행결과는 실수
		
	}

	// 응용문제
	public void method2() {
		
		/*
		 * 인원 수와 사탕의 개수를 키보드로부터 입력받고
		 * 1인당 동일하게 나눠가진 사탕의 개수와
		 * 남은 사탕의 개수를 출력하세요
		 * 
		 * 실행예시
		 * 인원수 : x
		 * 사탕개수 : x
		 * 
		 * 1인당 나눠가질 사탕개수 : x
		 * 남는 사탕개수 : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수를 입력하세요 : ");
		int p = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사탕개수를 입력하세요 : ");
		int c = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("인원수 : " + p);
		System.out.println("사탕개수 : " + c);
		System.out.println();
		// println문 이용
//		System.out.println("1인당 나눠가질 사탕개수 : " + (c / p));
//		System.out.println("남는 사탕개수 : " + (c % p));
		// printf문 이용
		System.out.printf("1인당 나눠가질 사탕개수 : %d\n", (c / p));
		System.out.printf("남는 사탕개수 : %d\n", (c % p));
	}
	
	
	
}
