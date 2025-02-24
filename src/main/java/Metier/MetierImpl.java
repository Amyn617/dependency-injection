package Metier;
import DAO.DaoImpl;
import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao = null;

    public MetierImpl() {

    }
    public MetierImpl(DaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return 0;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

}