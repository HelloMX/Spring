package note_8.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by 马昕 on 2018/10/15.
 */
@Aspect
public class StudentInterceptor {

    public void printMethod() {
    }

    public void printBeforeAdvice() {
        System.out.println("printBeforeAdvice()!");
    }

    public void printAfterAdvice(String flag) {
        System.out.println("printAfterAdvice()! " + flag);
    }

    public void finallyAdvice() {
        System.out.println("finallyAdvice()!");
    }

    public Object printAroundAdvice(ProceedingJoinPoint pjp, String name)
            throws Throwable {
        Object result = null;
        if (name.equals("this is name"))
            pjp.proceed();
        else
            System.out.println("print()方法以及被拦截...");
        return result;
    }
}
