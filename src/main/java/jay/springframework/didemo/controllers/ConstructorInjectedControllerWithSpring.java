package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceUsingSpring;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedControllerWithSpring {
    private GreetingsServiceUsingSpring greetingsService;

    /**
     * Constructor is taking in the interface and not the implementation
     *
     */
    //DON't need to Autowire the constructor to pull in the GreetingServiceUsingSpring implementation,
    // as of Spring 4.2 satisfying this dependency happens automatically, if using previous version,
    // then need to add @Autowired
    public ConstructorInjectedControllerWithSpring(GreetingsServiceUsingSpring greetingsServiceUsingSpring) {
        this.greetingsService = greetingsServiceUsingSpring;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
