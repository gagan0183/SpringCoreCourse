package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		InjectConstructor constructor = (InjectConstructor) ctx.getBean("injectConstructor");
		constructor.message();

		SetterBaseService baseService = (SetterBaseService) ctx.getBean("setterBaseService");
		baseService.message();
	}
}
