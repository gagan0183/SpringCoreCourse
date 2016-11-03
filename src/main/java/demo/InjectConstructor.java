package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectConstructor {
	private HelloWorldService helloWorldService;

	@Autowired
	public InjectConstructor(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void message() {
		helloWorldService.sayHello();
	}
}
