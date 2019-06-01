package cn.yazhidev.moon.service.impl;

import cn.yazhidev.moon.entity.User;
import cn.yazhidev.moon.mapper.TestMapper;
import cn.yazhidev.moon.mapper.UserMapper;
import cn.yazhidev.moon.service.TestService;
import cn.yazhidev.moon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper userMapper;

    public String getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
