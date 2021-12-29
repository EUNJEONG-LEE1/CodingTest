package com.previousTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Encrypter {

	static String name ="Kate Winslet";
	//static String name ="Kate Wins?let";
	public static void main(String[] args) {
		getEncryptedName(name);
	}
	
	
	public static String getEncryptedName(String name) {
		

        String result="";
        String regex = "^[a-zA-Z\\s]*$";
       
		try {
						
			List<String> array = new ArrayList<String>();
	        
			  for (int i = 0; i < name.length(); i++) {
		            char ch = name.charAt(i);
		            
		            if(!Pattern.matches(regex, Character.toString(ch))) {
						throw new Exception();
					}
		            
		            if(Character.isUpperCase(ch)==true) {
						ch = Character.toLowerCase(ch);
		            }
		            array.add(Character.toString(ch));
		            
			  }
			  Collections.reverse(array);
			  
			  StringBuilder resultBuilder = new StringBuilder();
			  
			  for(String str : array) {
				  result = resultBuilder.append(str).toString();
				}

				System.out.println("array : " +array);
				System.out.println("result : " +result);
			
		} catch (Exception e) {
			result = "java.lang.IllegalArgumentException: Try again with valid name";
			System.out.println("java.lang.IllegalArgumentException: Try again with valid name");
		}
		
		return result;
	}


    public static boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            //System.out.println("ch / " +i+" : " + ch );
            //System.out.println("Character.isLowerCase(ch)" + Character.isLowerCase(ch));
            //System.out.println("Character.isUpperCase(ch)" + Character.isUpperCase(ch));
            
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        
        return true;
    }
	

}
