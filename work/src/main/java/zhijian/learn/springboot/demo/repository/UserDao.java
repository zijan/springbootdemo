package zhijian.learn.springboot.demo.repository;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
	public int getLastInsertId();
	public void addUser(User user);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public User getUserById(@Param("id") int id);
}
