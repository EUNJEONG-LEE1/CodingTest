package com.goorm;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

// [일반 프로그래밍 문제] 문제 선정하기

// 테스트 케이스 1
//6 
//3 1 4 1 5 9
//--> YES

// 테스트 케이스 2
//5
//1 10 1 10 1
//--> NO

public class Test1 {

        public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);

            // next()는 공백 단위로 문자열을 읽는다
            // nextLine()는 Enter 단위로 문자열을 읽는다.  (Enter 입력은 \r\n 으로 구성된 두개의 문자이다.)
            System.out.println("문제의 갯수를 입력하시오");
            String n = sc.nextLine();

            System.out.println("스페이스를 띄워가며 문자열을 입력하시오");
            String str = sc.nextLine();

            // 1.scannaer 입력받은 String - > String 배열로 변환 -> Treeset 으로 변환
            String[] strArray = new String[Integer.parseInt(n)];
            strArray = str.split(" ");

            // Set은 요소의 중복을 허용하지 않는 데이터의 집합 - HashSet, LinkedHashSet, TreeSet
            // HashSet : 중복허용X. 정렬
            // LinkedHashSet은 추가된 순서에 따라 저장
            // TreeSet은 자동으로 정렬(default는 오름차순)해서 저장
            TreeSet<Integer> treeset = new TreeSet<>();

            for(int i=0; i< strArray.length; i++){
                treeset.add(Integer.parseInt(strArray[i]));
            }

            System.out.println("treeset : " + treeset);


            if(treeset.size()>2){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            //2. stream map 사용하여 scannaer 입력받은 String - > int배열로 변환
            String str2 = "[1, 2, 3, 4, 5]";

            int[] arr = Arrays.stream(str2.substring(1, str2.length() - 1).split(","))
            //int[] arr = Arrays.stream(str.split(" "))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();

            System.out.println("arr : " + Arrays.toString(arr));
            System.out.println("arr[3] : " + arr[3]);


        }
    }