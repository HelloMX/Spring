package note_8.aop.proxy;



/**
 * Created by 马昕 on 2018/10/15.
 */
public class Main  {
    public static void main(String[] args) {
        testProxy();

    }

    private static void testProxy(){
        ProxyFactory factory=new ProxyFactory();

        StudentInterface s1=new StudentBean("Leon");
        StudentInterface s2=(StudentInterface)factory.createStudentProxy(s1);
        s2.print();

        StudentInterface s3=new StudentBean();
        StudentInterface s4=(StudentInterface)factory.createStudentProxy(s3);
        s4.print();
    }


}
