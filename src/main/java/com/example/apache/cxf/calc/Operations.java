package com.example.apache.cxf.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Operations {
	
	@WebMethod
	public int add (int a, int b);
	
	@WebMethod
	public int sub (int a, int b);
	
	@WebMethod
	public int div (int a, int b);
	
	@WebMethod
	public int multi (int a, int b);
	
	@WebMethod
	public String getOutput();
}
