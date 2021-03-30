package com.rsc.dlvery.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralRepo {
    
    @Autowired
    private SessionFactory factory;
    
    public void save(Object o) {
        Session session = factory.getCurrentSession();
        //session.save(o);
        session.saveOrUpdate(o);
    }
}