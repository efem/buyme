package info.buyme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserActions {
	private static final Logger logger = LoggerFactory.getLogger(UserActions.class);
	
	@RequestMapping("/user/add")
	public ModelAndView addNerUser() {
		//TODO: akcja do wykonania przy dodawaniu nowego usera
		return new ModelAndView("newUserForm");
	}
	
	@RequestMapping("/user/del")
	public ModelAndView deleteUser() {
		//TODO: akcja do wykonania przy usuwaniu usera
		return new ModelAndView("deleteUserForm");
	}
}
