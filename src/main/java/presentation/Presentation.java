package presentation;

import dao.DaoImpl;
import metier.IMetierImpl;
/*instanciation statique*/
public class Presentation {
    public static void main(String[] args){
        /* DaoImpl2 dao=new DaoImpl2();
    IMetierImpl metier=new IMetierImpl();
    metier.setDao(dao);
    System.out.println(metier.calcul());*/
        DaoImpl dao=new DaoImpl();
        IMetierImpl metier=new IMetierImpl(dao);
        metier.setDao(dao);
        System.out.println(metier.calcul());

    }
}
