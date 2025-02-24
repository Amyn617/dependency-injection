package Presentation;

import java.io.File;
import java.util.Scanner;
import java.lang.reflect.Method;
import DAO.IDao;
import Metier.IMetier;


public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();

            Method method = cMetier.getMethod("setDao", IDao.class);
            method.invoke(metier, dao);

            System.out.println(metier.calcul());
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
