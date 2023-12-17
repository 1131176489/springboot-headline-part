package cg.top.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cg.top.pojo.Type;
import cg.top.service.TypeService;
import cg.top.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 11311
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-12-17 17:23:56
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




