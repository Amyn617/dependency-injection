package Presentation;

import DAO.DaoImpl;
import Metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("RES = " + metier.calcul());
     }
}
