package note_7.spelOpRange;

import note_7.spel.AnnotationExpression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/14.
 */
public class SpelMain {
    public static void main(String[] args) {
        testSpelClass();
    }

    private static void  testSpelLiteral(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("note_7/conf/conf-spelOpRange.xml");
        SpelLiteral spelLiteral=ctx.getBean("spelLiteral1",SpelLiteral.class);
        System.out.println(spelLiteral.getCount());
        System.out.println(spelLiteral.getMessage());
        System.out.println(spelLiteral.getFrequency());
        System.out.println(spelLiteral.getName1());
        System.out.println(spelLiteral.getName2());
        System.out.println(spelLiteral.isEnable());

    }
    private static void  testSpelClass(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("note_7/conf/conf-spelOpRange.xml");
        SpelClass spelClass=ctx.getBean("spelClass",SpelClass.class);
        System.out.println(spelClass.getPi());
        System.out.println(spelClass.getRandomNumber());

    }
}
