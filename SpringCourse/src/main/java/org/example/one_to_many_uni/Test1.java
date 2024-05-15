package org.example.one_to_many_uni;


import org.example.one_to_many_uni.entity.Department;
import org.example.one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {


//        Session session = null;
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Department.class)
//                .buildSessionFactory()) {
//
//
//
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 300, 1200);
//
//            Employee emp1 = new Employee("Max", "Ber", 900);
//            Employee emp2 = new Employee("Mix", "Bar", 700);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//
//
//        }
//        finally {
//            session.close();
//        }

//        Session session = null;
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Department.class)
//                .buildSessionFactory()) {
//
//
//
//            session = factory.getCurrentSession();
//
//
//
//
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 9);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//
//        }
//        finally {
//            session.close();
//        }

//        Session session = null;
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Department.class)
//                .buildSessionFactory()) {
//
//
//
//            session = factory.getCurrentSession();
//
//
//
//
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 9);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//
//        }
//        finally {
//            session.close();
//        }

        Session session = null;
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {



            session = factory.getCurrentSession();





            session.beginTransaction();

           Department department = session.get(Department.class, 9);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");


        }
        finally {
            session.close();
        }

    }
}
