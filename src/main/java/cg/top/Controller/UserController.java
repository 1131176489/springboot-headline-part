package cg.top.Controller;

import cg.top.pojo.User;
import cg.top.service.UserService;
import cg.top.service.impl.UserServiceImpl;
import cg.top.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("login")
    public Result login(@RequestBody User user) {
        Result result = userService.login(user);

        return result;
    }
}
