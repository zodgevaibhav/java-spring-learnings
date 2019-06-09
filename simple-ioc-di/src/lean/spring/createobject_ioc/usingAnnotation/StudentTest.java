package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/applicationContext.xml");

		((Student)context.getBean("StudentBean")).printMyClassName(); //get bean with user defined bean ID
		
		((StudentWithDefaultBeanId)context.getBean("studentWithDefaultBeanId")).printMyClassName(); //get bean with default bean ID
		
		((StudentImpl)context.getBean("studentImpl")).printMyClassName(); //Dependency Injection - Constructor Injection using interface
		
		context.close();
	}
}