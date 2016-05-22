package info.buyme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserForms {
	private static final Logger logger = LoggerFactory.getLogger(UserForms.class);

	@RequestMapping("/new")
	public ModelAndView showNewUserForm() {
		return new ModelAndView("newUserForm");
	}
	

}
