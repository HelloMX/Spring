package note_5.definition;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/7.
 */
public class Main {
    public static void main(String[] args) {
//        sayHelloWorldByClass();  //全局唯一
//
//        sayHelloWorldById();
//        sayHelloWorldByName();
//
//        sayHelloWorldByNameAndId();
//        sayHelloWorldByMultiName();
        sayHelloWorldByAlias();

    }

    public static void sayHelloWorldByClass(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld helloWorld=beanFactory.getBean(HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldById(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloWorld",HelloWorld.class);
        helloWorld.sayHello();
    }


    public static void sayHelloWorldByName(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld helloWorld=beanFactory.getBean("helloWorldByName",HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldByNameAndId(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld helloWorld1=beanFactory.getBean("helloWorldByNameAndId",HelloWorld.class);
        HelloWorld helloWorld2=beanFactory.getBean("helloWorldByIdAndName",HelloWorld.class);
        helloWorld1.sayHello();
        helloWorld2.sayHello();
    }

    public static void sayHelloWorldByMultiName(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld bean1=beanFactory.getBean("bean1",HelloWorld.class);
        HelloWorld bean11=beanFactory.getBean("alias11",HelloWorld.class);
        HelloWorld bean12=beanFactory.getBean("alias12",HelloWorld.class);
        HelloWorld bean13=beanFactory.getBean("alias13",HelloWorld.class);
        HelloWorld bean2=beanFactory.getBean("bean2",HelloWorld.class);
        HelloWorld bean21=beanFactory.getBean("alias21",HelloWorld.class);
        HelloWorld bean22=beanFactory.getBean("alias22",HelloWorld.class);
        HelloWorld bean23=beanFactory.getBean("alias23",HelloWorld.class);
        bean1.sayHello();
        bean11.sayHello();
        bean12.sayHello();
        bean13.sayHello();
        bean2.sayHello();
        bean21.sayHello();
        bean22.sayHello();
        bean23.sayHello();
    }

    public static void sayHelloWorldByAlias(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_5/conf/conf_definition.xml");
        HelloWorld bean3=beanFactory.getBean("bean3",HelloWorld.class);
        HelloWorld bean31=beanFactory.getBean("alias31",HelloWorld.class);
        HelloWorld bean32=beanFactory.getBean("alias32",HelloWorld.class);
        bean3.sayHello();
        bean31.sayHello();
        bean32.sayHello();
    }
}
