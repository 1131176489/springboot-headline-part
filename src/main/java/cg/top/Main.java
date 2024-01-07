package cg.top;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cg.top.mapper")

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //配置mybatis-plus插件


}