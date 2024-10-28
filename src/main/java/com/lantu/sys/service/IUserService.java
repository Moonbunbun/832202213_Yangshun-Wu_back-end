package com.lantu.sys.service;

import com.lantu.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sheep
 * @since 2024-10-17
 */
public interface IUserService extends IService<User> {

    Map<String, Object> login(User user);


    Map<String, Object> getUserInfo(String token);

    void logout(String token);

}
