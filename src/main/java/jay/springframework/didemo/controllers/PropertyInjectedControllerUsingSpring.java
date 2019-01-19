package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceUsingSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedControllerUsingSpring {

    //using a property to inject - NOT good practice
    @Autowired
    public GreetingsServiceUsingSpring greetingsServiceUsingSpring;

    public String sayHello() {
        return greetingsServiceUsingSpring.sayGreeting();
    }
}
