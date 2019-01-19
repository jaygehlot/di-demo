package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceUsingSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedControllerUsingSpring {

    private GreetingsServiceUsingSpring greetingsServiceImplUsingSpring;

    public String sayHello(){
        return greetingsServiceImplUsingSpring.sayGreeting();
    }

    //using a setter to inject - NOT preferred
    @Autowired
    public void setGreetingService(GreetingsServiceUsingSpring greetingsServiceUsingSpring) {
        this.greetingsServiceImplUsingSpring = greetingsServiceUsingSpring;
    }

}
