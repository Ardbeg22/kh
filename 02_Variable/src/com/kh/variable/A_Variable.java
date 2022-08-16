package com.kh.variable;

public class A_Variable { // A_Variable == com.kh.variable.A_Variable

	// * 변수의 필요성
	// 시급과 근무시간과 근무일수를 곱해서 월급을 계산하는 프로그램
	public void printSalary() {
		
		System.out.println("===== 변수 사용 전 ====="); // 구분자 출력
		
		System.out.println("시급 : 10000 원");
		System.out.println("근무시간 : 6 시간");
		System.out.println("근무일수 : 5 일");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 홍길동 : 00000 원 형식으로 출력
		
//		System.out.println("강성훈 : 9160 x 6 x 5 원");
//		System.out.println("구샛별 : 9160 x 6 x 5 원");
//		System.out.println("김도현 : 9160 x 6 x 5 원");
//		System.out.println("김수빈 : 9160 x 6 x 5 원");
		// 위의 형식으로는 원하는 결과가 나오지 않음
		
		// 규칙 1. 자바에서 문자열은 ""(쌍따옴표) 안에 표기
		// 규칙 2. 자바에서 곱셈연산은 x표시가 아닌 *표시로 표현
		// 규칙 3. 자바에서 서로 다른 종류의 값들을 연이어 붙이고 싶을 때에는 +표시를 사용
		
		System.out.println("강성훈 : " + 10000*6*5 + " 원");
		System.out.println("구샛별 : " + 10000*6*5 + " 원");
		System.out.println("김도현 : " + 10000*6*5 + " 원");
		System.out.println("김수빈 : " + 10000*6*5 + " 원");
		
		// 변수를 사용하지 않을 경우
		// => 값이 변동될 경우 일일이 값을 찾아다니면서 수정하기 매우 귀찮음
		// => 실수로 잘못된 값을 입력할 수도 있음
		
		System.out.println(); // Enter키를 친 효과
		System.out.println("===== 변수 사용 후 =====");
		
		// 내가 쓰고자 하는 값들을 "변수"에 담아두기
		// 규칙 4. 자바에서의 = 표시는 "대입하겠다"라는 의미
		// 		  추가적으로 자바에서의 "같다"라는 의미는 == 기호가 담당
//		int pay = 10000; // pay라는 이름을 가진 상자에 10000이라는 숫자 보관하겠다는 의미
		int pay = 11000; // pay를 10000에서 11000으로 변경
		int time = 6; // time이라는 이름을 가진 상자에 6이라는 숫자를 보관하겠다는 의미
		int day = 5; // day라는 이름을 가진 상자에 5라는 숫자를 보관하겠다는 의미
		
		System.out.println("시급 : " + pay + " 원");
		System.out.println("근무시간 : " + time + " 시간");
		System.out.println("근무일수 : " + day + " 일");
		
		System.out.println("김정현 : " + pay*time*day + " 원");
		System.out.println("나성진 : " + pay*time*day + " 원");
		System.out.println("박성현 : " + pay*time*day + " 원");
		
		
		/*
		 * * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용됨 => 가독성이 좋아짐
		 * 2. 단 한번 값을 기록해두고 필요할 때마다 계속 사용할 목적으로 사용됨 => 재사용성이 좋아짐 (코드량 감소)
		 * 3. 유지보수를 보다 편하게 할 수 있음
		 */
	} // printSalary 메소드 영역의 끝
	
	// 변수의 선언
	public void declareVariable() {
		
		/*
		 * * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 할당하겠다
		 * == 값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다 (땅따먹기)
		 * == 값을 담아둘 수 있는 상자를 만들겠다
		 * 
		 * [표현법] 자료형 변수명;
		 * - 자료형 : 변수의 크기 및 모양 지정(종류를 지정)
		 * - 변수명 : 변수의 이름 지정
		 * 
		 * * 변수 선언시 주의할 점
		 * 1. 변수명의 소문자로 시작하게끔 이름 지어줄 것 (단,낙타표기법 지키기 )
		 * 2. 같은 영역({}) 안에서는 동일한 변수명 선언 불가 (변수명 중복 불가)
		 * 3. 해당 영역({})에 선언된 변수는 해당 영역 안에서만 사용 가능
		 * 	  => 다른 메소드에서는 사용 불가 (지역변수의 개념)
		 */
		
		// ----- 자료형에 대한 개념 -----
		// 기본자료형 / 참조자료형
		// 1. 논리형(논리값 - true/false)
		boolean isTrue; // 1byte짜리 빈 상자 생성됨
		
		// 2. 숫자형 
		// 2_1. 정수형(소수점 x)
		byte bNum; // 1byte (-128 ~ 127)
		short sNum; // 2byte (-32768 ~ 32767)
		int iNum; // 4byte (-21억XX ~ 21억XX) => 정수형 자료형의 기본 (CPU는 연산자 4byte 단위로 처리하기 때문)
		long lNum; // 8byte (제일 많은 범위의 수를 표현 가능)
		// 2_2. 실수형
		float fNum; // 4byte (소수점 아래 7자리까지 표현 가능)
		double dNum; // 8byte (소수점 아래 15자리까지 표현 가능) => 실수형 자료형의 기본 (더 정밀한 표현이 가능하기 때문)
		
		// 3. 문자형
		char ch; // 2byte
		
		// ----- 여기까지 총 8개의 기본 자료형 -----
		
		// 참조자료형 1가지
		// 4. 문자열형
		String str; // 표면상으로는 4byte => 문자열의 길이는 가늠할 수 없기 때문에 4byte짜리 상자에 실제 값이 담기지는 않음!!
		
		// ----- 여기까지 총 9개의 빈 상자가 생성됨 -----
		
		/*
		 * * 변수에 값을 대입
		 * 변수에 값을 담기 == 빈 상자에 값 담기
		 * 
		 * [표현법] 변수명 = 값;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long 타입의 경우 long 타입임을 알려주기 위해 L을 사용 (l, L 둘 다 가능하지만 L을 더 권장)
		fNum = 4.0f; // float 타입의 경우 float 타입임을 알려주기 위해 "반드시" f사용 
		dNum = 8.0;
		ch = 'A'; // 문자는 반드시 ''(홑따옴표) 안에 작성해야함
		str = "ABC"; // 문자열은 반드시 ""(쌍따옴표) 안에 작성해야함
		
		// 각 변수에 담긴 값들을 출력
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
	} // declareVariable 메소드 영역의 끝
	
	// 변수 선언과 동시에 초기화 (대입인데 제일 먼저 이루어지는 대입을 초기화라 함)
	public void initVariable() {
		
		/*
		 * * 변수 선언과 동시에 초기화
		 * 상자를 만듬과 동시에 값을 채워넣는다는 의미
		 * 
		 * [표현법] 자료형 변수명 = 값; 
		 *    실행순서   1     3 2  
		 */
		
		// 기본자료형 8가지
		// 1. 논리형
		boolean isTrue = 3 + 5 < 1; // 1byte 
		//boolean isTrue = false; 와 같음
		// 3 + 5 < 1 : "8 < 1 ?"의 의미 => false
		// 논리형 변수에는 물론 true / false가 들어갈 수 있지만 연산결과가 논리값인 수식도 들어갈 수 있다
		
		// 2_1. 정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte
		long lNum = 8L; // 8byte
		
		// 2_2. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte
		
		// 3. 문자형
		char ch = '김'; // 2byte
		
		// 참조자료형 1가지
		// 4. 문자열형
		String str = "자바 공부중"; 
		
		// 각 변수에 담긴 값 출력
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
	} // initVariable 메소드 영역 끝
	
	// 상수 
	public void constant() {
		
		// 변수일 경우 
		int age = 20;
		System.out.println("age : " + age); // 20
		
		age = 25;
		System.out.println("변경된 age : " + age); // 25
		
		
		// 상수 : 한번 기록된 값은 변경 불가(항상 고정적인 값을 기록할 때 사용)
		// [표현법] final 자료형 상수명; 
		//        final 자료현 상수명 = 값;
		// => 상수명은 대문자로 짓는다
		
		// 상수일 경우
		final int AGE = 20;
		System.out.println("상수 age : " + AGE); // 20
		
		// 만약 AGE라는 상자의 값을 또 대입하는 구문이 나온다면?
//		AGE = 21; // 오류 발생
		
		
	}
		
	
}
