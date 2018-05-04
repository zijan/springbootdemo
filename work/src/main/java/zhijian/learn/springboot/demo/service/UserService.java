package zhijian.learn.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhijian.learn.springboot.demo.repository.User;
import zhijian.learn.springboot.demo.repository.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		userDao.addUser(user);
	};
    public void deleteUserById(int id) {
    	userDao.deleteUserById(id);
    };
    public void updateUser(User user) {
    	userDao.updateUser(user);
    };
    
    public User getUserById(int id) {
    	return userDao.getUserById(id);
    };
    
    public int getLastInsertId() {
    	return userDao.getLastInsertId();
    };
}
