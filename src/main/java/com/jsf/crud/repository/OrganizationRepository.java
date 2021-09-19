package com.jsf.crud.repository;

import com.jsf.crud.conf.HibernateUtil;
import com.jsf.crud.model.Organization;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class OrganizationRepository {

    private Transaction transaction;
    public List<Organization> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Organization ", Organization.class).list();
        }
    }

    public void save(Organization organization) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            int id = (int) session.save(organization);
            System.out.println("saves iD => " +id);
            transaction.commit();
        }
    }

    public void update(Organization organization) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(organization);
            transaction.commit();
        }
    }

    public void delete(Organization organization) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(organization);
            transaction.commit();
        }
    }
}
