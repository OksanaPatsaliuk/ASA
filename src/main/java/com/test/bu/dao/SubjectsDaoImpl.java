package com.test.bu.dao;

import com.test.bu.dao.interfaces.SubjectsDao;

import com.test.bu.entity.Subjects;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.auth.Subject;
import java.util.List;

@Repository
public class SubjectsDaoImpl implements SubjectsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional

    public void save(Subjects entity) {
        entityManager.persist(entity);
    }

    @Override
    public Subjects getById(int id) {
        return entityManager.createQuery("SELECT g FROM Subjects g WHERE id=:id", Subjects.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(Subjects entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Subjects entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<Subjects> getAll() {
        return entityManager.createQuery("SELECT p FROM Subjects p", Subjects.class).getResultList();
    }

}