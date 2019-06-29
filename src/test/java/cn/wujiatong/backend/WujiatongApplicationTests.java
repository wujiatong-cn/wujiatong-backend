package cn.wujiatong.backend;

import cn.wujiatong.backend.auth.entity.User;
import cn.wujiatong.backend.auth.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WujiatongApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUserInfo(){
        Optional<User> user = userMapper.getUserWithAuthByLogin("asg");
        User userfirst = userMapper.selectById(1);
        System.out.print(user.toString());
    }

}
