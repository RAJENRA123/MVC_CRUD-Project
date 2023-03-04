package com.BikkadIT.SendingDataUitoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.SendingDataUitoController.Controller.model.User;

@Controller
public class UsserController {
@GetMapping("/loadForm")
	public String loadForm() {
	
		return "userReg";
		}
@GetMapping("/saveUser")
public String SaveUser( User user,Model model) {
	System.out.println(user);
	model.addAttribute("USER", user);
	
	return "userSuccess";
	
}
}
