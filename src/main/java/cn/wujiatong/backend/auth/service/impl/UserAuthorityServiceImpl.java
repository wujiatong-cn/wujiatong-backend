package cn.wujiatong.backend.auth.service.impl;

import cn.wujiatong.backend.auth.entity.UserAuthority;
import cn.wujiatong.backend.auth.mapper.UserAuthorityMapper;
import cn.wujiatong.backend.auth.service.IUserAuthorityService;
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
public class UserAuthorityServiceImpl extends ServiceImpl<UserAuthorityMapper, UserAuthority> implements IUserAuthorityService {

}
