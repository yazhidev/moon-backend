package cn.yazhidev.moon.controller;

import cn.yazhidev.moon.entity.User;
import cn.yazhidev.moon.mapper.TestMapper;
import cn.yazhidev.moon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControler {

    @Autowired
    private TestMapper userMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int id) {
        return userMapper.getUserById(id);
    }

}
