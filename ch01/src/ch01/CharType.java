package ch01;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - 아스키 코드 < 유니코드
		// char - 2바이트
		char ch1 = 'A';	//문자자료형 변수 ch1에 'A'를 할당
		System.out.println(ch1);
		System.out.println((int)ch1); //숫자 코드값으로 변경 65는 A
		
		char ch2 = 66;	//캐릭터 자료형에 66을 지정
		System.out.println(ch2);	//66은 B
		
		System.out.println("*****유니코드*****");
		
		char uniCode1 = '한';	//한글의 '한'도 한개의 문자이므로 홑따옴표 사용
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55c'; //유니코드 한문자 표기
		System.out.println(uniCode2);
		
		//영어 소문자 출력해보기
		for(char c = 97; c < 123; c++) {
			System.out.print(c + " ");
		}
	}

}
