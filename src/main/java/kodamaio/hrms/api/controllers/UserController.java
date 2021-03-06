package kodamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kodamaio.hrms.business.abstracts.UserService;
import kodamaio.hrms.core.utilities.results.DataResult;
import kodamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService=userService;
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
