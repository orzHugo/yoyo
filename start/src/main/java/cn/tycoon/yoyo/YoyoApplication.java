package cn.tycoon.yoyo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动入口
 *
 * @author Swallows
 * @date 2025-05-21 14:53
 */
@SpringBootApplication
public class YoyoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoyoApplication.class, args);
        System.out.println("启动成功！");
    }
}
