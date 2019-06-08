package lean.spring.createobject_ioc;

public class StudentService {

	private String studentName;
	private String className;
	
	private StudentService(String studentName, String className)
	{
		this.studentName= studentName;
		this.className = className;
	}
	
	private StudentService(StudentDetails studentDetails)
	{
		this.studentName= studentDetails.studentName;
		this.className = studentDetails.className;
	}
	
	public void printNames() {
		System.out.println(studentName +" "+className);
	}
}
