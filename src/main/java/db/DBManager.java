package db;

import models.Administrator;
import models.Employee;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    private static Session session;
    private static Transaction transaction;

    public static List<Administrator> employeesUnderManager (Manager manager){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Administrator>result = null;
        try {
            Criteria cr = session.createCriteria(Administrator.class);
            cr.add(Restrictions.eq("manager", manager));
            result = cr.list();}
        catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }return result;
    }
}
