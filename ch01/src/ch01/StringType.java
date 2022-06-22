package ch01;

public class StringType {

	public static void main(String[] args) {
		// 문자열 자료형
		char c = 'k';
		String s = "k";	//자료형이 String면 쌍따옴표를 사용한다.

		String name = "Ja" + "va";
		String str = name + 8.0;	//문자가 숫자보다 크므로 문자형으로 변환
		System.out.println(name);
		System.out.println(str);	//변수와 name과 실수 8.0을 연결한 값을 보여줌
	}

}
