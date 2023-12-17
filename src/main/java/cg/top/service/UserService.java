package cg.top.service;

import cg.top.pojo.User;
import cg.top.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 11311
 * @description 针对表【news_user】的数据库操作Service
 * @createDate 2023-12-17 17:23:56
 */

public interface UserService extends IService<User> {

    Result login(User user);

}
