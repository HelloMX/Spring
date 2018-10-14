package note_7.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/14.
 */
public class XmlExpression {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("note_7/conf/conf-spel.xml");
        String hello1=ctx.getBean("hello1",String.class);
        String hello2=ctx.getBean("hello2",String.class);
        String hello3=ctx.getBean("hello3",String.class);
        System.out.println(hello1);
        System.out.println(hello2);
        System.out.println(hello3);

    }
}
