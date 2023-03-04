package com.BikkadIT.SendingDataUitoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {
@GetMapping("/printValue/{a}")
	public String printValue(@PathVariable int a , Model model) {
		String msg="the value of a: "+a;
		System.out.println(a);
		model.addAttribute("MSG", msg);
	
	return "print";	
	}
@GetMapping("/addition/{a}/{b}")
public String addition(@PathVariable int a,@PathVariable int b ,Model model) {
	
	int c=a+b;
	String msg="The addition of a and b is: "+c;
	model.addAttribute("ADDITION", msg);
	
		
	return "add";
	
}
}
