package com.emart220319;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String compressed ="3(2(3(hi)co)i)oo";
		
		System.out.println(solution(compressed));
	}


	
	private static String solution(String compressed) {
		
		String answer ="";
		
		Integer repeatCount = 0;
		
		String[] strArr = compressed.split("");
		
		for(int i = 0; i<compressed.length(); i++) {
			
			if(strArr[i].equals("(")) {
				repeatCount += 1;
			}
		}
		
		
		for(int j =0; j<repeatCount; j++) {
			compressed = solution2(compressed);
		}
		
		answer = compressed;
		
		return answer;
	}

	
	private static String solution2(String compressed) {
		
		ArrayList<Integer> startArray = new ArrayList<>();
		ArrayList<Integer> endArray = new ArrayList<>();
		
		String[] strArr = compressed.split("");
		
		for(int i = 0; i<compressed.length(); i++) {
			
			if(strArr[i].equals("(")) {
				startArray.add(i);
			} else if(strArr[i].equals(")")) {
				endArray.add(i);
			}
			
		}

		String newCompressed = "";
		if(startArray.size()>0) {
			Collections.sort(startArray, Comparator.reverseOrder());
			//System.out.println(startArray);			
			//System.out.println(endArray);
			
			newCompressed = changeResult(startArray.get(0), endArray.get(0), compressed);
		}

		//System.out.println("newCopressed : " +newCompressed);
		
		return newCompressed;
	}
	
	
	private static String changeResult(Integer startLength, Integer endLength, String compressed) {
		
		String changingWord = compressed.substring(startLength-1, endLength+1);
		//System.out.println("changingWord : " + changingWord);
		
		String repeatValue = compressed.substring(startLength+1, endLength);
		Integer repeatCount =Integer.parseInt(compressed.substring(startLength-1, startLength));

		//System.out.println("repeatValue : " + repeatValue);
		//System.out.println("repeatCount : " + repeatCount);
		
		String changedResult = "";
		for(int j =0; j<repeatCount; j++) {
			changedResult +=repeatValue;
		}
		//System.out.println("changedResult : " + changedResult);
		
		String newCopressed = compressed.replace(changingWord, changedResult);

		
		return newCopressed;
	}
}
