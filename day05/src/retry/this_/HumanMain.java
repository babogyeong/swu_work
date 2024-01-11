package retry.this_;

public class HumanMain {

	public static void main(String[] args) {
		Human Kim = new Human("김지현",22);
		Kim.showInfo();
		
		Human lee = new Human("이지현");
		lee.showInfo();
		
		Human noname = new Human();
		noname.showInfo();
	}

}
