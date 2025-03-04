package mapper;

import org.apache.catalina.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser();
}
