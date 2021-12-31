package com.programmers;
import java.util.ArrayList;

// Lv.2 문자열 압축 - 미해결
// https://programmers.co.kr/learn/courses/30/lessons/60057
public class Test3 {
	public static void main(String[] args) {
	
		int answer = 0;
		String s = "aabbccdde";

		
		String[] strArray = s.split("");
		//System.out.println(Arrays.toString(strArray));
		
		ArrayList<Integer> anwArray = new ArrayList<Integer>();
		
		for(int i=2; i<strArray.length/2+1; i++) { // 8 /4 234
			
			ArrayList<String> divStr = new ArrayList<String>();
			
			int num = i;
			System.out.println("i : " +i);
			
			for(int j=0; j<strArray.length/i; j++) { //4 

				//System.out.println("j : " +j);
				String nowStr = "";
				for(int x=1; x<i+1; x++) {  //1 1 2 ///
					//System.out.println("x : " +x);
					nowStr = nowStr + strArray[(j*x)];
				}
				//System.out.println(nowStr);
				divStr.add(nowStr);
				//System.out.println("----");
				
			}

			System.out.println("divStr" + divStr);
			System.out.println("---------------");
			
			
			
		}
		
		
		System.out.println(answer);
		
		
		
		
	}



}
