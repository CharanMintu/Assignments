package springtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentacc {

    public static void main(String[] args) {
        // Create the Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the bean from the container
        MainStudent mp = (MainStudent) context.getBean("empbean");

        // Call the method on the bean
        mp.showdetails();
    }
}
