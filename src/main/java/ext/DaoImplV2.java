package ext;

import DAO.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double t = 11;
        return t;
    }
}
