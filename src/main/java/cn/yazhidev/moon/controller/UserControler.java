package cn.yazhidev.moon.controller;

import cn.yazhidev.moon.bean.User22;
import cn.yazhidev.moon.entity.User;
import cn.yazhidev.moon.mapper.UserMapper;
import cn.yazhidev.moon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControler {

    @Autowired
    private UserService userMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id) {
        return userMapper.getUserById(id);
    }

    @RequestMapping(value = "/haha/{id}", method = RequestMethod.GET)
    public User22 get22(@PathVariable("id") int id) {
        User22 user = new User22(id, "haha");
        return user;
    }

}
