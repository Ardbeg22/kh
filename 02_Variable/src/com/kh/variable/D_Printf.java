package com.kh.variable;

// prㅑntf 구문에 대해 공부
public class D_Printf {
	
	public void printfTest() {
		
		/*
		 * * 출력문의 종류
		 * System.out.println(출력하고자하는값); => 값 출력 후 줄바꿈(개행) 넣어줌
		 * System.out.print(출력하고자하는값); => 값 출력만 해줌
		 * 
		 * System.out.printf("출력하고자하는형식", 출력하고자하는값);
		 * => f는 format(형식)을 의미
		 * => 형식에 맞춰서 값들이 들어가서 출력되는 형식. 줄바꿈은 발생X
		 * => 즉, 문자열 안에 그 값이 들어갈 자리를 다음과 같이 형식으로 잡아줘야 함
		 * 
		 * 형식
		 * %d : 정수가 들어갈 수 있는 형식
		 * %f : 실수가 들어갈 수 있는 형식
		 * %c : 문자가 들어갈 수 있는 형식
		 * %s : 문자열이 들어갈 수 있는 형식
		 */
		
		// 정수테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx 형식으로 출력해보기
		// 1. println 사용
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		// 2. printf 사용 => 정수값이므로 %d형식으로 자리를 잡아주기
		//				      줄바꿈 기능이 없으므로 줄바꿈이 일어날 수 있도록 유도해주기 => \n
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
				// 주의할 점 : 구멍의 종류와 개수를 맞춰서 나열해주기!!
		
		// 10 + 20 = 30 출력해보기
		// 1. println 사용
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		// 2. printf 사용
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1 + iNum2));
		
		// 정수 형식과 같이 쓸 수 있는 옵션
		System.out.printf("%5d\n", iNum1); // 5칸 확보 & 오른쪽정렬
		System.out.printf("%-5d\n", iNum1); // 5칸 확보 & 왼쪽정렬
		
		
		// 실수테스트
		double dNum = 4.27546789;
		
		// dNum : xx.xxx 형식으로 출력
		System.out.println("dNum : " + dNum); // dNum : 4.27546789
		System.out.printf("dNum : %f\n", dNum); // dNum : 4.275468
		// %f : 소수점 아래 7번째 자리에서 반올림되어 6번째 자리까지 출력됨
		
		// 실수 형식과 같이 쓸 수 있는 옵션
		System.out.printf("dNum : %.1f\n", dNum); // dNum : 4.3
		// %.1f : 소수점 아래 2번째 자리에서 반올림되어 1번째 자리까지 출력됨
		
		
		// 문자와 문자열 테스트
		char c = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", c, str); // a Hello
		 
		// 문자 또는 문자열과 같이 쓸 수 있는 옵션
		System.out.printf("%C %S\n", c, str); // A HELLO
		// %C, %S : 영어 알파벳일 경우 대문자로 변경해서 출력
		
	}
	
}
