package com.programmers;

import java.util.ArrayList;
import java.util.Collections;

// 나누어 떨어지는 숫자 배열 - 해결
// https://programmers.co.kr/learn/courses/30/lessons/12910?language=java
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 test = new Test2();
		int [] arr = {2, 36, 1, 3};
		int divisor = 11;
		
		System.out.println(test.solution(arr, divisor));
		
	}

	
	private ArrayList<Integer> solution(int[] arr, int divisor) {
		//int[] answer = {};
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor==0) {
				answer.add(arr[i]);
				//System.out.println(arr[i]);
			}
		}
		
		if(answer.size()==0) {
			answer.add(-1);
			
		}else {
			Collections.sort(answer);
		}
		return answer;
	}
}
