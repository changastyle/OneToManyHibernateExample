
package DAOS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AbstractDAO
{
    private static SessionFactory sessionFactory;
    
    
    public static void insertar(Object objecto)
    {
        sessionFactory = HibernateUtil.NewHibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        
        try
        {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            
            session.save(objecto);
            
            transaction.commit();
            session.close();
        }
        catch(Exception e)
        {
            transaction.rollback();
            session.close();
            e.printStackTrace();
        }
        
    }
}
