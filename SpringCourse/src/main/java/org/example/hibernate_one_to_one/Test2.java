package org.example.hibernate_one_to_one;

import org.example.hibernate_one_to_one.entity.Detail;
import org.example.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {


//        Session session = null;
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory()) {
//
//
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Nikolay", "Ivanov", "IT", 950);
//            Detail detail = new Detail("London", "asdwa32423", "awed@aw.ry");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//
//        } finally {
//           session.close();
//        }


//        Session session = null;
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory()) {
//
//
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 2);
//            System.out.println(detail.getEmployee());
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//
//        } finally {
//            session.close();
//        }


        Session session = null;
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {


            session = factory.getCurrentSession();


            session.beginTransaction();
            Detail detail = session.get(Detail.class, 2);

            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            session.close();
        }
    }
}
