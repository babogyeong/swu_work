package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		
		BasketBallPlayer p1 = new BasketBallPlayer("dk",202,31,1999999);
		//p1.name = "dk";
		//p1.height = 202;
		//p1.age = 31;
		//p1.salary = 1999999;
		
		BasketBallPlayer p2 = new BasketBallPlayer("justin",182,21,300999);
		//p2.name = "justin";
		//p2.height = 182;
		//p2.age = 21;
		//p2.salary = 300999;
		
		p1.showInfo();
		p1.dunkShoot();
		p2.showInfo();
		p1.dunkShoot();
		
	}
	
	
		
	

}
