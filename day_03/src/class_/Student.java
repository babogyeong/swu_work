package class_;

public class Student {
	
	public String name;
	public String grade;
	public int age;
	
	public Student(String n, int a, String g) {
		name = n;
		age = a;
		grade = g;
		
	}
	
	public void studentInfo() {
		System.out.println("학생의 이름 :"+ name);
		System.out.println("학생의 성적 :" + grade);
		System.out.println("학생의 나이 :" +age);
	}
	
	

}
