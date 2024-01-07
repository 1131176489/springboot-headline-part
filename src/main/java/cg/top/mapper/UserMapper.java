package cg.top.mapper;

import cg.top.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 11311
 * @description 针对表【news_user】的数据库操作Mapper
 * @createDate 2023-12-17 17:23:56
 * @Entity cg.top.pojo.User
 */
@Mapper
public interface UserMapper {
    User selectOneByUsername(String username);
}




