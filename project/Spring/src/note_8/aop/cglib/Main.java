package note_8.aop.cglib;

/**
 * Created by 马昕 on 2018/10/15.
 */
public class Main {
    public static void main(String[] args) {
        testCGLib();

    }



    private static void testCGLib(){

        StudentBean stu1 = (StudentBean) (new CGLibProxyFactory()
                .createStudent(new StudentBean()));
        StudentBean stu2 = (StudentBean) (new CGLibProxyFactory()
                .createStudent(new StudentBean("aa")));
        stu1.print();
        stu2.print();

    }
}
