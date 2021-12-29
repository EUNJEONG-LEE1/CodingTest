package com.previousTest;

import java.util.Scanner;

/*
 * Create the Encrypter class here.
 */



class Validator {
    
    
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        
        return true;
    }
}

public class Solution_validator2 {
	
    private static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
        String name = INPUT_READER.nextLine();
        
        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}