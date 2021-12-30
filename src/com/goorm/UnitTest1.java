package com.goorm;

import java.util.Scanner;

//[Unit Test] 수식 표기법
public class UnitTest1 {

    public static void main(String[] args) {

        //중위표기법 A+B/C  --> (3+5)*2
        // 전위 표기법 +A / B C -->  A + (B/C)
        // 후위 표기법  A B + C / --> ( A + B ) / C

        Scanner sc = new Scanner(System.in);
        System.out.println("중위법으로 입력하세요");
        String expressions = sc.nextLine();

        UnitTest1 unitTest = new UnitTest1();   //힙(new) 생성자
        unitTest.getPostfix(expressions);

    }

    private String getPostfix(String expression){

        String result="";

        //향상된 for문 문자열 하나씩 출력하기
        for(char c : expression.toCharArray()){
            System.out.println("C : " + c);
        }
        return result;
    }


}
