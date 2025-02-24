package Metier;
import DAO.IDao;

public class MetierImpl implements IMetier {

    private IDao dao = null;
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