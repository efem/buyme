package info.buyme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowForm {

	private static final Logger logger = LoggerFactory.getLogger(ShowForm.class);

	@RequestMapping("/show")
	@ResponseBody
	public String pokaz() {
		System.out.println("in SHOW");
		logger.debug("START");
		return "start";
	}

	@RequestMapping("/hello")
	public ModelAndView test() {
		String message = "Welcome to Spring 4.0 !";
		return new ModelAndView("start", "message", message);
	}
}
