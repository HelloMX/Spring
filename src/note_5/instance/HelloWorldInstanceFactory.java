package note_5.instance;

/**
 * Created by 马昕 on 2018/10/9.
 */
public class HelloWorldInstanceFactory {
    public  HelloWorld newInstance(String message){
        return new HelloWorldImpl(message);
    }
}
