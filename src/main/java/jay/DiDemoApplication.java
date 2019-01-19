package jay;

import jay.springframework.didemo.controllers.ConstructorInjectedControllerWithSpring;
import jay.springframework.didemo.controllers.MyController;
import jay.springframework.didemo.controllers.PropertyInjectedControllerUsingSpring;
import jay.springframework.didemo.controllers.SetterInjectedControllerUsingSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = context.getBean("myController", MyController.class);

		myController.hello();

        System.out.println(context.getBean(PropertyInjectedControllerUsingSpring.class).sayHello());
        System.out.println(context.getBean(SetterInjectedControllerUsingSpring.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedControllerWithSpring.class).sayHello());
    }
}
