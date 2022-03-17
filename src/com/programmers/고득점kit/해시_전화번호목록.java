package com.programmers.고득점kit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class 해시_전화번호목록 {

	
	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88"};
		System.out.println(solution(phone_book));
	}

		
    private static boolean solution(String[] phone_book) {
	   boolean answer = true;
	   
       Arrays.sort(phone_book, new Comparator<String>() {
           public int compare(String o1, String o2) {
               return o2.length() - o1.length();
           }
       });

       HashMap<String, String> hm = new HashMap<>();
       for (String str : phone_book) {
           if (hm.get(str) != null) {
               answer =  false;
           }
           for (int i = 1, len = str.length() ; i <= len; i++) {
               hm.put(str.substring(0, i), "");
           }
       };
       //answer =  true;
	   
	   return answer;
    }
}
