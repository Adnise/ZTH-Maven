package ro.teamnet.hello;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Adina Radu on 4/22/2015.
 */
public class HelloWorldTest {

    @Before
    public void init(){
        System.out.println("Before");
    }

    @After
    public void init2(){
        System.out.println("After");
    }

    @Test
     public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }

    @Test
    public void testReturnHelloKey(){
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("From Test: " + helloWorld.returnHelloKey());
        assert helloWorld.returnHelloKey().equals("HelloKey");
    }



}

