package com.kh.operator;

import java.util.Scanner;

// 비교 연산자
public class E_Comparison {
	
	/*
	 * * 비교 연산자(관계 연산자) : 이항연산자로써 두 개의 값을 비교
	 * 						비교 연산한 결과가 참일 경우 true / 거짓일 경우 false
	 * 	=> 후에 특정 조건을 제시할 수 있는 "조건문"에서 많이 쓰일 예정
	 * 
	 * 크고 작음을 비교 (4가지)
	 * 1. a < b : a가 b보다 작은가?
	 * 2. a > b : a가 b보다 큰가?
	 * 3. a <= b : a가 b보다 작거나 같은가?
	 * 3. a >= b : a가 b보다 크거나 같은가?
	 * 
	 * 일치함을 비교 (2가지)
	 * 1. a == b : a와 b가 일치하는가?
	 * 2. a != b : a와 b가 일치하지 않는가?
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b)); 
		// 산술연산자(+)가 비교연산자(>)보다 우선순위가 높기때문에
		// a > b 부분은 괄호로 묶어서 비교연산자의 우선순위 높여줘야함
		
		System.out.println("a <= b : " + (a <= b));
		
		boolean result1 = (a == b); // false
		System.out.println("result1 : " + result1);
		
		boolean result2 = (a != b); /// true
		System.out.println("result2 : " + result2);
		
		// 산술연산 + 비교연산 => 우선순위에 의해 산술연산이 먼저 진행된 후 마지막으로 비교가 이루어짐
		System.out.println("a - b < 0 :" + (a - b < 0));
		
		// 예시1) 어떤 수가 있을 때 양수/음수 판별
		// => 양수 : 0보다 큰 수
		// => 음수 : 0보다 작은 수
		
		// 예시2) 어떤 수가 있을 때 짝수/홀수 판별
		// => 짝수 : 2로 나누어 떨어지는 수 (2로 나눈 나머지가 0)
		// => 홀수 : 2로 나누어 떨어지지 않는 수 (2로 나눈 나머지가 1)
		System.out.println("a가 짝수입니까? : " + (a % 2 == 0));
		System.out.println("b가 짝수입니까? : " + (b % 1 == 0));
		
		// 예시3) 어떤 수가 있을 때 n의 배수임을 판별
		// => n의 배수 : 어떤 수를 n으로 나누었을 때 나머지가 0인 경우
		System.out.println("a는 5의 배수입니까? : " + (a % 5 == 0));
		System.out.println("b는 a의 배수입니까? : " + (b % a == 0));
		
	}
	
	// 실습문제
	public void method2() {
		
		/*
		 * 사용자로부터 키보드로 정수값 한 개를 입력받고
		 * 양수인지 짝수인지 판별해보기
		 * 
		 * 실행예시
		 * 정수값 한개 입력 : x
		 * 
		 * 사용자가 입력한 값이 양수입니까? : xxx
		 * 사용자가 입력한 값이 짝수입니까? : xxx
		 */
		
		Scanner sc = new Scanner(System.in);
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println();
		System.out.println("사용자가 입력한 값이 양수입니까? : " + (num > 0));
		System.out.println("사용자가 입력한 값이 짝수입니까? : " + (num % 2 == 0));
		
		// 사용자가 입력한 값이 양수이면서 짝수입니까? 라고 묻고 싶은 경우
		// => 비교연산자 & 논리연산자
	}
	
}
