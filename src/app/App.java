/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Calendar;
import model.Alumno;
import model.Nombre;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sandra
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
        
        // CREAMOS UN OBJETO
        Alumno alumno=new Alumno(10, "Pepe", 20, true, Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(),"Hola");
        //Profesor profesor=new Profesor("Eduardo", "Grau", "Aroca");
        Profesor profesor=new Profesor(new Nombre("Antonio", "Martinez", "Aroca"));
        
        //CREAR UNA SESION
        Session session=factory.openSession();
        session.beginTransaction();
        
        //GUARDAR OBJETO
        //session.save(alumno);
        session.save(profesor);
        
        //session.saveOrUpdate(profesor);
        
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();
        
        
    }
    
}