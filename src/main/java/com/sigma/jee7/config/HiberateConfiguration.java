package com.sigma.jee7.config;

import com.sigma.jee7.model.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HiberateConfiguration {
       private static SessionFactory factory;

   public static SessionFactory getSessionFactory() {
      if (factory == null) {
         try {
            // Properties
            Properties properties = new Properties();
            properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            properties.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
            properties.setProperty(Environment.USER, "root");
            properties.setProperty(Environment.PASS, "123");
            properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/abhijeet");

            // Hibernate Configurations
            Configuration hibernate = new Configuration();
            hibernate.setProperties(properties);
            
            // Add Models
            hibernate.addAnnotatedClass(User.class);
            
            // Build Session Dactory
            factory = hibernate.buildSessionFactory();
             
         } catch (Exception e) { return null; }
      }
      return factory;
   }
}
