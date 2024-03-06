package presentation;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImpl2;
import metier.IMetier;
import metier.IMetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class pre2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();
        //System.out.println(dao.getData());


       String metierClassName = scanner.nextLine();
       Class cMetier=Class.forName(metierClassName);
       IMetier metier=(IMetier) cMetier.newInstance();


       Method method=cMetier.getMethod("setDao",IDao.class);
       //metier.setDao(dao);
       method.invoke(metier,dao);
       System.out.println("result "+metier.calcul());



}

}
