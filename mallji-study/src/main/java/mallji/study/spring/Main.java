package mallji.study.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AopDemoServiceImpl service = context.getBean("demoService", AopDemoServiceImpl.class);
		service.performAction();
		context.close();
	}
}
