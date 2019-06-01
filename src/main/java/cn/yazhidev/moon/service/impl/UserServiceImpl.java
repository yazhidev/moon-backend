package cn.yazhidev.moon.service.impl;

import cn.yazhidev.moon.entity.User;
import cn.yazhidev.moon.mapper.UserMapper;
import cn.yazhidev.moon.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Mapper
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
