package note_5.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 马昕 on 2018/10/12.
 */
public class ConfigurationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        System.out.println(ctx.getBean("message"));

    }
}
