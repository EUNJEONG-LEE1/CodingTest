package com.programmers.고득점kit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 정렬_k번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println( Arrays.toString(solution(array, commands)));
		
	}
	
    private static int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
        
    	for(int i=0; i<commands.length; i++) {
        
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int select = commands[i][2];

        	ArrayList<Integer> nowArray = new ArrayList<Integer>();
        	
        	for(int j=start-1; j<end; j++) {
        		int now =  array[j];
        		nowArray.add(now);
        	}
        	Collections.sort(nowArray);
        	        	
        	int selectResult = nowArray.get(select-1);
        	answer[i] = selectResult;

        }
        return answer;
    }

}
