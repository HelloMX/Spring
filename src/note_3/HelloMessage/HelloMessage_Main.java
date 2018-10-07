package note_3.HelloMessage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


/**
 * Created by 马昕 on 2018/10/5.
 */
public class HelloMessage_Main {
    public static void main(String[] args) {
        Resource r=  new FileSystemResource("src/note_3/HelloMessage/helloMessage.xml");
        BeanFactory f=new XmlBeanFactory(r);
        Person person=(Person)f.getBean("person");
        String s=person.sayHello();
        System.out.println(s);

    }
}
