package ext;

import DAO.IDao;

public class DaoImplV3 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version XML");
        double t = 11;
        return t;
    }
}
