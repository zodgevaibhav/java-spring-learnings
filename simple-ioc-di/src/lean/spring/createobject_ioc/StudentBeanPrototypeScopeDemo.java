package lean.spring.createobject_ioc;

public class StudentBeanPrototypeScopeDemo {

	public StudentBeanPrototypeScopeDemo()
	{
		System.out.println("New object created...");
	}
	
	private void beanInit()
	{
		System.out.println("***** On bean init");
	}
	
	private void beanDestroy()
	{
		System.out.println("***** On bean destroy");
	}
}
