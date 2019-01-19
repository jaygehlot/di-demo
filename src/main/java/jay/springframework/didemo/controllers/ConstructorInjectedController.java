package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsService;

//BEST practice
public class ConstructorInjectedController {

    private GreetingsService greetingsService;

    /**
     * Constructor is taking in the interface and not the implementation
     */
    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    String sayHello() {
        return greetingsService.sayGreeting();
    }
}
