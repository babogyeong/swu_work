package noinheri;

public class Rat {

	//토끼 몬스터를 만드니다.
	//토끼는 hp,atk,def
	
	private int hp;
	private int atk;
	private int def;
	
	//체력 공격력 방어력 각각 5,1,0으로 초기화
	
	
	
	public Rat() {
		this.hp =5;
		this.atk = 1;
		this.def =0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
