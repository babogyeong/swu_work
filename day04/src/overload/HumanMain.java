package overload;

public class HumanMain {

	public static void main(String[] args) {
		//Human을 생성하시되 하나는 void생성자로 만들고
		Human h1 = new Human();
		System.out.println("사람이름은 "+h1.name);
		System.out.println("사람나이는 "+h1.age);
		
		
		
		//다른 하나는 (String, int)생성자를 이용
		Human h2 = new Human("국밥",21);
		System.out.println("사람이름은 "+h2.name);
		System.out.println("사람나이는 "+h2.age);

	}

}
