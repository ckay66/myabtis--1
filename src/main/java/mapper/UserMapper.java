package mapper;



import org.example.sp.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    int insertUser(User user);
    int insertUser1(User user);
    int insertUser2(User user);
}