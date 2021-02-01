
package Main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Kristina
 */
public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
 
    public static SessionFactory createSessionFactory() {
            Configuration configuration = new Configuration();
            configuration.configure();
            
           serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            
           sessionFactory = configuration.buildSessionFactory(serviceRegistry);
           
    return sessionFactory;
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    /*public static void close(){
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }*/
}
