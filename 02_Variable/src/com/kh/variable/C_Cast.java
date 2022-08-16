package com.kh.variable;

// 형변환(casting)과 관련된 개념
public class C_Cast {
	
	/*
	 * * 형변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * * 컴퓨터 상에서 값 처리 규칙
	 * 1. 대입연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 함
	 * 	  => 즉, 같은 자료형에 해당되는 값만 대입 가능 
	 * 	  => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 먼저 필수적으로 이루어져야함
	 * [표현법] 자료형 변수명 = (바꿀자료형)값;
	 * 2. 같은 자료형끼리만 연산이 가능함
	 * 	  => 즉, 다른 자료형끼리 연산을 수행하고 싶다면 적어도 하나는"형변환"을 먼저 필수적으로 해서 자료형을 맞춰줘야함 
	 * [표현법] 값 + (바꿀자료형)값;
	 * 3. 1,2번 규칙을 합쳐서
	 * 	   같은 자료형끼리 연산이 이루어진 경우 그 연산결과는 동일한 자료형으로 나옴
	 * 	  => 즉, 같은 자료형끼리 연산이 이루어진 결과는 동일한 자료형의 변수에만 대입이 가능함
	 * 	  ex) int result = int형 숫자 + int형 숫자;
	 * 
	 * 
	 * * 형변환의 종류
	 * 1. 자동형변환 : 자동으로 형변환이 진행되기 때문에 직접 형변환을 할 필요가 없음
	 *    ㄴ 자동형변환의 case : 작은 byte의 자료형 -> 큰 byte의 자료형
	 * 2. 강제형변환(=명시적형변환) : 자동형변환이 되지 않아 직접 강제로 형변환 해야 하는 경우
	 * 	    ㄴ 강제형변환의 case : 큰 byte의 자료형 -> 작은 byte의 자료형
	 * 	  [표현법] (바꿀자료형)값;
	 * 
	 * * (바꿀자료형) : 형변환 연산자 == Cast 연산자
	 */
	
	// 자동형변환 : 작은 byte -> 큰 byte로 자동으로 형변환 되는 경우
	public void autoCasting() {
		
		// 1. int(4byte) -> double(8byte) 
		int i1 = 10;
		double d1 = i1; // 오류발생X (자동형변환 발생했기 때문) 
						// 10 -> 10,0
						// double d1 = (double)i1;와 같음
		System.out.println("d1 : " + d1); // d1 : 10.0 (자동형변환 발생)
		
		int i2 = 12;
		double d2 = 3.3;
		double result2 = i2 + d2; // 12.0 + 3.3 = 15.3
								  // double result2 = (double)i2 + d2;와 같음
		System.out.println("result2 : " + result2); // result2 : 15.3
		
		
		// 2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = i3; // 오류발생X (자동형변환 발생했기 때문) 
					  // long l3 = (long)i3;와 같음
		System.out.println("l3 : " + l3); // l3 : 1000
		
		long l4 = 2000; // L을 붙이지 않아도 문제없는 이유 : 자동형변환이 되기 때문
					    // int타입 2000 -> long타입 2000L
						// long l4 = (long)2000;와 같음
		
		
		// 특이케이스 3. long(8byte) -> float(4byte)
		// 정수가 실수로 담길 때에는 큰 사이즈의 정수가 작은 사이즈의 실수에 대입 가능
		// 4byte float은 사실 long형보다 담을 수 있는 값의 범위가 더 크기 때문
		long l5 = 1000;
		float f5 = l5; // 오류발생X (자동형변환 발생했기 때문) 
					   // float f5 = (float)l5;와 같음
		System.out.println("f5 : " + f5); // f5 : 1000.0
		
		
		// 특이케이스 4. char(2byte) <-> int(4byte) 양방향 형변환 가능 
		// char의 범위 : 0 ~ 65535
		// 			  각 문자마다 고유의 정수값이 정해져 있음
		// => 해당 정수값들을 각 문자로 매칭시켜주는 아스키코드표 (0 ~ 127, 즉 128가지의 문자 나타낼 수 있음. 영문자 대소문자, 알파벳, 숫자, 특수문자)
		// => 아스키코드표의 확장된 개념 : 유니코드표 (0 ~ 65535, 즉 65536가지의 문자를 나타낼 수 있음. 영어, 숫자, 특수문자, 한글, 그 이외의 언어)
		char ch = 65; // 오류발생X (자동형변환 발생했기 때문) 
					  // char ch = (char)65;
		System.out.println("ch : " + ch); // ch : A <- 아스키코드표 : 65 = A
		
		int num = 'A'; // 오류발생X (자동형변환 발생했기 때문) 
					   // int num = (int)'A';
		System.out.println("num : " + num); // num : 65

		System.out.println('김'); // 김
		System.out.println((int)'김'); // 44608 <- 유니코드표 '김' = 44608
		
		int sum = 'A' + 10; // 오류발생X (자동형변환 발생했기 때문)
							// 유추 : 산술적 연산결과 75, 문자적 연산결과 'K'
							// int sum = (int)'A' + 10 ; 
							// sum의 형이 int이므로 'A'가 int형으로 형변환
		System.out.println("sum : " + sum); // sum : 75
		System.out.println("sum : " + (char)sum); // sum : K
		
		System.out.println("A가 a보다 큽니까? : " + ('A' > 'a')); // A가 a보다 큽니까? : false
		 													 // A:65, a:97
		// 문자끼리 숫자만 가능한 연산도 가능함!!
		
		
		// 특이케이스5. byte끼리의 연산, short끼리의 연산
		byte b1 = 1;
		byte b2 = 10;
//		byte result = b1 + b2; // 오류발생 (b1+b2를 int형으로 간주하기 때문)
		byte result = (byte)(b1 + b2); // 1.계산 -> 2.형변환 순서이므로 괄호로 묶어줌
		// byte나 short로 연산시 무조건 결과는 int로 취급됨
		// => 강제로 형변환을 하면 저장 가능
		
	} 
	
	
	// 강제형변환 (명시적형변환) : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환할 경우
	public void forceCasting() {
		
		// 1. double(8byte) -> float(4byte)
//		float f1 = 4.0; // 오류발생 (double형 4.0에서 float형 4.0f으로 자동형변환 불가)
		float f1 = (float)4.0; // doubel형 4.0을 float형 4.0f로 강제형변환
		
		double d2 = 8.0;
//		float f2 = d2; // 오류발생 (double형에서 float형으로 자동형변환 불가)
		float f2 = (float)d2; // double형에서 float형으로 강제형변환
		
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
//		int i3 = d3; // 오류발생
		int i3 = (int)d3; // double형에서 int형으로 강제형변환 10.89 -> 10
						  
		System.out.println("i3 = " + i3); // i3 = 10
		// 10 소수점 아래 내용이 절삭됨(즉, 데이터가 손실됨) => 신중히 형변환해야함
		
		int iNum = 10;
		double dNum = 5.89;
//		int iSum = iNum + dNum; // 오류발생 double형이 int형으로 자동형변환 불가능
								// iNum이 double형으로 자동형변환(10->10,0)되고 둘이 더해지면서 15.89가 됨
								//  => double형태의 결과인 15.89를 int형 상자인 iSum에 담으려해서 오류
		
		// 해결방법 1. 연산결과를 int형에 맞춰서 강제형변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1); // iSum1 : 15
		// 해결방법 2. 연산 전에 dNum을 int형으로 강제형변환한 후에 연산 진행
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2); // iSum2 : 15
		// 해결방법 1과 2의 순서차이
		// 해결방법 1 : 1단계 iNum이 double로 자동형변환
		//			2단계 iNum과 dNum이 더해지고
		//			3단계 더해진 결과가 int형으로 강제형변환
		// 해결방법 2 : 1단계 dNum이 int로 강제형변환
		//			2단계 iNum과 dNum이 더해짐
		
		// 해결방법 3. 애초에 결과값을 담을 변수를 double형으로 저장
		double dSum = iNum + dNum; // 이 경우, 데이터 손실이 없어 정확한 값이 담길 것 
		System.out.println("dSum : " + dSum); // dSum : 15.89
	}
	
	/*
	 * (바꾸고자하는자료형)값;
	 * 
	 * 작은사이즈 -> 큰사이즈
	 * 큰사이즈 -> 작은사이즈
	 */
	
	
}




