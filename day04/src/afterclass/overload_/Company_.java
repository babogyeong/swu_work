package afterclass.overload_;

public class Company_ {
	
	public int money;
	public String companyName;
	
	public Company_() { // void생성자
		
		money = 1000000;
		companyName = "아직 밝혀지지않음";
	
	}
	
	public Company_(int m, String c) {
		
		money = m;
		companyName = c;
		

	}

}
