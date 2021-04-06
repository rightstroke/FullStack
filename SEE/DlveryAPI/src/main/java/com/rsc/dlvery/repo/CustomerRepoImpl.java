package com.rsc.dlvery.repo;

import java.util.List;


import com.rsc.dlvery.entity.Customer;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerRepoImpl extends BaseRepo {

    @Autowired
    private SessionFactory factory;

    public void save(Customer o) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(o);
    }

    public List<Customer> getAllCustomer(){
        Session session = factory.getCurrentSession();
        Criteria crit = session.createCriteria(Customer.class);
        List<Customer> lst = crit.list();

        return lst;
    }

    public List<Object[]> getCustomerById(int id) {
        Session session = factory.getCurrentSession();
        Criteria crit = session.createCriteria(Customer.class);

        Projection proj1 = Projections.property("custid");
        Projection proj2 = Projections.property("fname");
        Projection proj3 = Projections.property("email");

        ProjectionList pList = Projections.projectionList();
        pList.add(proj1);
        pList.add(proj2);
        pList.add(proj3);

        crit.add(Restrictions.eq("custid", id));
        crit.setProjection(pList);

        return  crit.list();
    }    

    /**
     * Ref - https://www.tutorialspoint.com/hibernate/hibernate_query_language.htm
     * @return
     */
    public List<Customer> getAllOldCustomer(){
        Session session = factory.getCurrentSession();

        Query qry = session.createQuery("from Customer");

        return qry.list();
    }
}
