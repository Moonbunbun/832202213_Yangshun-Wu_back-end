package com.lantu.sys.mapper;

import com.lantu.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sheep
 * @since 2024-10-17
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getRoleNamesByUserId(Integer userId);
}
