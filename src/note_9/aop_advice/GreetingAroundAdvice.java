package note_9.aop_advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by 马昕 on 2018/10/17.
 */


public class GreetingAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args=invocation.getArguments();
        String clientName=(String)args[0];
        System.out.println("Interceptor Around: How are are "+clientName);
        Object obj=invocation.proceed();
        System.out.println("Interceptor Around: Please enjoy you self");
        return null;
    }
}
