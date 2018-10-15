package note_8.aop.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 马昕 on 2018/10/15.
 */
public class CGLibProxyFactory implements MethodInterceptor {

    private Object object;

    public Object createStudent(Object object) {
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       StudentBean studentBean=(StudentBean) object;
       Object result=null;

       if(studentBean.getName()!=null){
           result=methodProxy.invoke(object,objects);
       }else {
           System.out.println("名称为空，被CGLib拦截");
       }
       return result;
    }
}
