package ro.teamnet.hello;
import org.apache.log4j.Logger;

/**
 * Created by Adina Radu on 4/22/2015.
 */
public class HelloWorld {

    public void sayHello(){
        System.out.println("Hello World!");
        logger.debug("DEBUG -> Enters in sayHello() method from HelloWorld");
        logger.info("INFO -> Enters in returnHelloKey from HelloWorld");

    }

    public String returnHelloKey() {
        return "HelloKey";
    }

    static final Logger logger = Logger.getLogger(HelloWorld.class.getName());


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }


}
