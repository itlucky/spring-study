import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student)context.getBean("student");
//        System.out.println(student.getName());
//        System.out.println(student.getAddress());

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = context.getBean("student", Student.class);
//        System.out.println(student);
//
//        Student student2 = context.getBean("student2", Student.class);
//        System.out.println(student2);
//
//        Address addr2 = context.getBean("addr2", Address.class);
//        System.out.println(addr2);
//
//        Student stu = context.getBean("stu", Student.class);
//        System.out.println(stu);

//        Student stu2 = context.getBean("stu2", Student.class);
//        Student stu3 = context.getBean("stu2", Student.class);
//        System.out.println(stu2==stu3);

    }
}
