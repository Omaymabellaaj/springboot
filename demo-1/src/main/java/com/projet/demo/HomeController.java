package com.projet.demo;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping("home")
  public String home() {
	  
	  System.out.println("hi");
      return "home";
}
}