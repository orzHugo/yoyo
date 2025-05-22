package cn.tycoon.yoyo.sa.token.config;

import cn.dev33.satoken.jwt.StpLogicJwtForSimple;
import cn.dev33.satoken.stp.StpLogic;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Sa-Token配置
 *
 * @author Swallows
 * @date 2025-05-22 10:10
 */
@AutoConfiguration
public class SaTokenConfig {

    /**
     * 主用户体系JWT 配置 整合 jwt (Simple 简单模式)
     */
    @Bean
    public StpLogic getStpLogicJwt() {
        return new StpLogicJwtForSimple();
    }
}
