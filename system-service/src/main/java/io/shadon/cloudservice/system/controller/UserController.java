package io.shadon.cloudservice.system.controller;

import io.shadon.cloudservice.common.service.api.response.CommonResponse;
import io.shadon.cloudservice.system.api.dto.UserInfoDto;
import io.shadon.cloudservice.system.entity.UserDO;
import io.shadon.cloudservice.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static io.shadon.cloudservice.system.api.constant.UserServiceUrlConstant.GET_ONE_BY_ACCOUNT;

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
    @GetMapping(GET_ONE_BY_ACCOUNT)
    @ResponseBody
    public CommonResponse<UserInfoDto> getOneByAccount(
            @ApiParam(name = "account", value = "用户账号", readOnly = true)
            @PathVariable("account") String account) {
        UserDO userDO = userService.getOneByAccount(account);
        UserInfoDto userInfoDto = userDO.toDto();
        return CommonResponse.<UserInfoDto>builder()
                .data(userInfoDto)
                .build();
    }

}
