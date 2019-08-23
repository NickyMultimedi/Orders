package be.multimedi.orders.helloworld;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    private HelloWorld hello;

    HelloWorldTest() {
        System.out.println("constructor");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
        hello = new HelloWorld();
    }

    @Test
    public void sayHello() {
        String answer = hello.sayHello();
        assertEquals("Hello World", answer);
    }

    @Test
    @Disabled("Because we can")
    public void sayHelloWithName() {
        String answer = hello.sayHello("Nick");
        assertEquals("Hello Nick", answer);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}