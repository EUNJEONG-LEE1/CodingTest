package com.previousTest;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//int[] numbers = {6, 10, 2};
		int[] numbers = {3, 30, 34, 5, 9};
		Solution(numbers);
	}
	
	
  private static String Solution(int[] numbers) {
	// TODO Auto-generated method stub
	
	  System.out.println(Arrays.toString(numbers));
	  
	  String answer = "";
	  
	   for(int i=0;i<numbers.length-1;i++) {
           for(int j=0;j<numbers.length-1-i;j++){
        	   //System.out.println("j : "+Integer.toString(numbers[j]).substring(0,1));
        	   //	System.out.println("j+1 : "+Integer.toString(numbers[j+1]).substring(0,1));

        	   String left = Integer.toString(numbers[j]).substring(0,1);
        	   String right = Integer.toString(numbers[j+1]).substring(0,1);
        	   if(Integer.parseInt(left)<Integer.parseInt(right)) {
        		   int tmp=numbers[j];    
                   numbers[j]=numbers[j+1];
                   numbers[j+1]=tmp;
               }else if (Integer.parseInt(left)==Integer.parseInt(right)) {
            	   String nowNum = Integer.toString(numbers[j]).substring(0,1);
            	   String left2 = (Integer.toString(numbers[j])+nowNum).substring(0,2);
            	   String right2 = (Integer.toString(numbers[j+1])+nowNum).substring(0,2);
            	   //System.out.println(left2 + " : " + right2);
            	   if(Integer.parseInt(left2)<Integer.parseInt(right2)) {
            		   int tmp=numbers[j];
                       numbers[j]=numbers[j+1];
                       numbers[j+1]=tmp;
            	   }
               }
           }
       }    
       for(int i:numbers) {
    	   answer=answer+i;
          // System.out.print(i+" ");
       }

               
        	
//        	String numLeft = Integer.toString(numbers[i]).substring(0,1);
      
        //Collections.sort(num1, Comparator.reverseOrder());
        

 	  System.out.println(Arrays.toString(numbers));
 	  System.out.println(answer);
 	  
        
        return answer;
        
    }


}
