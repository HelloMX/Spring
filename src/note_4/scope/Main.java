package note_4.scope;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/9.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("singleton");
        singleton();
        System.out.println("prototype");
        prototype();

    }

    public static void singleton(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_scope.xml");
        Boss boss1=beanFactory.getBean("boss1",Boss.class);
        Boss boss2=beanFactory.getBean("boss2",Boss.class);
        Boss boss3=beanFactory.getBean("boss3",Boss.class);
        System.out.println(boss1.getCar());
        System.out.println(boss2.getCar());
        System.out.println(boss3.getCar());

    }
    public static void prototype(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("note_4/conf/conf_scope.xml");
        Boss boss1=beanFactory.getBean("boss21",Boss.class);
        Boss boss2=beanFactory.getBean("boss22",Boss.class);
        Boss boss3=beanFactory.getBean("boss23",Boss.class);
        System.out.println(boss1.getCar());
        System.out.println(boss2.getCar());
        System.out.println(boss3.getCar());
    }
}

