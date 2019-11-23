package com.haozz.service;

import com.haozz.bean.User;
import com.haozz.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/11/29 11:14 haozz Exp $
 */
@Service("userService")
public class UserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        List<User> userList = genUserList();
        List<Long> userIds = userList.stream().map(User::getId).collect(Collectors.toList());
        System.out.println(userIds.size());

        userIds.forEach(id ->{

        });

        testSupplier(new User(),()->genUserList());

        Collections.sort(userIds, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(userIds,(o1,o2) -> o1.compareTo(o2) );




        return this.userDao.selectUser(userId);
    }

    public void testSupplier(User u, Supplier<List> dbFunc){
        dbFunc.get();
    }

    public List<User> genUserList(){
        List<User> list = new ArrayList<User>();
        list.add(new User(3,"c","c"));
        list.add(new User(1,"a","a"));
        list.add(new User(5,"e","e"));
        return list;
    }


}
