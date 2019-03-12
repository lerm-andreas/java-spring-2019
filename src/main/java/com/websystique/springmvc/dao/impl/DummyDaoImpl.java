package com.websystique.springmvc.dao.impl;

import com.websystique.springmvc.dao.DummyDao;
import com.websystique.springmvc.model.DummyModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.orm.hibernate4.HibernateTransactionManager;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DummyDaoImpl implements DummyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<DummyModel> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("FROM DummyModel").list();
    }
}
