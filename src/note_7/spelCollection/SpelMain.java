package note_7.spelCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马昕 on 2018/10/14.
 */
public class SpelMain {

    public static void main(String[] args) {
        testSpelList();
    }
    private static void testSpelList(){
        ApplicationContext context=new ClassPathXmlApplicationContext("note_7/conf/conf-spelCollection.xml");
        SpelCityList spelCityList=(SpelCityList) context.getBean("spelCityList");


        //在系统控制台中打印信息
        System.out.println("chosenCity1: " + spelCityList.getChosenCity1().getName());
        System.out.println("chosenCity2: " + spelCityList.getChosenCity1().getName());
        System.out.println("bigCities: " + spelCityList.getBigCities().size());
        System.out.println("aBigCity1: " + spelCityList.getaBigCity1().getName());
        System.out.println("aBigCity2: " + spelCityList.getaBigCity2().getName());
        System.out.println("cityNames1: " + spelCityList.getCityNames1().size());
        System.out.println("cityNames2: " + spelCityList.getCityNames1().size());
        System.out.println("cityNames3: " + spelCityList.getCityNames1().size());
    }
}
