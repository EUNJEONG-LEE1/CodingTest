package com.goorm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//[일반 프로그래밍 문제] 물류센터 - 미해결
public class Test4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("n은 대리점 번호 (n+1개)");
        String input_n = sc.nextLine();
        Integer n = Integer.parseInt(input_n);

        //String[] uvc_array = new String[n];
        ArrayList<String> uvc =  new ArrayList<String>();
        System.out.println("u v 대리점 번호 c 유통비용");
        for(int i=0; i<n; i++){
            String input_uvc = sc.nextLine();
            uvc.add(input_uvc);
            //uvc_array[i] = input_uvc;
            //System.out.println("nowUve : "+ Arrays.toString(nowUve));
        }

        System.out.println("uvc : "+ uvc);
        //System.out.println("uvc_array : "+ Arrays.toString(uvc_array));
        //System.out.println("uvc_array[0] : "+ uvc_array[0]);
        Integer[] resultArray = new Integer[n];
        for(int i=0; i<n; i++){
            System.out.println("i  : " +i);
            Integer store = i;
            Integer result = 0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    Integer path = j;

                    System.out.println("j  : " +j);
                    if(uvc.contains(i+" "+j)){

                        String  cost = uvc.split(" ")[2];
                        //result = +
                    }

                }
            }
            System.out.println("-------");

            //String nowUve = input_uvc.split(" ");


        }




    }

}
