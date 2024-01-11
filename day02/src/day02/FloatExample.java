package day02;

public class FloatExample {

	public static void main(String[] args) {
		//매직넘버 실수는 double 이기 때문에 float 자료형에 저장할때에는
		//뒤에 f를 붙여서 float 으로 바꿔줘야합니다.
		float f1 =7.12345F;
		double d1 = 7.12345;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("---------------");
		float f2 = 1.123457891234F;
		double d2 =1.23455671234;
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println(0.12345e+7); //0.12345 7자리 올리기

		System.out.println(100e-5); //100을 5자리 내리기
	}

}
