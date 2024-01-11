package overload;

public class CatMain {

	public static void main(String[] args) {
		//void생성자로 만든 고양이
		Cat c1 = new Cat();
		System.out.println(c1.kind);
		System.out.println(c1.name);
		
		c1.call();
		c1.call("야옹아");
		System.out.println("------------------------------");
		
		//String, String 생성자로 만든 고양이
		Cat c2 = new Cat("밥","길냥이");
		System.out.println(c2.kind);
		System.out.println(c2.name);
		c2.call();
		c2.call("멍청이");
		System.out.println("---------------------------");
		

	}

}
