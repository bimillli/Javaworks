package ch01;

public class Printdata {

	public static void main(String[] args) {
		//숫자
		System.out.println(100);
		System.out.println(3.3);
		System.out.println("-------------");
		
		//문자
		System.out.println('A'); //홑따옴표 - 그냥 문자 표기
		System.out.println("A"); //쌍따옴표 - 문자열 표기
		System.out.println("가");
		System.out.println("banana"); //문자열을 홑따로 쓰면 에러뜸
		System.out.println("apple"); //문자열
		
		//불리언(boolean)
		System.out.println(true);
		System.out.println(4 > 5);
		
		//연산
		System.out.println(100+10); // 숫자 더하기
		System.out.println(100+"10"); //문자 연결, "100"+"10"과같다.
	}

}
