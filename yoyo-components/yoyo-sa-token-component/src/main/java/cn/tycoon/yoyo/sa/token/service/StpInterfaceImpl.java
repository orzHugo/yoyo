package cn.tycoon.yoyo.sa.token.service;

import cn.dev33.satoken.stp.StpInterface;

import java.util.List;

/**
 * 动态获取权限和角色
 *
 * @author Swallows
 * @date 2025-05-22 15:23
 */
public class StpInterfaceImpl implements StpInterface {


    @Override
    public List<String> getPermissionList(Object o, String s) {
        return List.of();
    }

    @Override
    public List<String> getRoleList(Object o, String s) {
        return List.of();
    }
}
