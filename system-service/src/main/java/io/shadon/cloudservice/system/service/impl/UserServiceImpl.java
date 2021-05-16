package io.shadon.cloudservice.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.shadon.cloudservice.system.entity.UserDO;
import io.shadon.cloudservice.system.mapper.UserMapper;
import io.shadon.cloudservice.system.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author https://github.com/shadon178
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDO getOneByAccount(String account) {
        return userMapper.getOneByAccount(account);
    }
}
