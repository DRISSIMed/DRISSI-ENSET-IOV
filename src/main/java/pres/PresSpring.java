package pres;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class PresSpring {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
        IMetier iMetier=context.getBean(IMetier.class);
        System.out.println("Result by Spring "+iMetier.calcul());

        IDao iDao=context.getBean(IDao.class);
        System.out.println("Result by Spring "+iDao.getDate());
    }
}
