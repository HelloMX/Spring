package note_6;

import java.lang.annotation.*;

/**
 * Created by 马昕 on 2018/10/13.
 */
public class MyAnno {
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface FruitName {
        String value() default "a";
    }
}
