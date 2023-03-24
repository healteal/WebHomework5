import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.speak();
        cat.eat();
        Cow cow = (Cow) applicationContext.getBean("cow");
        cow.speak();
        cow.eat();
        Dog dog = (Dog) applicationContext.getBean("dog");
        dog.speak();
        dog.eat();
    }
}
