package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier{
    @Autowired
    IDao dao;
    @Override
    public double calcul() {
        return Math.random()*10;
    }

    public IDao getDao() {
        return dao;
    }

    public void setdao(IDao dao) {
        this.dao = dao;
    }
}
