package note_4.instance;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/9.
 */
public class Main {
    public static void main(String[] args) {
        sayHelloWithNoArgs();
        sayHelloWithArgs();
        sayHelloStaticFactory();
        sayHelloInstanceFactory();
    }

    public static void sayHelloWithNoArgs(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_instance.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloServiceWithNoArgs",HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWithArgs(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_instance.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloServiceWithArgs",HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloStaticFactory(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_instance.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloServiceStaticFactory",HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloInstanceFactory(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_instance.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloWorldInstance",HelloWorld.class);
        helloWorld.sayHello();
    }

}
