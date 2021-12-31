package com.programmers;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        Test1 test = new Test1();

        String str = "baabaa";


        test.solution(str);

    }

    public void solution(String str){
        //int answer = 0;

        ArrayList<String> newStr = new ArrayList<String>(Arrays.asList(str.split("")));
        resolution(newStr);

       // return answer;
    }

    public static void resolution(ArrayList<String> newStr){

        //ArrayList<String> newStr2 =  new ArrayList<>();

        for(int i=0; i< newStr.size(); i++) {
            String c1 = newStr.get(i);
            String c2 = newStr.get(i+1);
            System.out.println("c1 : " + c1 + ", c2 : " + c2);

            if (c1 == c2) {
                System.out.println("newStr= : " + newStr);
                newStr.remove(i + 1);
                newStr.remove(i);
                System.out.println("newStr : " + newStr);
                break;
            }
        }
        resolution(newStr);

    }


}
