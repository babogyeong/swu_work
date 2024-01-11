package retry.super_;

public class Airplane {

	public String planeCode;
	protected int speed;
	public int gas;
	
	//속도 0, 연료 100으로 고정, 편명만 입력받는 생성자 정의
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	//최대 속도를 900으로 설정하는 메서드 fly를 정의하겠습니다.
	//호출시 연료는 3씩 차감되고, 속도는 100씩 증가합니다.
	
	public void fly() {
		if(this.gas-3 <= 0) {
			System.out.println("연료 부족해 운행 불가능");
			return;
		}
		if(speed+100>=900) {
			this.speed+=100;
			this.gas-=3;
			return;
		}
		speed+=100;
		this.gas-=3;
		
	}
	
	//계기판 보는 메서드
	
	public void showStatus() {
		System.out.println("비행기넘버"+this.planeCode);
		System.out.println("비행기속도"+this.speed);
		System.out.println("비행기가스"+this.gas);
	}
}
