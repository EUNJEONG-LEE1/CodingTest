package com.goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


// TEST(주)구르미 신입 개발자 공개채용 코딩테스트
// [일반 프로그래밍 문제] 문제 선정하기

public class Test1 {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            // 난이도의 문제 받기
            int[] questions = new int[N];
            String str = br.readLine();
            String[] split = str.split(" ");
            for(int i = 0; i < N; ++i){
                questions[i] = Integer.parseInt(split[i]);
            }

            Arrays.sort(questions);

            int count = 1;
            int before = questions[0];
            for(int i : questions){
                if(before != i)
                    count++;
                else if (count == 3)
                    break;
                before = i;
            }
            if(count < 3)
                System.out.print("NO");
            else
                System.out.print("YES");

            br.close();

        }
    }