package com.demott.lambda.calculator;

public class Main {
	public static void main(String[] args) {
		Add addImpl = (p1, p2) -> p1 + p2;
		Subtract subtractImpl = (p1, p2) -> p1 - p2;
		Multiply multiplyImpl = (p1, p2) -> p1 * p2;
		Divide divideImpl = (p1, p2) -> p1 / p2;

		Calculator calc = new Calculator(addImpl, subtractImpl, multiplyImpl, divideImpl);
		System.out.println(calc.add(1, 1));

	}

}
