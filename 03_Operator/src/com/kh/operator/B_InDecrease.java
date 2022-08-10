package com.kh.operator;

// 증감 연산자
public class B_InDecrease {
	
	/* 
	 * * 증감 연산자 : 단항연산자로써 값을 1씩만 증가시키거나 혹은 감소시키는 연산자
	 * 
	 * [종류]
	 * ++ : 값을 1씩 증가시키는 연산자
	 * 	    ++값 (전위연산자)
	 * 		값++ (후위연산자)
	 * -- : 값을 1씩 감소시키는 연산자
	 * 		--값 (전위연산자)
	 * 		값-- (후위연산자)
	 * 
	 * (증감연산자)값 : 전위연산 => 선증감 후처리
	 * 값(증감연산자) : 후위연산 => 선처리 후증감
	 * 
	 */
	
	public void method1() {
		
		int num = 10;
		
		System.out.println("num : " + num);
		
		num++; // num의 값을 1 증가시키겠다는 의미
			   // num = num + 1;와 같은 의미
		System.out.println("변경된 num : " + num);
		
		int num2 = 10;
		
		System.out.println("num2 : " + num2);
		
		num2--; // num2의 값을 1 감소시키겠다는 의미
				// num2 = num2 - 1;와 같은 의미
		System.out.println("변경된 num2 : " + num2);
		
	}
	
	public void method2() {
		
		// ++ 기준으로 
		// 전위연산 : 선증감 후처리
		int a = 10; // 1) a의 값은 10
		int b = ++a; // 2) a의 값이 우선적으로 1 증가 후 b에 대입
					 //    => 즉, a와 b 모두 11
		System.out.println("a : " + a + " b : " + b); // a : 11 b : 11
		// 후위연산 : 선처리 후증감
		int c = 10; // 1) c의 값은 10
		int d = c++; // 2) 우선적으로 d에 c의 값 대입. 이후에 c의 값이 1 증가
					 //    => 즉, d는 10 c는 11
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
		
		// 요령 : 후위연산자의 경우, 일단 없다고 생각하고 처리를 다 한 뒤 마지막으로 연산자를 처리
	}
	
	// 퀴즈
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
