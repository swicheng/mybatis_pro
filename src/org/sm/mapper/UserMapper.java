package org.sm.mapper;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.sm.entity.User;


public interface UserMapper {

	User selectUserById(Integer id);

	@Results({
		@Result(id = true , column = "id" , property = "id")
	})
	@Select("select * from tb_user where id = #{id}")
	User selectUserWithId(Integer id);
	
   	Boolean insertUser(User user);
}
