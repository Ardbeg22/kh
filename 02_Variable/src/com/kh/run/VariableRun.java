package com.kh.run;

// 2. import문
import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_Printf;

public class VariableRun {
	
	public static void main(String[] args) {
		
		// A_Variable 클래스의 printSalary 메소드를 호출
		// 1. A_Variable 클래스를 대변할이름(=변수) 만들기
		A_Variable a = new A_Variable();
		
		// 3. printSalary 메소드 호출
//		a.printSalary(); 
		
		// declareVariable 메소드 호출
//		a.declareVariable();
		
		// initVariable 메소드 호출
//		a.initVariable();
		
		// constant 메소드 호출
//		a.constant();
		
		// B_KeyboardInput 클래스의 inputTest1 메소드 호출
		B_KeyboardInput b = new B_KeyboardInput();
		
//		b.inputTest1();
		
//		b.inputTest2();
		
//		b.inputTest3();
		
//		b.inputTest4();
		
//		b.inputTest6();
		
		// C_Cast 클래스의 autoCasting 메소드 호출
		C_Cast c = new C_Cast();
		
//		c.autoCasting();
		
//		c.forceCasting();

		// D_Printf 클래스의 메소드 호출
		D_Printf d = new D_Printf();
		
		d.printfTest();
		
		//ctrl + f11 누르면 코드 실행
	}
}
