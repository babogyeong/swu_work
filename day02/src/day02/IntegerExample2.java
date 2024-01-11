package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a = 127;
		//128이라는 매직넘버에는 문제가 없음 바이트에 담을 때 문제
	    short b = 32767;
	    //매직넘버 자체엔 문제 없음 쇼트에 못 담아
	    int c  = 2147483647;
	    //매직넘버에 문제 있음 int 최대범위를 넘어서 에러가 뜸
	    //뒤에 L을 넣어야함 소문자 l은 헷갈림
	    //Long자료형 매직넘버로 바꿔줘야 에러가 사라짐
	    long d = 2147483648L;
	    System.out.println(d);
	    
	    //매직넘버를 2진수로 표현하고 싶다면 접두어로 0을 왼쪽에 붙입니다.
	    int bin = 0b1010;
	    System.out.println(bin);
	    
	    //8진수로 표현 접두어로 0을 왼쪽에 붙임
	    int oct = 064;
	    System.out.println(oct);
	    
	    //16진수는 0x붙이기
	    int hex = 0x3a4c;
	    System.out.println(hex);

	}

}
