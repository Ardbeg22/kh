package com.kh.first; // 패키지 선언부 : 클래스 생성 시 선택한 패키지의 위치를 알려주는 구문. 삭제하면 안됨 

// 클래스 선언부 
// 이 클래스의 full-name : com.kh.first.HelloEveryone 
// => 패키지명은 항상 소문자, 클래스명의 첫글자는 항상 대문자  => 패키지와 클래스 구분 가능
public class HelloEveryone { // HelloEveryone 클래스 영역의 시작

	// 작성하고 싶은 코드 
	// 단, 소스코드는 클래스 안에 바로 작성이 불가능하고 메소드 안에 작성해야 함
	
	// 메소드 만들기
	// 1. 일반 메소드의 기본 표현법
	/*
	public void 메소드명() {
		
	}
	*/
	// 2. main 메소드의 기본 표현법 (고유명사)
	public static void main(String[] args) {// main 메소드 영역의 시작
	
		/*
		 * * Method : 사전적인 정의로 "기능"을 의미함
		 * 			    하나의 기능 단위 
		 * 
		 * * Method의 특징
		 * 1. 메소드는 일반 메소드와 main 메소드로 나뉨
		 * => main 메소드 : 내가 만든 프로그램의 시작점을 나타내는 메소드
		 * 				  JVM에 의해 실행(호출)됨
		 * => 일반 메소드 : 내가 만들고 싶은 기능 단위별로 만들면 됨
		 * 			    main 메소드이든 일반 메소드이든 간에 다른 메소드에서 실행(호출)시켜줘야 함
		 * - 메소드가 실행시키는 것을 "호출(call)"이라고 한다!!
		 * 2. 한 개의 클래스 안에 여러 메소드들이 존재 가능
		 * 	    단, 표면적으로는 메소드명이 중복될 수는 없음 
		 * 	  => but 특별한 규칙(오버로딩)에 의해서 메소드명이 중복될 수 있음!!
		 */
		
		// 코드 작성 부분
		// 코드 작성 시 주의사항 : 항상 코드 한 줄씩 세미콜론(;)을 붙여줘야 함! 마침표의 역할
		
		// 출력문
		// System.out.println(내용물); : 내용물 출력 후 줄바꿈이 일어남(개행)  
		System.out.println("Hi everyone!"); // ""안의  값을 출력해주는 구문
		System.out.println("안녕하세요");
		
		// System.out.print(내용물); : 내용물 그냥 출력만 하는 역할 
		System.out.print("여러분~!");
		System.out.println("반갑습니다^^");
		System.out.print("여\n러\n분\n~!\n"); // \n : 개행문자(줄바꿈을 해주는 특수한 역할의 문자)
		System.out.print("반갑습니다^^");
		
		//내용물 출력 없이 줄바꿈만 한번 하고 싶다?
				System.out.println();
				System.out.println("");
				System.out.print("\n");
		
		// System.out.printf(내용물); : 내용물을 지정된 형식에 맞게 출력해주는 역할
		
		/*
		 * 프로그램의 기본 흐름은 무조건 위에서 아래 순으로 실행된다!!
		 * main 메소드 기준으로 위에서 아래 순서대로 순차적을로 출력문이 console에 찍힘
		 * 
		 * main 메소드는 프로그램의 시작점
		 * => 프로그램 당 main 메소드는 적어도 1개씩 가지고 있어야 한다
		 * => 프로그램 당 main 메소드는 여러개 존재 가능
		 * => main 메소드는 일반 메소드와 동일하게 다른 메소드에서도 호출 가능
		 */
		
	}// main 메소드 영역의 끝

} // HelloEveryone 클래스 영역의 끝

/*
 * * 자바의 명명 규칙(이름 붙이는 규칙)
 * => 웬만해서는 지키자 (개발자들 간의 코딩 규칙 = 코딩컨벤션)
 * 1. 영어 사용
 * 2. 띄어쓰기 불가
 * 3. 의미를 부여해서 여러 단어를 조합하여 짓기
 * 	  ex) HelloEveryone
 * 4. Package명은 소문자로 짓기 <= Package와 Class 구분 위해(Class의 풀네임은 패키지명부터 시작)
 * 5. Class명의 첫글자는 대문자로 시작
 * 6. Method명의 첫글자는 소문자로 시작
 * 7. 변수명의 첫글자는 소문자로 시작
 * 8. 공통 원칙 : 여러개의 단어를 조합해서 이름을 지을 때에는 
 * 			   띄어쓰기 대신 각 단어별로 첫글자를 대문자로 표현 => "낙타표기법(Camel case)"
 *  		 ex) 클래스명 : Helloeveryone(X) -> HelloEveryone(O)
 *  			  메소드명 : sayhello(X) -> sayHello(O)
 */