package HelloMessage;

/**
 * Created by 马昕 on 2018/10/5.
 */
public class HelloWorld implements IHelloMessage {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
