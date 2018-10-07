package note_3.HelloMessage;

/**
 * Created by 马昕 on 2018/10/5.
 */
public class Person {
    private IHelloMessage helloMessage;

    public IHelloMessage getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(IHelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }
    public String sayHello(){
        return this.helloMessage.sayHello();
    }
}
