package lean.spring.createobject_ioc.usingXml;

public class Teachers {
	
	private String Teacher;
	private String cName;

	private Teachers() {}

	public void setTeacherName(String teacherName) {
		Teacher = teacherName;
	}
	
	public String getTeacherName() {
		return Teacher;
	}

	public void setClassName(String className) {
		this.cName = className;
	}

	public String getClassName() {
		return cName;
	}
}