package com.programmers.고득점kit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import static java.util.stream.Collectors.*;

/* 1. hashmap사용한 풀이*/
/* 2. java 1.8 stream 사용한 풀이*/

public class 해시_위장 {

	public static void main(String[] args) {
		
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	
	/* 1. hashmap사용한 풀이*/
	/*
	private static int solution(String[][] clothes) {
		int answer = 0;
				
		HashMap<String, Integer> wear = new HashMap<>();
		//System.out.println("wear : " + wear);
		
		//옷 종류 별 갯수 파악
		for(String[] str : clothes) {
			//System.out.println(Arrays.toString(str));
			String kind =  str[1];
			if(wear.containsKey(kind)) {
				int count = (int)wear.get(kind);
				wear.put(kind, ++count);
			}else {
				wear.put(kind, 1);
			}
		}
		
		ArrayList<Integer> kindValues = new ArrayList<Integer>();
		
		for(int i=0; i<wear.size(); i++) {
			// 해시맵의 "i번째" 키의 값 가져오기
			int kindValue = wear.get(wear.keySet().toArray()[i]);
			
			// 해시맵의 "i"번째 값 
			//System.out.println(wear.values().toArray()[i]);

			kindValues.add(kindValue);
		}
		
		int count = 1;
		for (int k : kindValues) {
			count *= k+1;
		}
		
		answer = count-1;
		//System.out.println("wear : " + wear);

		return answer;
	}
	*/
	
	/* 2. java 1.8 stream 사용한 풀이*/
	private static int solution(String[][] clothes) {
		   return Arrays.stream(clothes)
	                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
	                .values()
	                .stream()
	                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	    }
	
}
