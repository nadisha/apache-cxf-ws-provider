package com.example.apache.cxf.calc;

import javax.jws.WebService;

@WebService
public class OperationImpl implements Operations {
	
	private static int result;
	
	private static String op;

	public int add(int a, int b) {
		System.out.println(String.format("Add operation a=%d and b= %d", a, b));
		result = (a + b); 
		op = "ADD";
		return result;
	}
	
	public int sub(int a, int b) {
		System.out.println(String.format("Sub operation a=%d and b= %d", a, b));
		result = (a - b);
		op = "SUB";
		return result;
	}
	
	public int div(int a, int b) {
		System.out.println(String.format("Div operation a=%d and b= %d", a, b));
		if (b == 0) {
			b = 1;
		}		
		result = (a / b);
		op = "DIV";
		return result;
	}
	
	public int multi(int a, int b) {
		System.out.println(String.format("Multi operation a=%d and b= %d", a, b));
		result = (a * b);
		op = "MULTI";
		return result;
	}
	
	public String getOutput() {
		return String.format("The operation %s result is %d", op, result);
	}
}
