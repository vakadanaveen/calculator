package com.calculator;

public class Calculator{
	
	static int add(int operand1,int operand2){
		return operand1+operand2;
	}
	static int multiply(int operand1,int operand2){
		return operand1*operand2;
	}
	static int divide(int operand1,int operand2){
		if(operand2!=0){
			return operand1/operand2;
		}
		else{
			return 0;
		}
	}
	

}