package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/applicationContext.xml");

		((Student)context.getBean("Student")).printMyClassName();
		context.close();
	}
}