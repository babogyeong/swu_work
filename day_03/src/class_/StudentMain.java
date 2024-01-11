package class_;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("곱창전골",21,"A");
		//s1.age = 21;
		//s1.grade = "A";
		//s1.name = "곱창전골";
		
		Student s2 = new Student("만두전골",26,"b");
		//s2.age = 26;
		//s2.grade = "b";
		//s2.name = "만두전골";
		
		s1.studentInfo();
		s2.studentInfo();
		
		

	}

}
