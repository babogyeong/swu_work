package afterclass.overload_;

public class Cat_ {

	
	public String name;
	public String kind;
	
	public Cat_() {
		name = "야옹이";
		kind = "길냥이";
	}
	
	public Cat_(String n, String k) {
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은"+name+"입니다.");
		
	}
	
	public void call() {
		System.out.println("야옹아 이리와!");
	}
	
	public void call(String n) {
		System.out.println(n+"아 이리와!");
	}
	
}
