package chap10;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("hong","1234-5678",1);
		System.out.println("name:"+student.name);//상속받은 필드
		System.out.println("ssn: "+student.ssn);//상속받은 필드
		System.out.println("studentNO: "+student.studentNo);

	}

}
