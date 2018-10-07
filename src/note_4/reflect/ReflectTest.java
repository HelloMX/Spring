package note_4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by 马昕 on 2018/10/6.
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable{
        //通过类装载器获取Car类对象
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        Class clazz=loader.loadClass("note_4.reflect.Car");
        //获取默认构造器并实例化Car
        Constructor constructor=clazz.getDeclaredConstructor((Class[])null);
        Car car=(Car) constructor.newInstance();

        //通过反射方法设置属性
        Method setBrand=clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"奔驰");
        Method setColor=clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"black");
        Method setMaxSpeed=clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);
        return car;
    }

    public static Car initByParamConst() throws Throwable{
        //通过类装载器获取Car类对象
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        Class clazz=loader.loadClass("note_4.reflect.Car");
        //获取类的带参构造器对象
        Constructor constructor=clazz.getDeclaredConstructor(new Class[]{String.class,String.class,int.class});
        //使参数构造器对象实例化Car
        Car car=(Car)constructor.newInstance(new Object[]{"BWM","red",190});
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car1=initByDefaultConst();
        Car car2=initByParamConst();
        car1.introduce();
        car2.introduce();
    }
}
