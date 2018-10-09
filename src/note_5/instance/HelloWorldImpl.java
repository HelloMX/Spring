package note_5.instance;

/**
 * Created by 马昕 on 2018/10/7.
 */
public class HelloWorldImpl implements HelloWorld {
    private String message;

    public HelloWorldImpl(){
        message="Hello World";
    }
    public HelloWorldImpl(String message){
        this.message=message;
    }
    @Override
    public void sayHello() {
        System.out.println(message);
    }
}
