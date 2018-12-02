package co.wannacrypt.helloWorld.repositories;

import co.wannacrypt.helloWorld.model.Message;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MessageRepository {

    @Select("SELECT * FROM message WHERE id = #{id}")
    Message findById(long id);

    @Delete("DELETE FROM message WHERE id = #{id}")
    int deleteById(long id);

    @Insert("INSERT INTO message(id, message) VALUES(#{id}, #{message})")
    int insert(Message message);

    @Update("UPDATE message SET message = #{message} WHERE id = #{id}")
    int update(Message message);
}
