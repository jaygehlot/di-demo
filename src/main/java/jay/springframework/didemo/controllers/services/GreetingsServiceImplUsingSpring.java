package jay.springframework.didemo.controllers.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImplUsingSpring implements GreetingsServiceUsingSpring {

    public static final String HELLO_ENGINEERS = "Hello Devs";

    @Override
    public String sayGreeting() {
        return HELLO_ENGINEERS;
    }
}
