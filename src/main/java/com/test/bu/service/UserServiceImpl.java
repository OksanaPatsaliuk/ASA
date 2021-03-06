package com.test.bu.service;

import com.test.bu.dao2.UserDao2;
import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao2 userDao;

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);


    @Override
    public User getById(int id) {
        return userDao.findById(id);
    }

    @Override
    public User getByName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public Page<User> getAll(Integer page, Integer size, String order) {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, order));
        Pageable pageable = new PageRequest(page, size, sort);
        return userDao.findAll(pageable);
    }

    @Override
    public Collection<User> getAll() {
        List<User> result = new ArrayList<>();
        try {
            result = userDao.findAll();
        } catch (Exception e) {
            logger.error("Something wrong with findAll", e);
            result = Collections.EMPTY_LIST;
        }
        return result;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

}