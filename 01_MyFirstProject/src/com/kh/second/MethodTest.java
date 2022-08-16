package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest {

	/*
	 * 한 클래스 내에 여러개의 메소드를 정의해 둘 수 있음
	 * 무조건 메인 메소드를 포함할 필요도 없음
	 */
	
	// 일반 메소드들 작성
	public void testPrintA() {
		
		// 이 메소드가 호출되는 순간 실행할 내용 작성
		System.out.println("testPrintA 메소드 실행");
		
		// testPrintA와 같은 클래스 내에 위치하므로 메소드명만 호출
		testPrintB(); // testPrintB 메소드 호출 
					  // testPrintB()실행이 끝나면 다시 호출한 곳으로 돌아옴

//		testPrintC(); // testPrintC 메소드 호출하는 방법 1
	}
	
	public void testPrintB() {
		
		System.out.println("testPrintB 메소드 실행");
		
		testPrintC(); // testPrintC 메소드 호출하는 방법 2
	}
	
	public void testPrintC(){
		
		System.out.println("testPrintC 메소드 실행");
		
//		testPrintA(); 
		// 만약 이 시점에서 testPrintA 메소드를 호출할 경우? 
		// => Run파일에서 A, B, C,가 무한반복적 호출 
		// => 이 경우 무한반복으로 결과가 실행되다가 StackOverflowError가 발생
		// StackOverflowError : 메모리가 더이상 견디지 못하고 프로그램을 종료시킴
		
		/*
		 * 배경지식
		 * 1. 코드 작성 => 하드디스크(HDD)에 저장 (정적인 형태 == "프로그램")
		 * 2. 컴파일러에 의해 기계어로 번역
		 * 3. JVM에 의해서 실행 => 메모리영역(RAM)으로 로딩됨과 동시에 실행 (동적인 형태 == "프로세스")
		 * 
		 * Stack : 메모리 공간의 유형 중 하나. Stack의 크기를 벗어난 경우 StackOverflowError 발생
		 */
	}
	
}
