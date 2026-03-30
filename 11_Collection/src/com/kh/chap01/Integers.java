package com.kh.chap01;

import java.util.Arrays;
import java.util.Iterator;

public class Integers {

	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) {
		if(integers.length == size + 1) {
			integers = Arrays.copyOf(integers, (integers.length * 2));
		}
		integers[size++] = element;
	}
	
	public int get(int index) {
		return integers[index];
	}
	
//	@Override
//	public String toString() {
//		if(integers == null) {
//			return "null";
//		}
//		int max = integers.length - 1;
//		if(max == -1) {
//			return "[]";
//		}
//		
//		StringBuilder b = new StringBuilder();
//		b.append("[");
//		for (int i = 0; i < integers.length; i++) {
//			
//		}
	
	
}
