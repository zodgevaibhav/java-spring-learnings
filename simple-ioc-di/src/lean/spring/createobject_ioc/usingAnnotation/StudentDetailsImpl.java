package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.stereotype.Component;

@Component
public class StudentDetailsImpl implements IStudentDetails {

	@Override
	public void printClassName() {
		System.out.println("I am in StudentDetailsImpl class");

	}

}
