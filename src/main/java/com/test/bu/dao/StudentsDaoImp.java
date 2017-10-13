package com.test.bu.dao;

import com.test.bu.dao.interfaces.StudentsDao;
import com.test.bu.dao.interfaces.StudentsDao;
import com.test.bu.entity.Students;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentsDaoImp implements StudentsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Students students) {
        entityManager.persist(students);
    }

    @Override
    public Students getById(int id) {
        return entityManager.createQuery("SELECT g FROM Students g WHERE id=:id", Students.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void update(Students students) {
        entityManager.merge(students);
    }

    @Override
    public void delete(Students entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<Students> getAll() {
        return entityManager.createQuery("SELECT g FROM Students g", Students.class).getResultList();
    }
}
