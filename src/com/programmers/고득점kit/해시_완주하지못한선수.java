package com.programmers.고득점kit;

import java.util.HashMap;

public class 해시_완주하지못한선수 {

	
	public static void main(String[] args) {
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa","1234"};	
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(Solution(participant, completion));
	}
	
	public static String Solution(String[] participant, String[] completion) {
		String answer = "";
	
	   HashMap<String, Integer> answerMap = new HashMap<>();
        for(int i=0; i<participant.length;i++) {
            String name = participant[i];
            if (answerMap.containsKey(name)) {
                int count = (int)answerMap.get(name);
                answerMap.put(name, ++count);                
            } else {    
                answerMap.put(name, 1);
            }
        }

        for(int i=0; i<completion.length;i++) {            
            int count = (int)answerMap.get(completion[i]);
            String name = completion[i];
            if (count == 1) {
                answerMap.remove(name);
            } else {                 
                answerMap.put(name, --count); 
            }  
        }    
        
        String temp = answerMap.keySet().toString();

        System.out.println(temp);
        System.out.println(temp.substring(1, temp.length()-1));
        
        answer = temp.substring(1, temp.length()-1);

		
		return answer;
	}
}
