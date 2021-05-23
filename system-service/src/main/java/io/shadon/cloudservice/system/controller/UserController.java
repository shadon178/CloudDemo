package io.shadon.cloudservice.system.controller;

import io.shadon.cloudservice.system.entity.UserDO;
import io.shadon.cloudservice.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://github.com/shadon178
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "根据账号查询用户信息")
    @PostMapping("")
    @ResponseBody
    public void getOneByAccount(String account) {
        UserDO userDO = userService.getOneByAccount(account);

    }

}
