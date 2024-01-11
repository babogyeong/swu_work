package hetero;

public class Main {

	public static void main(String[] args) {
		// 기본형 자료형으로 만든 배열 예시
		//다른 자료형을 넣을 수 없음
		//int[] iArr = {1,2,3,4,5,"인프라"}
		
		//A자료형의 힙 주소를 배열로 저장가능한 배열 생성
		A[] aArr = new A[2];
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		//모든 클래스의 부모 클래스인 Object 배열을 선언하면
		//다형성원리(부모 객체를 요구하는 자리에 자식타입을 대입가능함) 에의해
		//모든 자료를 다 대입할 수 있음
		
		Object[] oArr = new Object[2];
			
		B b1 = new B();
		//oArr[1] =b1; A타입구하는 배열에 b타입 대입불가
		oArr[0] = b1;
		oArr[1] = a2;
		
		oArr[1] = 100; //심지어 오브젝트 배열에는 기본형 자료도 대입가능
		
		
	}

}
