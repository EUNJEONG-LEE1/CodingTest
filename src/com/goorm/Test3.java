package com.goorm;
import java.util.Scanner;

//[일반 프로그래밍 문제] 사은품 교환하기
// 테스트 케이스
// 4
// 12 0
// 10 14
// 4 20
// 5 2147483648
// -> 1
// -> 2
// -> 0
// -> 1

public class Test3 {

    public static void main(String[] args) {

    // 사은품 조건 : 12장의쿠폰 중 5개이상의 시즌한정 음료
    Scanner sc = new Scanner(System.in);

        System.out.println("총 테스트케이스 횟수 입력");
        //int count =sc.nextInt();
        String count = sc.nextLine();

        for(int i=0; i< Integer.parseInt(count); i++ ){
            String coupon = sc.nextLine();
            String[] strArray = coupon.split(" ");
            long n = Long.parseLong(strArray[0]);
            long m = Long.parseLong(strArray[1]);

            //System.out.println(i + "n m : " + n+", " +m);
            long result = 0;
            long nm =  Math.floorDiv(n+m, 12);

            if(nm>0){
                long nn =  Math.floorDiv(n,5);

                if(nn>nm){
                    result = nm ;
                }else {
                    result = nn;
                }
            }
            System.out.println(result);
        }

    }
}
