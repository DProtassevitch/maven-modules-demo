package by.itacademy.service;

import by.itacademy.dao.UserDao;

/**
 * @author i.sukach
 */
public class UserService {

    public String getUser() {
        return new UserDao().getUser();
    }
}
