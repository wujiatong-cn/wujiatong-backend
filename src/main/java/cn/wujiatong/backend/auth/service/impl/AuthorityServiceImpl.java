package cn.wujiatong.backend.auth.service.impl;

import cn.wujiatong.backend.auth.entity.Authority;
import cn.wujiatong.backend.auth.mapper.AuthorityMapper;
import cn.wujiatong.backend.auth.service.IAuthorityService;
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
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority> implements IAuthorityService {

}
