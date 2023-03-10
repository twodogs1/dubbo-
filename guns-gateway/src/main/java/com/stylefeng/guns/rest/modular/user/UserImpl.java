package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

/**
 * 用户接口实现类
 *
 * @author JiangZhou
 * @date 2023/2/24 21:50
 */
@Component
@Service(interfaceClass = UserAPI.class)
public class UserImpl implements UserAPI{
    @Override
    public boolean login(String username, String password) {
        return true;
    }
}
