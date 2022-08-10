package com.kh.operator;

import java.util.Scanner;

// 논리 연산자
public class F_Logical {
	
	/*
	 * * 논리 연산자 : 이항연산자로써 두 개의 논리값을 연산하는 연산자
	 * 			     즉, 논리값끼리 연산이 이루어지고 그 연산결과도 논리값
	 * [종류]
	 * AND 연산자 : 논리값 && 논리값
	 * 			   두 논리값 모두 true여야지만 최종 결과가 true
	 * 			  ~이고, 그리고, ~이면서, .. => 둘 다의 느낌
	 * 
	 * OR 연산자 : 논리값 || 논리값
	 * 			  두 논리값 중 하나라도 true라면 최종 결과가 true
	 * 			 또는, 혹은, ~이거나, .. => 둘 중 하나의 느낌
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수이면서 짝수인지 판별하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		boolean result = (num > 0) && (num % 2 == 0); // && : ~이면서, ~이고, 그리고, ..
		// 연산자 우선순위는 ok이지만 가독성을 위해 소괄호로 묶어줌 
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? : " + result);
		
		boolean result2 = (num > 0) || (num % 2 == 0); // || : 이거나, 또는, 혹은..
		System.out.println("사용자가 입력한 값이 양수이거나 짝수입니까? : " + result2);
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 이상, 이하 : <= , >= 
		// 초과, 미만 : < , >
		// 수학처럼 1 <= num <= 100으로 묶어서 표현 불가 
		// 1 <= num, num <= 100으로 쪼개서 표현 -> 쪼갠 것을 논리연산자로 묶어서 표현
		
		boolean result = (num >= 1) && (num <= 100);
		System.out.println("사용자가 입력한 값이 1 이상 100 이하입니까? : " + result);
		
		
	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 y이거나 Y인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속하시려면 y 또는 Y 를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? : " + result);
		
	}
	
	public void method4() {
		
		/*
		 * * 논리 연산자의 경우의 수
		 *  && : 두 개의 조건이 모두 true여야 결과값이 true (AND의 의미)
		 *  	 true && true == true
		 *  	 true && false == false
		 *   	 false && true == false
		 *       false && false == false
		 *  || : 두 개의 조건 중 하나라도 true일 경우 결과값이 true (OR의 의미)
		 * 		 true || true == true
		 * 		 true || false == true
		 * 		 false || true == true
		 * 		 false || false == false
		 */
		
		int num1 = 10;
		
		boolean result1 = false && (num1 > 0); // false
		// 뒤의 비교연산 구문이 Dead code라는 경고 발생 => Dead code는 실행 안됨
		// 경고 : 실행시 오류는 나지 않지만 추후에 오류가 생길 여지가 있는 상태
		// => false && 까지만 연산을 해도 어차피 결과는 false이기 때문에
		// 	   뒤의 코드를 굳이 왜 작성했는지 알려주는 경고 (Dead code)
		
		System.out.println("result1 : " + result1);
		
		boolean result2 = true || (num1 > 0); // true
		// 뒤의 비교연산 구문이 Dead code라는 경고 발생 => Dead code는 실행 안됨
		// => true || 까지만 연산을 해도 어차피 결과는 true이기 때문에
		// 	   뒤의 코드를 굳이 왜 작성했는지 알려주는 경고 (Dead code)
		
		System.out.println("result2 : " + result2);
	}
	
}
