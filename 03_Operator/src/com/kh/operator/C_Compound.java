package com.kh.operator;

// 복합대입 연산자
public class C_Compound {
	
	/*
	 * * 복합대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * [종류]
	 * 	+=
	 *  -=
	 *  *=
	 *  /=
	 *  %=
	 *  => 해당 산술연산 진행 후 자기 자신에게 대입하겠다는 의미
	 *  
	 *  ex) a = a + 3;
	 *  	a += 3; // 기존의 a값에 3을 더한 후 이를 다시 a에게 대입하겠다는 의미
	 */
	
	
	public void method() {
		
		int num = 12;
		System.out.println("현재 num : " + num); // 12
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num); // 15
		
		num += 3; // num = num + 3
		System.out.println("3 증가시킨 num : " + num); // 18
		
		// num을 5 감소시키기 
		num -= 5; // num = num - 5
		System.out.println("5 감소시킨 num : " + num); // 13
		
		// num을 6배 증가시키기
		num *= 6; // num = num * 6
		System.out.println("6배 증가시킨 num : " + num); // 78
		
		// num을 2배 감소시키기
		num /= 2; // num = num / 2
		System.out.println("2배 감소시킨 num : " + num); // 39
		
		// num을 4로 나눴을때의 나머지를 num에 대입
		num %= 4; //num = num % 4;
		System.out.println("최종 num : " + num); // 3
		
		
		// + : 숫자끼리 연산하면 덧셈. 문자열과 다른타입끼리 연산하면 접합(한 개의 문자열로 연이어짐)
		// += : 문자열에도 적용 가능
		String str = "Hello";
		
		str += "World"; //str = str + "World";
		System.out.println(str);
		
	}
	
}
