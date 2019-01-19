package jay.springframework.didemo.controllers;

import jay.springframework.didemo.controllers.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingsServiceImpl());
    }

    @Test
    public void testGreetingSetterInjection() throws Exception {
        assertEquals(GreetingsServiceImpl.HELLO_ENGINEERS, setterInjectedController.sayHello());
    }
}