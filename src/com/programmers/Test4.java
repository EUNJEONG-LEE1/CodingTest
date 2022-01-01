package com.programmers;

// Lv2. 전화번호 목록 - 미해결 (정확성: 62.5 효율성: 4.2 합계: 66.7 / 100.0)

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean answer = true;
		
		
		String [] phone_book = {"119", "114", "112", "123223123", "1231231234"};
		
		//System.out.println(Arrays.toString(phoneNum));
		
		String preNum = "";
		for(int i=0; i<phone_book.length; i++) {
			
			if(i==0) {
				preNum = phone_book[i];
				//System.out.println(preNum);
			}else {
				if(phone_book[i].length()>=preNum.length()) {
					String preNumNow = phone_book[i].substring(0, preNum.length());
					if(preNum.equals(preNumNow)) {
						answer = false;
						break;
					}
					//System.out.println(preNumNow);
				}

			}
		}
		
		System.out.println(answer);
	}

}
