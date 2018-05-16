package com.demott.methodreference;

import java.util.ArrayList;
import java.util.List;

public class ListPrintMethodReference {
	private List<Integer> list = new ArrayList<>();

	public ListPrintMethodReference() {
		list.add(1);
		list.add(4);
		list.add(15);
		list.add(17);
		list.add(34);
		list.add(97);
	}

	public void printNumbers(List<Integer> numberList) {
		numberList.forEach(System.out::println);
	}
}
