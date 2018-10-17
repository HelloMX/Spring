package note_9.aop_advice;

/**
 * Created by 马昕 on 2018/10/17.
 */
public class NativeWaiter implements Waiter{

    @Override
    public void greetTo(String name) {
        System.out.println("greet to "+name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("server to "+name);
    }
}
