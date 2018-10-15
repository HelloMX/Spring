package note_8.aop.aspect;

/**
 * Created by 马昕 on 2018/10/15.
 */
public class Student {
    public String print(String name){
        System.out.println(name);
        return "Hello World";
    }
}
