package note_6.java_anno;

import note_6.MyAnno;

import java.io.File;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 马昕 on 2018/10/13.
 */
public class Main {


    public static void main(String[] args) throws  NoSuchFieldException {
        Field[] field = Apple.class.getDeclaredFields();
        System.out.println(field[0].getAnnotation(MyAnno.FruitName.class));
    }
}
