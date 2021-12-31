package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        Test1 test = new Test1();

        String str = "bacabaacaa";
        
        test.solution(str);

    }

    static ArrayList<String> newStrs = new ArrayList<String>();
    static ArrayList<String> strAttayOrigin = new ArrayList<String>();
    
    public void solution(String str){
        //int answer = 0;

        ArrayList<String> strAttay = new ArrayList<String>(Arrays.asList(str.split("")));
        strAttayOrigin =  strAttay;
        resolution(strAttay);
        
        if(resolution(strAttay)==1) {
        	System.out.println(1);
        } else if(resolution(strAttay)==0) {
        	System.out.print(0);
        } else if (resolution(strAttay)==2) {
            resolution(strAttay);   
        }

       // return answer;
    }

    
    // 재귀함수
    public static Integer resolution(ArrayList<String> strAttay){
		//System.out.println("newStrs : " +newStrs);
		//System.out.println("strAttay : " +strAttay);
    	
		if(newStrs == strAttay) {
			System.out.println("strAttay : " +strAttay);
    		return 1;
        	//System.out.print(1);
    	}
    	newStrs =  strAttay;
    	
        
        for(int i=0; i<newStrs.size()-1; i++) {
        	
            String c1 = newStrs.get(i);
            String c2 = newStrs.get(i+1);

            if (c1.equals(c2)) {
            	newStrs.remove(i + 1);
            	newStrs.remove(i);
                //System.out.println("newStrs : " + newStrs);
                break;
            }
            if((i==newStrs.size()-1)&&(!c1.equals(c2))) {
                System.out.println("newStrs : " + newStrs);
            	return 1;
            }

        }
        
        if(newStrs.size()==0) {
        	return 0;
        } else {
            return 2;
        }
        

    }
    


}
