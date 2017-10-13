package com.test.bu.service;

import com.test.bu.dao.interfaces.SubjectsDao;
import com.test.bu.entity.Subjects;
import com.test.bu.service.interfaces.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SubjectsServiceImpl implements SubjectsService {

    @Autowired
    private SubjectsDao subjectsDao;

    @Override
    public Subjects getById(int id) {
        return subjectsDao.getById(id);
    }

    @Override
    public Collection <Subjects> getAll() {
        return subjectsDao.getAll();
    }

    @Override
    public void save(Subjects subjects) {
        subjectsDao.save(subjects);
    }

    @Override
    public void delete(int id) {
        subjectsDao.delete(subjectsDao.getById(id));
    }

    @Override
    public void update(Subjects subjects) {
        subjectsDao.update(subjects);
    }
}
