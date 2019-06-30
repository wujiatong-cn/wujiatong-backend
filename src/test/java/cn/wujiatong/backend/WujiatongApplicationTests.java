package cn.wujiatong.backend;

import cn.wujiatong.backend.auth.entity.User;
import cn.wujiatong.backend.auth.mapper.UserMapper;
import cn.wujiatong.backend.config.FastBootProperties;
import cn.wujiatong.backend.utils.IdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WujiatongApplicationTests {
    private final Logger log = LoggerFactory.getLogger(WujiatongApplicationTests.class);

    @Resource
    private UserMapper userMapper;

    @Resource
    private FastBootProperties properties;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUserInfo(){
        Optional<User> user = userMapper.getUserWithAuthByLogin("asg");
        User userfirst = userMapper.selectById(1);
        System.out.print(user.toString());
    }

    @Test
    public void getGenerateId(){
        IdGenerator snowFlake = new IdGenerator(properties);
        for (int i = 0; i < 10; i++) {
            log.info(String.valueOf(snowFlake.nextId()));
        }
    }

}
