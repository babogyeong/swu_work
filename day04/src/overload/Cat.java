package overload;

public class Cat {

	public String name;
	public String kind;
	
	public Cat() {//void 생성자
		name = "이름없음";
		kind = "종없음";
	}
	
	public Cat(String n, String k) { //String,String생성자
	
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은"+ n+ "입니다.");
		
	}
	
	public void call() {
		System.out.println(name +"이리와!");
	}
	
	public void call(String callName) {
		System.out.println(callName +"이리와!");
	}
	

}
