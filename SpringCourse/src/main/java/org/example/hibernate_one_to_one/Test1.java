package org.example.hibernate_one_to_one;

import org.example.hibernate_one_to_one.entity.Detail;
import org.example.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {


        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Max", "Ber", "IT", 1000);
//            Detail detail = new Detail("SPB", "1232144", "asasd@adsad.re");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");



//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 900);
//            Detail detail = new Detail("MSC", "123213244", "a235d@adsad.re");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            System.out.println(emp.getEmpDetail());


            session.getTransaction().commit();

            System.out.println("Done!");


        }
    }
}
