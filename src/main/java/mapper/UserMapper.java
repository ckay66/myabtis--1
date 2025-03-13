package mapper;



import org.example.sp.User;

import java.util.List;


public interface UserMapper {
    List<User> selectAll();
    List<User> selectUser_Role();
}