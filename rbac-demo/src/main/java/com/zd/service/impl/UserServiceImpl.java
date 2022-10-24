package com.zd.service.impl;

import com.zd.mapper.UserMapper;
import com.zd.pojo.User;
import com.zd.service.UserService;
import com.zd.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserServiceImpl implements UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<User> selectAll() {
            //2. 获取SqlSession对象
            SqlSession sqlSession = factory.openSession();
            //3. 获取UserMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            //4. 调用方法
            List<User> users = mapper.selectAll();

            //5. 释放资源
            sqlSession.close();

            return users;
    }

    @Override
    public User selectUser(User user) {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //3. 获取UserMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //4. 调用方法
        User user1 = mapper.selectUser(user);

        //5. 释放资源
        sqlSession.close();

        return user1;
    }

}
