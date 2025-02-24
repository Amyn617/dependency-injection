package DAO;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de données");
        double temp = 23;
        return temp;
    }
}
