package com.goorm;

import java.util.Arrays;
import java.util.Scanner;

// [일반 프로그래밍 문제] 근무자흑

// 테스트 케이스 1
// 8 3
// 7 3 1 8 4 6 2 5
// -> 4

//테스트 케이스 2
//37 4
// 31 36 20 30 1 9 6 13 3 29 11 25 7 8 2 24 34 18 26 15 23 28 37 19 21 4 32 14 16 10 12 27 22 35 5 17 33
// -> 12

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("N과 K 입력");
        String nk = sc.nextLine();

        System.out.println("N의 크기를 가지는 수열 입력");
        String arr = sc.nextLine();

        Integer n = Integer.parseInt(nk.split(" ")[0]) ;
        Integer k = Integer.parseInt(nk.split(" ")[1]);

       Integer result = 0;
       if(Math.floorMod((n-k), (k-1))==0){ //나머지 : Math.floorMod
           result = 1+ Math.floorDiv((n-k),(k-1)); //몫 : Math.floorDiv
       } else {
           result = 2+ Math.floorDiv((n-k),(k-1));
       }

       System.out.println(result);




    }
}
