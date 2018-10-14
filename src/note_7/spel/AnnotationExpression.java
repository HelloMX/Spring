package note_7.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/14.
 */
public class AnnotationExpression {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("note_7/conf/conf-spel.xml");
        AnnotationExpression helloBean1=ctx.getBean("helloBean1",AnnotationExpression.class);
        AnnotationExpression helloBean2=ctx.getBean("helloBean2",AnnotationExpression.class);
        System.out.println(helloBean1.getValue());
        System.out.println(helloBean2.getValue());

    }

    @Value("#{'Hello'+world}")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
