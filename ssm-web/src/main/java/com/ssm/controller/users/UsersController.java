package com.ssm.controller.users;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.utils.BeanUtil;
import com.ssm.model.users.domain.UsersDO;
import com.ssm.model.users.dto.UsersDTO;
import com.ssm.service.users.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	 @RequestMapping("/insert")
	 public String insert(UsersDTO usersDTO) {
		 UsersDO usersDO = new UsersDO();
		 BeanUtil.coverBean2Bean(usersDTO, usersDO);
		 try {
			 //usersService.save(usersDO);
			//为了测试事物;
			 usersService.saveUsers(usersDO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 
		 return "/users/index";
	 }
	 
	 @RequestMapping("/list")
	 @ResponseBody
	 public List<UsersDO> list() {
		 try {
			 List<UsersDO> list =  usersService.select(null);
			 return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	 }
	

}
