package io.honeymon.springboot.jspsample.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class RootController {

	@RequestMapping("/")
	public String helloWorld() {
		return "hello";
	}

	// @RequestMapping("/2nd")
	// public String secondSubPage() {
	// return "test/list";
	// }

	@RequestMapping("/2nd")
	public String secondSubPage(Model model) {
		//ModelAndView mav = new ModelAndView("test/list");
		// List<UserForm> userForms = yourDatabaseCall();

		List<UserForm> userForms = new ArrayList<>();

		UserForm u1 = new UserForm("Name1", "Add1");
		UserForm u2 = new UserForm("Name1", "Add1");
		userForms.add(u1);
		userForms.add(u2);

		model.addAttribute("userForms", userForms);
		return "test/list";
	}
}
