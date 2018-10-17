package note_9.aop_advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by 马昕 on 2018/10/17.
 */
public class TestAdviceByCode {
    public static void main(String[] args) {
        Waiter waiter=new NativeWaiter();
        BeforeAdvice beforeAdvice=new GreetingBeforeAdvice();
        AfterAdvice afterAdvice=new GreetingAfterAdvice();
        GreetingAroundAdvice aroundAdvice=new GreetingAroundAdvice();
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);
        proxyFactory.addAdvice(afterAdvice);
        proxyFactory.addAdvice(aroundAdvice);
        Waiter proxy=(Waiter)proxyFactory.getProxy();
        proxy.greetTo("Ma");
        System.out.println("===================");
        proxy.serveTo("Xin");
    }
}
