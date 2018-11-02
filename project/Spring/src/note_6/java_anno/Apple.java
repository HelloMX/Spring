package note_6.java_anno;

import note_6.MyAnno;

import java.lang.annotation.*;

/**
 * Created by 马昕 on 2018/10/13.
 */



public class Apple {

    @MyAnno.FruitName(value = "Apple")
    private String appleName;

    public String getAppleName() {
        return appleName;
    }
}
