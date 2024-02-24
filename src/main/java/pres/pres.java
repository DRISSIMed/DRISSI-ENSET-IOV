package pres;

import dao.DaoImp;
import metier.MetierImp;

public class pres {
    public static void main(String[] args) {
        MetierImp metierImp=new MetierImp();
        DaoImp daoImp=new DaoImp();
        metierImp.setdao(daoImp);
        System.out.println("Resultat calcul ="+ metierImp.calcul());
    }

}
