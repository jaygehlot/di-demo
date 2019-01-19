package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsService;
import org.springframework.stereotype.Controller;

/**
 * Property/field injection is NOT a good practice
 */
public class PropertyInjectedController {

        //using a property to inject - NOT good practice
        public GreetingsService greetingsService;

        public String sayHello() {
            return greetingsService.sayGreeting();
        }


}

