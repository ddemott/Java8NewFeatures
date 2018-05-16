package com.demott.methodreference;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(12);
		numberList.add(1);
		numberList.add(31);
		numberList.add(4);
		numberList.add(5);
		numberList.add(51);
		numberList.add(55);
		numberList.add(2);

		System.out.println("ListPrintSimple");
		ListPrintSimple listPrintSimple = new ListPrintSimple();
		listPrintSimple.printNumbers(numberList);
		System.out.println("Done");

		System.out.println("ListPrintMethodReference");
		ListPrintMethodReference listPrintMethodReference = new ListPrintMethodReference();
		listPrintMethodReference.printNumbers(numberList);
		System.out.println("Done");

	}

}
