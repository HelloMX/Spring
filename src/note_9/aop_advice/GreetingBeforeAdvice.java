package note_9.aop_advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by 马昕 on 2018/10/17.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName=(String )args[0];
        System.out.println("How are you "+clientName+"?");
    }
}
