import com.itlucky.staticProxy.demo01.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());




//        Monster monnster = context.getBean("monster", Monster.class);
//        Monster monnster2 = context.getBean("monster", Monster.class);
//
//        System.out.println(monnster.hashCode());
//        System.out.println(monnster2.hashCode());
//
//        System.out.println(monnster);
//        System.out.println(monnster2);
//
//        System.out.println(monnster == monnster2); //false 原型模式只是两个对象属性相同，但并不是同一个对象。


    }
}
