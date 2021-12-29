package com.previousTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
	public static void main(String[] args) {
		
		String[] record = {"id=1 sit k=1",
							"id=2 sit k=3",
							"id=3 sit k=2",
							"id=2 leave",
							"id=4 sit k=4",
							"id=5 sit k=2"};
		solution2(record);
	}
	
	
    public static long[][] solution2(String[] record) {

    	long[][] answer = {};

        Integer kRage=0;
        Integer id=0;
        Integer k=0;
        
        List<String> arr = new ArrayList<String>();
        
        for(int i=0; i<record.length; i++) {

        	if(record.length>1000) break;
        	if(kRage>100000000) break;

        	String[] array = record[i].split(" ");
            
        	id=Integer.parseInt(array[0].split("=")[1]);
            String status = array[1];
            
            if(status.equals("sit")) {
                k = Integer.parseInt(array[2].split("=")[1]);
                arr.add(id+","+(k+kRage)+","+k);            
                kRage =  kRage+k+1+k;

            }else {
            	for(int j=0; j<arr.size(); j++) {
            		String sitId =  arr.get(j).split(",")[0];
            		if(sitId.equals(id.toString())) {
                		kRage =  kRage-1-(Integer.parseInt(arr.get(j-1).split(",")[2]));
                		arr.remove(j);
            		}
            	}
            	            	
            }
            
        }

        System.out.println(arr);
        System.out.println(Arrays.toString(answer));
        
        
        //System.out.println("Arrays.toString(test[1])" + Arrays.toString(test));
        
        
        
        return answer;
    }
}
