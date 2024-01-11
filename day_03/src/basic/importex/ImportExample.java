package basic.importex;
/*
 * 같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스파일은
 * 언제든지 가져다가 사용할 수 있습니다.
 * 다만 다른 패키지에 있는 클래스를 사용햐려면 반드시 package 선언부 아래
 * (1번 라인 아래)에 import 선언을 통해 참조할 클래스의 경로를 적어야합니다.
 * ex) import java.util.Date; <- Date클래스를 참조하는 경로
 */

import basic.fruit.Apple;
import basic.hello.bye.Bye;
import basic.hello.hi.Hi;

public class ImportExample {

	public static void main(String[] args) {
		//같은 패키지 내의 다른 클래스를 호출할 때는 어떤 참조설정도 필요하지않음
		Test test = new Test();
		
		Apple apple = new Apple();
		Hi hi = new Hi();
		Bye bye = new Bye();
		

	}

}
