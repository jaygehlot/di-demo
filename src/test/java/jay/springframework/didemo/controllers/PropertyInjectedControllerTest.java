package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    public void testGreetingPropertyInjection() throws Exception {
        assertEquals(GreetingsServiceImpl.HELLO_ENGINEERS, propertyInjectedController.sayHello());
    }

}