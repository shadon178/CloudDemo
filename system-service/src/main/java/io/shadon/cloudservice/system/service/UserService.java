package io.shadon.cloudservice.system.service;

import io.shadon.cloudservice.system.entity.UserDO;

/**
 * @author https://github.com/shadon178
 */
public interface UserService {

    /**
     * 根据账号获取用户信息
     * @return account 账号
     */
    UserDO getOneByAccount(String account);

}
