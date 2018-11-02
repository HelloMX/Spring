package note_9.aop_advice;

import note_9.aop_advice.Waiter;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/17.
 */
public class TestAdviceByXML {
    public static void main(String[] args) {
        testThrowsAdvice();
    }

    private static void testAdvice(){
        String confPath="note_9/conf/conf-advice.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(confPath);
        Waiter waiter=(Waiter)context.getBean("waiter");
        waiter.greetTo("Ma");
        System.out.println("==========");
        waiter.serveTo("Xin");
    }

    private static void testThrowsAdvice(){
        String confPath="note_9/conf/conf-advice.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(confPath);
        ForumService forumService=(ForumService) context.getBean("forumService");
        try {
            forumService.removeForum();
        }catch (Exception e){

        }

        try {
            forumService.updateForum();
        }catch (Exception e){

        }
    }
}
