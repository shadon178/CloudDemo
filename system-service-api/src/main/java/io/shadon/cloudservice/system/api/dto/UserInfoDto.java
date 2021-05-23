package io.shadon.cloudservice.system.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author https://github.com/shadon178
 */
@Data
public class UserInfoDto {

    private Long id;

    private String name;

    private String account;

    private String passwd;

    private String email;

    private String phoneNum;

    private Integer status;

    private LocalDateTime createDate;

}
