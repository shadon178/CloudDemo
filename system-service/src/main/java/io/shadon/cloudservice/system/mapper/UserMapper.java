package io.shadon.cloudservice.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.shadon.cloudservice.system.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author https://github.com/shadon178
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    @Select("select * from user_info where account = #{account}")
    UserDO getOneByAccount(@Param("account") String account);

}
