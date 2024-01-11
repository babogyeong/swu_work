package overload;

public class Human {
	
	public String name;
	public int age;
	
	//생성자 오버로딩은 생성자를 여러 유형으로 만드는 것
	//파라미터는 ()-> void파라미터
	//           (string,int)
	//두가지 유형으로 만들어보겟삼
	
	public Human() { //void파라미터, new Human() 인 경우 
		name ="이름을 입력하지 않았습니다";
		age =19;
	}
	
	public Human(String n, int a) {//String, int파라미터,new Human("문자",정수)시 호풀
		name =n;
		age = a;
	}

}
