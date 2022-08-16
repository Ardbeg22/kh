package com.kh.variable;

import java.util.Scanner; // 2단계

// 사용자가 키보드로 입력한 값을 변수에 담는 방법
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * * 자바를 통해서 사용자로부터 어떠한 값을 "입력"받으려면
		 * 	  자바에서 제공하는 java.util.Scanner 클래스를 이용 
		 * 	 => Scanner 클래스에서 제공하는 이미 만들어진 메소드들을 호출
		 * 
		 * - 만약 지금 내가 작성 중인 클래스와 다른 클래스에 있는 메소드를 호출하고 싶다면?
		 * 1. 호출하고자 하는 메소드가 있는 클래스를 대변할이름을 생성 (new)
		 * 2. 만약 그 클래스가 다른 패키지에 있을 경우 import문 추가
		 * 3. 대변할이름 통해서 해당 메소드 호출 
		 */
		
		Scanner sc = new Scanner(System.in); // 1단계
		// System.in : 입력받은 값들을 바이트 단위로 읽어들이겠다는 의미
		
		// 사용자의 인적사항을 입력받는 프로그램 생성 - 이름, 나이, 키
		
		// 입력받고자하는 내용을 먼저 출력해서 입력을 유도
		System.out.print("당신의 이름은 무엇입니까? : "); // 이름 : String(문자열)
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 : next(), nextLine()

//		sc.next(); // 입력만 받고 끝임 변수에 담기지 않음
//		String name = sc.next(); // 변수선언과 동시에 키보드로부터 입력받은값 대입
		// next() : 사용자가 입력한 값 중에서 공백이 있는 경우 공백 이전까지만 입력을 받음 
		//	        ex.홍 길동 -> 홍
		
//		sc.nextLine(); // 입력만 받고 끝
		String name = sc.nextLine(); 
		// nextLine() : 사용자가 입력한 값 중에서 개행이 있을 경우 공백에 무관하게 한 줄 단위로 전부 입력 받음
		// => 특히 사용자가 입력한 값에 공백이 포함될 여지가 있을 경우 nextLine()을 사용하는게 더 좋음 ex) 주소지
//		System.out.println(name); // 입력값 확인용
				
		System.out.print("당신의 나이는 몇 살입니까? : "); // 나이 : int(정수형)
		// 사용자가 입력한 값을 정수로 받아오는 메소드 : nextInt()
		int age = sc.nextInt();
//		System.out.println(age); // 입력값 확인용
		
		System.out.print("당신의 키는 몇 cm입니까? : "); // 키 : double(실수형)
		// 사용자가 입력한 값을 살수로 받아오는 메소드 : nextDouble()
		double height = sc.nextDouble();
//		System.out.println(height); // 입력값 확인용
		System.out.println(name+"님의 나이는 "+age+"살이고, 키는 "+height+"cm입니다.");
		
		// Scanner에서 제공하는 입력 메소드들은 모두 엔터를 치기 전까지 무작정 대기상태임
		
	} // inputTest1 메소드 영역의 끝
	
	
	// 키보드로 값을 입력받을 때 종종 발생되는 문제
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		// stack영역에 name이라는 이름의 빈 string상자 생성 -> 버퍼안에 홍길동이라는 입력값이 담김
		// -> 엔터키가 쳐지는 순간 \n도 버퍼 안으로 들어오고 입력값 홍길동이 heap영역에 담김 
		// -> 홍길동이 담긴 heap영역의 string상자의 주소값이 stack영역의 name에 담김
		// -> nextLine는 입력값을 빼가고 버퍼 안의 개행문자를 없애서 버퍼를 비워줌
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		// stack영역에 age라는 이름의 빈 int상자 생성 -> 버퍼안에 16이라는 입력값이 담김
		// -> 엔터키가 쳐지는 순간 \n도 버퍼 안으로 들어오고 입력값 16이 stack영역의 age에 담김
		// nextInt는 입력값만 빼가고 버퍼 안의 개행문자(\n)를 없애주지 않음
		
		// 버퍼에 개행문자가 남아있는 상태 => 문제 해결을 위해 버퍼를 한번 비워줘야함!!!!!
		sc.nextLine(); // 대입할 용도가 아니므로 입력만 받으면 됨
		// 버퍼가 비워진 상태
		
		// nextLine()메소드는 버퍼에서 "엔터"이전까지의 모든 값을 가져온 후 버퍼를 비워주는 역할
		// nextLine() 이외의 메소드들은 버퍼를 지워주지 않음!!
		// 결론 => nextLine() 이외의 메소드를 호출할 경우 nextLine()을 호출하여 버퍼 비워주기
		
		System.out.print("주소 : "); // 주소 : 키 : 로 출력
		String address = sc.nextLine(); // 이 코드 인식 못 함
		// stack영역 address라는 이름의 빈 string상자 생성 -> 버퍼안에 기존에 남은 개행문자가 존재
		// -> 개행문자 전의 빈문자열("")이 heap영역에 담김
		// -> 빈문자열이 담긴 heap영역의 string상자의 주소값이 stack영역의 address에 담김
		// -> nextLine는 입력값을 빼가고 버퍼 안의 개행문자(\n)를 없애서 버퍼를 비워줌
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		// stack영역에 height라는 이름의 빈 double상자 생성 -> 버퍼안에 170.2이라는 입력값이 담김
		// -> 엔터키가 쳐지는 순간 \n도 버퍼 안으로 들어오고 입력값 170.2이 stack영역의 height에 담김
		// -> nextDouble는 입력값을 빼가고 버퍼 안의 개행문자(\n)를 없애주지 않음
		
		sc.nextLine(); // 버퍼 비워주기

		
		// xxx님은 xx살이며, 사는 곳은 xxxx이고, 키는 xxxcm입니다.
		System.out.println(name+"님은 "+age+"살이며, 사는 곳은 "+address+"이고, 키는 "+height+"cm입니다.");
		
	} // inputTest2 메소드 영역의 끝
	
	
	// 그 이외의 입력 메소드들 
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * * Scanner의 입력용 메소드들
		 * 문자열을 입력받고자 할 때 : next(), nextLine()
		 * 정수값을 입력받고자 할 때 : nextInt(), nextByte(), nextShort(), nextLong()
		 * 실수값을 입력받고자 할 때 : nextDouble(), nextFloat()
		 * 논리값을 입력받고자 할 때 : nextBoolean()
		 * 문자값을 입력받고자 할 때 : 해당 메소드가 없음
		 */
		
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// gender를 문자(char)타입으로 입력받고자 함
		
		// index : 색인, 순번 
		// "apple" 문자열에서 a의 위치를 찾으려면?
		//  01234
		// => a의 위치값(index)은 0 
		// => e의 위치값(index)은 4
		
		// 우선적으로 nextLine() 메소드를 이용하여 문자열 형태로 입력받고 
		// 그 입력받은 문자열로부터 0번째 인덱스의 문자값 하나만 추출
		// => charAt(위치값) : 문자열로부터 해당 위치값에 해당되는 문자 하나만 돌려주는 메소드
		//                   위치값은 0부터 시작 
		//    [표현법] 문자열.charAt(위치값);
		char gender = sc.nextLine().charAt(0); // 먼저 문자열을 입력받은 후 0번째 글자를 추출하여 gender에 대입
		
//		char err = sc.nextLine().charAt(100); // 오류발생 - StringIndexOutOfBoundsException
		// StringIndexOutOfBoundsException : 추출하고자 하는 인덱스값이 문자열의 길이를 넘어섰을 때 발생
		// => 배열에서도 비슷한 오류 발생 예정 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 버퍼 비우기
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		sc.nextLine(); // 버퍼 비우기 (마지막이라 안해줘도 되긴 함)
		
		System.out.println(name + " 님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
	} // inputTest3 메소드 영역의 끝
	
	
	// 실습 - 응용문제1
	public void inputTest4() {
		
		/*
		 * 영어 문자열 값을 키보드로 입력받은 후
		 * 그 문자열로부터 앞에서 세개를 출력해보기
		 * 
		 * 출력예시
		 * 첫번째 문자 : x
		 * 두번째 문자 : x
		 * 세번째 문자 : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3글자 이상의 문자열을 입력하세요 : ");
		
		// 흔히 하는 실수 
		//char ch1 = sc.nextLine().charAt(0);
		//char ch2 = sc.nextLine().charAt(1);
		//char ch3 = sc.nextLine().charAt(2);
		
		// 첫번째 풀이 - 변수사용O
//		String str = sc.nextLine(); // 우선적으로 문자열을 한번 입력받아서 변수에 보관해두기
//		char ch1 = str.charAt(0);
//		char ch2 = str.charAt(1);
//		char ch3 = str.charAt(2);
//		
//		System.out.println("첫번째 문자 : " + ch1);
//		System.out.println("두번째 문자 : " + ch2);
//		System.out.println("세번째 문자 : " + ch3);
		
		// 두번째 풀이 - 변수사용X
//		String str = sc.nextLine();
//		System.out.println("첫번째 문자 : " + str.charAt(0));
//		System.out.println("두번째 문자 : " + str.charAt(1));
//		System.out.println("세번째 문자 : " + str.charAt(2));
		
		
		// Apple 입력시 App의 형태로 출력하고 싶다면?
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
//		System.out.println(ch1 + ch2 + ch3); // 결과 : 289
		// char는 int형이랑 서로 형변환이 가능한 관계 => int형으로 형변환하여 값이 출력됨
		
		// 우리가 배운 선에서 해결할 수 있는 방법
		// 해결방법1
//		System.out.print(ch1);
//		System.out.print(ch2);
//		System.out.print(ch3);
		
		// 해결방법2
		System.out.println(""+ ch1 + ch2 + ch3); // 문자열("")과 더하면 문자열로 인식
		
		
	} // inputTest4 메소드 영역의 끝
	
	
	// 응용문제2
	public void inputTest5() {
		
		/*
		 * 키보드로 정수 2개를 입력받아 
		 * 두수의 합, 차, 곱, 나누기한 결과를 각각 출력
		 * 
		 * 출력예시
		 * 더하기 결과 : x
		 * 빼기 결과 : x
		 * 곱하기 결과 : x
		 * 나누기 결과 : x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 연산자 우선순위 : 곱셈,나눗셈 -> 덧셈,뺄셈 & 같은 순위에선 순서대로 연산
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : " + (num1-num2));
		System.out.println("곱하기 결과 : " + num1*num2);
		System.out.println("나누기 결과 : " + num1/num2);
	}
	
	// 숙제 
	public void inputTest6() {
		
		/*
		 * 키보드로 가로, 세로값을 실수형으로 입력받아서
		 * 사각형의 면적과 둘레를 출력
		 * 
		 * 힌트
		 * 사각형 면적 : 가로*세로
		 * 사각형 둘레 : (가로+세로)*2
		 * 
		 * 실행예시
		 * 가로길이를 입력하세요 : 
		 * 세로길이를 입력하세요 :
		 * 
		 * 면적 : xx
		 * 둘레 : xx
		 */
		
	}
	
	
}
