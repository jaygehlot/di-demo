package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    public void testGreetingControllerInjection() {
        assertEquals(GreetingsServiceImpl.HELLO_ENGINEERS, constructorInjectedController.sayHello());
    }

}