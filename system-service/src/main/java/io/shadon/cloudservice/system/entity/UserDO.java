package io.shadon.cloudservice.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.shadon.cloudservice.system.api.dto.UserInfoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息
 * @date 2021-5-16 06:46:46
 * @author https://github.com/shadon178
 */
@TableName("user_info")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserDO extends Model<UserDO> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String account;

    private String passwd;

    private String email;

    private String phoneNum;

    private Integer status;

    private LocalDateTime createDate;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public UserInfoDto toDto() {
        UserInfoDto dto = new UserInfoDto();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

}
