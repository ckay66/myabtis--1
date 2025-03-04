package mapper;

import org.apache.catalina.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser();
    //根据id查找
    User selectUserById(int id);
    //根据id修改姓名
    int updateNameById(int id, String name);
    //根据User信息添加数据
    int insertUser(User user);
    //根据id数组删除数据
    int deleteByArray(int[] ids);
    //根据name模糊查询
    List<User> selectLikeName(String name);
}
