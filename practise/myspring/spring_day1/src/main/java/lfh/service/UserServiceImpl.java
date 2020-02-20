package lfh.service;

import lfh.dao.UserDao;
import lfh.dao.UserDaoImpl;
import lfh.dao.UserDaoImpl2;

public class UserServiceImpl implements UserService {

    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
