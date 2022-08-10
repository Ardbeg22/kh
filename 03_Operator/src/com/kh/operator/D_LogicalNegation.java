package com.kh.operator;

// 논리부정 연산자
public class D_LogicalNegation {
	
	/*
	 * * 논리부정 연산자 : 단항연산자로써 논리값(true/false)을 반대로 바꿔주는 연산자
	 * 
	 * [표현법]
	 * !논리값
	 */
	
	public void method() {
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b = true;
		boolean b2 = !b; // b2에는 false가 대입
		System.out.println("b : " + b); // b : true => b는 그대로 true 보존
		System.out.println("b2 : " + b2); // b2 : false
		// 논리부정 연산자는 연산결과를 다시 자기자신에게 대입하지 않음!!
		
		System.out.println(3 + 5 < 1); // false
		System.out.println(!(3 + 5 < 1)); // true
		// 논리부정 연산자는 산술연산자, 비교연산자보다 우선순위가 높기때문에 ()로 3+5<1의 우선순위를 높여줘야함
		
	}
	
}
