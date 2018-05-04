package zhijian.learn.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zhijian.learn.springboot.demo.repository.User;
import zhijian.learn.springboot.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserContorller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello/{userId}")
    @ResponseBody
    public String hello(@PathVariable String userId, @RequestParam(value="name", required = false) String name) {
		if(name != null) {
			userId = name;
		}
		String response = "hello " + userId;
        return response;
    }
	
	@RequestMapping("/adduser")
    @ResponseBody
    public User adduser(@RequestBody User userRequest) {
		userService.addUser(userRequest);
		userRequest.setId(userService.getLastInsertId());
        return userRequest;
    }
	
	@RequestMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);

    }
}
