package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /***** DAO  VERSION ****/
        System.out.println("instanciation Dynamique ");
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        /***** Metier VERSION  ****/
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method method = cMetier.getMethod("setdao",IDao.class);
        method.invoke(metier,dao);

        /***** RESULTS  ****/
        System.out.println("dao  "+dao.getDate());
        System.out.println("metier  "+metier.calcul());
    }
}
