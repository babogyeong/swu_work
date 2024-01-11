package class_;

public class Cat {
	
	//이름, 나이, 품종, 털색깔

	public String name;
	public int age;
	public String kind;
	public String color;
	
	//클래스 정의용 클래스 파일 내부 메서드는 static을 붙이지 않습니다.
	//ㅇ제 변수와 메서드가 같은 소속이라 레퍼런스 주소 안 붙여도 된다요
	public void showCatInfo() {
		System.out.println("고양이의 이름 : "+ name);
		System.out.println("고양이의 나이 : "+ age);
		System.out.println("고양이의 품종 : "+ kind);
		System.out.println("고양이의 색상 : "+ color);
	}
}
