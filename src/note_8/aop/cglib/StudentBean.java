package note_8.aop.cglib;



/**
 * Created by 马昕 on 2018/10/15.
 */
public class StudentBean  {
    private String name;
    public StudentBean(){ }

    public StudentBean(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Hello World!");
    }
}
