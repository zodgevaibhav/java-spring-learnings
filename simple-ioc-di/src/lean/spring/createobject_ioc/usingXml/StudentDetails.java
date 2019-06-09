package lean.spring.createobject_ioc.usingXml;

public class StudentDetails {

	public String studentName;
	public String className;
	
	private StudentDetails(String studentName, String className)
	{
		this.studentName=studentName;
		this.className = className;
	}
}