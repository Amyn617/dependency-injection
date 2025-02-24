package Metier;
import DAO.DaoImpl;
import DAO.IDao;

public class MetierImp implements IMetier {

    private IDao dao;
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return 0;
    }
}