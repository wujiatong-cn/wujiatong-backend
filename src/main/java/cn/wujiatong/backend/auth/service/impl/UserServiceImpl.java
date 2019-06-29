package cn.wujiatong.backend.auth.service.impl;

import cn.wujiatong.backend.auth.entity.User;
import cn.wujiatong.backend.auth.mapper.UserMapper;
import cn.wujiatong.backend.auth.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fastboot
 * @since 2019-05-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
