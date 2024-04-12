package webdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping
public class CommonConrroller {

	public CommonConrroller() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView register(RegisterDto registerDto) {
		System.out.println(registerDto);
		return new ModelAndView("login", "responseMsg", "Registered Successfully");
	}
}
