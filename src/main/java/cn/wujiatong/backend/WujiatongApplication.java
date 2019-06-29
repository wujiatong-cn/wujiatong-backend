package cn.wujiatong.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@MapperScan({"cn.wujiatong.backend.auth.mapper","cn.wujiatong.backend.module.*.mapper"})
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class)
public class WujiatongApplication {

    public static void main(String[] args) {
        SpringApplication.run(WujiatongApplication.class, args);
    }

}
