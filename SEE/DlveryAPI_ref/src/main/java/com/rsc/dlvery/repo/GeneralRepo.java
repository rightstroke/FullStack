package com.rsc.dlvery.repo;

import java.util.Iterator;
import java.util.List;

import com.rsc.dlvery.entity.Customer;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralRepo {

    @Autowired
    private SessionFactory factory;

    public void save(Object o) {
        Session session = factory.getCurrentSession();
        // session.save(o);
        session.saveOrUpdate(o);
    }

    public List<Customer> getCustomers() {
        Session session = factory.getCurrentSession();
        Criteria c = session.createCriteria(Customer.class);
        // c.setFirstResult(10);
        // c.setMaxResults(20);
        List<Customer> list = c.list();

        return list;
    }

    public List<Object[]> getCustomersByID(int id) {
        Session session = factory.getCurrentSession();
        Criteria c = session.createCriteria(Customer.class);
        // c.setFirstResult(10);
        // c.setMaxResults(20);

        Projection proj1 = Projections.property("custid");
        Projection proj2 = Projections.property("fname");
        Projection proj3 = Projections.property("lname");

        ProjectionList pList = Projections.projectionList();
        pList.add(proj1);
        pList.add(proj2);
        pList.add(proj3);
        // c.setProjection(Projections.property("custid"));
        // c.setProjection(Projections.property("fname"));
        // c.setProjection(Projections.property("lname"));

        c.setProjection(pList);
        c.add(Restrictions.gt("custid", id));
        c.addOrder(Order.asc("custid"));
        List<Object[]> list = c.list();

        

        return list;
    }
}