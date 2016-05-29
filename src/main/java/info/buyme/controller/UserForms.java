package info.buyme.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserForms {
	private static final Logger logger = LoggerFactory.getLogger(UserForms.class);

	@RequestMapping("/new")
	public ModelAndView showNewUserForm() {
		return new ModelAndView("newUserForm");
	}
	
	@RequestMapping(value = "/jason", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<String> showJason() {
		logger.debug("INSIDE /JASON");
		final List<String> list = new ArrayList<>();
        list.add("1");
        list.add("Start");
        return list;
		//return new String("jabba");
	}
	

}
