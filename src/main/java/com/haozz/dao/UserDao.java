package com.haozz.dao;

import com.haozz.bean.User;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/11/29 11:15 haozz Exp $
 */
public interface UserDao {

    User selectUser(long userId);
}
