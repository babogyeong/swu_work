package override;

public class OverrideExample {

	public static void main(String[] args) {
		//프로그래머 클래스의 인스턴스를 생성해주세요.
		Programmer p1 = new Programmer();
		
		//해당 인스턴스에 값을 대입해주세요.
		
		p1.name = "선지국밥";
		p1.age = 22;
		p1.devLang = "c";
		p1.repoCount = 49;
		
		//자기소개와 코딩을 시켜보세요.
		
		p1.자기소개하기1();
		p1.코딩하기();

	}

}
