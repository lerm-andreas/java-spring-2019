package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.dao.DummyDao;
import com.websystique.springmvc.model.DummyModel;
import com.websystique.springmvc.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DummyServiceImpl implements DummyService {
    @Autowired
    private DummyDao dummyDao;

    public List<DummyModel> findAll() {
        return dummyDao.getAll();
    }

}
