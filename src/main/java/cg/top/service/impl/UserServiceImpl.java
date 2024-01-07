package cg.top.service.impl;

import cg.top.mapper.UserMapper;
import cg.top.pojo.User;
import cg.top.service.UserService;
import cg.top.utils.JwtHelper;
import cg.top.utils.MD5Util;
import cg.top.utils.Result;
import cg.top.utils.ResultCodeEnum;
import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 11311
 * @description 针对表【news_user】的数据库操作Service实现
 * @createDate 2023-12-17 17:23:56
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JwtHelper jwtHelper;

    @Override
    public Result login(User user) {
        for (int i = 0; i < UserMapper.class.getMethods().length; i++) {
            System.out.println(UserMapper.class.getMethods()[i]);
        }
        System.out.println(userMapper);
        User loginUser = userMapper.selectOneByUsername(user.getUsername());
        System.out.println(loginUser);
        if (loginUser == null) {
            return Result.build(null, ResultCodeEnum.USERNAME_ERROR);
        }
        if (!StringUtils.isEmpty(user.getUserPwd()) && MD5Util.encrypt(user.getUserPwd()).equals(loginUser.getUserPwd())) {
            String token = jwtHelper.createToken(Long.valueOf(loginUser.getUid()));
            Map<String, String> data = new HashMap<>();
            data.put("token", token);
            return Result.ok(data);
        }
        return Result.build(null, ResultCodeEnum.PASSWORD_ERROR);
    }

    @Override
    public Result getUserInfo() {
        return null;
    }
}




