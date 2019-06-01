package cn.yazhidev.moon.mapper;

import cn.yazhidev.moon.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    @Select("select from user where id=#{id}")
    String getUserById(int id);
}
