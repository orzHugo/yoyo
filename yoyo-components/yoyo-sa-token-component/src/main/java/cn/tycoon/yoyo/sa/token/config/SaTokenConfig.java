package cn.tycoon.yoyo.sa.token.config;

import cn.dev33.satoken.jwt.StpLogicJwtForSimple;
import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpLogic;
import cn.tycoon.yoyo.sa.token.loginType.StpCustomerUtil;
import cn.tycoon.yoyo.sa.token.service.StpInterfaceImpl;
import jakarta.annotation.PostConstruct;
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

    /**
     * 为 StpCustomerUtil 注入 StpLogicJwt 实现
     */
    @PostConstruct
    public void SetCustomerStpLogic() {
        StpCustomerUtil.setStpLogic(new StpLogicJwtForSimple(StpCustomerUtil.TYPE));
    }

    /**
     * 权限接口实现(使用bean注入方便用户替换)
     */
    @Bean
    public StpInterface getStpInterface() {
        return new StpInterfaceImpl();
    }
}
