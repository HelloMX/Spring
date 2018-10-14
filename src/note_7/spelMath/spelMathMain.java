package note_7.spelMath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/14.
 */
public class spelMathMain {
    public static void main(String[] args) {
        testSpelMath();
    }

    private static void  testSpelMath(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("note_7/conf/conf-spelMath.xml");
        SpelMath spelMath=ctx.getBean("spelMath",SpelMath.class);

        System.out.println(spelMath.getAdjustedAmount());
        System.out.println(spelMath.getCircumference());
        System.out.println(spelMath.getAverage());
        System.out.println(spelMath.getRemainder());
        System.out.println(spelMath.getArea());
        System.out.println(spelMath.getFullName());
    }
}
