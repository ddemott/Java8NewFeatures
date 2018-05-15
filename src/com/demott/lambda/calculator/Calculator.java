package com.demott.lambda.calculator;

import com.demott.lambda.Add;
import com.demott.lambda.Divide;
import com.demott.lambda.Multiply;
import com.demott.lambda.Subtract;

public class Calculator implements Add, Subtract, Multiply, Divide {

	private Add addImpl;
	private Subtract subtractImpl;
	private Multiply multiplyImpl;
	private Divide divideImpl;

	public Calculator(Add add, Subtract sub, Multiply mult, Divide div) {
		this.addImpl = add;
		this.subtractImpl = sub;
		this.multiplyImpl = mult;
		this.divideImpl = div;
	}

	@Override
	public double add(double param1, double param2) {
		return addImpl.add(param1, param2);
	}

	@Override
	public double subtract(double param1, double param2) {
		return subtractImpl.subtract(param1, param2);
	}

	@Override
	public double multiply(double param1, double param2) {
		return multiplyImpl.multiply(param1, param2);
	}

	@Override
	public double divide(double param1, double param2) {
		return divideImpl.divide(param1, param2);
	}

}
