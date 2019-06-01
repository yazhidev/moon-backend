package cn.yazhidev.moon.mapper;

import cn.yazhidev.moon.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User getUserById(int id);
}
