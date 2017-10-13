package com.test.bu.service;

import com.test.bu.dao.interfaces.IDAO;
import com.test.bu.dao.interfaces.StudentsDao;
import com.test.bu.entity.Students;
import com.test.bu.entity.Students;
import com.test.bu.service.interfaces.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsDao studentsDao;

    @Override
    public Students getById(int id) {
        return studentsDao.getById(id);
    }

    @Override
    public Collection<Students> getAll() {
        return studentsDao.getAll();
    }

    @Override
    public void save(Students students) {
        studentsDao.save(students);
    }

    @Override
    public void delete(int id) {
        studentsDao.delete(studentsDao.getById(id));
    }

    @Override
    public void update(Students students) {
        studentsDao.delete(students);
    }

}
