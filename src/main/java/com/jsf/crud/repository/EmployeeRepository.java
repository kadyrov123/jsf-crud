package com.jsf.crud.repository;

import com.jsf.crud.conf.HibernateUtil;
import com.jsf.crud.model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepository {
    private Transaction transaction;
    public List<Employee> getAllEmployeesByOrganizationId(int orgId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee where orgId = "+orgId, Employee.class).list();
        }
    }

    public List<Employee> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }

    public void save(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    public void update(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    public void delete(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}
