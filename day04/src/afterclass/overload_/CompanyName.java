package afterclass.overload_;

public class CompanyName {

	public static void main(String[] args) {
		
		Company_ c1 = new Company_(); 
		System.out.println("연봉은:"+c1.money);
		System.out.println("어딘데"+c1.companyName);
		
		Company_ c2 = new Company_(100, "서울여대"); 
		System.out.println("연봉은:"+c2.money);
		System.out.println("어딘데 "+c2.companyName);
		

	}

}
