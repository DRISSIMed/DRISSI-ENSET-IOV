package pres;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.AppletViewer;

import java.applet.AppletContext;

public class PresXml   {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println("Result by xml file "+metier.calcul());

        IDao iDao= (IDao) context.getBean("dao");
        System.out.println("Result by xml file "+iDao.getDate());


    }
}
