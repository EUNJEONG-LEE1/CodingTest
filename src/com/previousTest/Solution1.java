package com.previousTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
	
	public static void main(String[] args) {
		
		String[] scores = {"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"};
		
		solution(scores);
	}

	
	public static int solution(String[] scores) {
        int answer = 0;
        
        for(int i=0; i<scores.length; i++) {
        	String nowScore = scores[i];
            System.out.println("nowScore : ["+i+"] : "+  scores[i]);
        	//System.out.println("nowScore.length() : " + nowScore.length());
        	
            //ArrayList<String> nowScoreArray = new ArrayList<String>(); 
            List<String> nowScoreArray = new ArrayList<String>();
            //String[] nowScoreArray;
            Integer countF = 0;
    		Integer countA = 0;
        	for(int j=0; j<nowScore.length(); j++) {
        		String nowScoreSplit = nowScore.substring(j, j+1);
        		 //System.out.println("nowScoreSplit : "+  nowScore.substring(j, j+1));
        		
        		nowScoreArray.add(nowScoreSplit);

        		if(nowScoreSplit.equals("F")) {
        			countF++;
				}else if(nowScoreSplit.equals("A")) {
					countA++;
        		}
        	}
        	//System.out.println("countF : " + countF);
        	//System.out.println("countA : " + countA);
        	
        	if(countF>1) {
        		
        	} else if((countA>1)&&(countF<2)) {
        		answer++;
            	//System.out.println("nowScoreArray : 합격 : " + nowScoreArray);
        	} else {
        		
        		Collections.sort(nowScoreArray);
            	//System.out.println("nowScoreArray : sort : " + nowScoreArray);
            	
            	float nowAverage = 0;
            	for(int a=1; a<nowScoreArray.size()-1; a++) {
            		
                	//System.out.println("a : " + a);
                	//System.out.println("nowScoreArray[a] : " + nowScoreArray.get(a));
            		String score = nowScoreArray.get(a);
            		
            		switch(score) {
            			case "A" : 
            				nowAverage = nowAverage+5;
            				break;
            			case "B" : 
            				nowAverage = nowAverage+4;
            				break;
            			case "C" : 
            				nowAverage = nowAverage+3;
            				break;
            			case "D" : 
            				nowAverage = nowAverage+2;
            				break;
            			case "E" : 
            				nowAverage = nowAverage+1;
            				break;
            			case "F" : 
            				nowAverage = nowAverage+0;
            				break;
            				
            		}            		
            		
            	}
            	nowAverage=nowAverage/(nowScoreArray.size()-2);
            	//System.out.println("nowAverage : " + nowAverage);
            	if(nowAverage>=3) {
                	//System.out.println("합격 : ");
            		answer++;
            	}
            	
        	}
        	
        	
        	System.out.println("answer : " + answer);
        }
        
        return answer;
    }
	
	
}
