package day02;

public class CharStringExample {

	public static void main(String[] args) {
		//단일 문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 66; // 단일 문자는 숫자와 교한 가능, ascii code 상 65는 A, 66은 B
		/*
		 *한글 '가'를 유니코드로 표현할 때는 AC00인데 
		 *직접 코드값을 char 에 저장할 때는 탈출문자 \(역슬래쉬)u 왼쪽에 붙입니다
		 */
		
		char c3 = '\uAC00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//대문자 A는 65다 소문자는 91이다 알아두기 코테준비

		//문자열을 저장할 수 있는 데이터 타입 String
		String s1 = "my dream";
		String s2 = "my dream";//동일 문자열은 string pool에 한 번만 저장
		System.out.println("---------------");
		System.out.println(s1);
		System.out.println(s2);
	}

}
