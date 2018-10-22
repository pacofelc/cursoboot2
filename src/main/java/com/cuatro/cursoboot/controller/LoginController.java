package com.cuatro.cursoboot.controller;

import com.cuatro.cursoboot.constants.ViewConstant;
import com.cuatro.cursoboot.model.UserCredential;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  private static final Log LOG = LogFactory.getLog(LoginController.class);

  @GetMapping("/")
  public String redirectToLogin() {
    LOG.info("METHOD: redirectToLogin");
    return "redirect:/login";
  }

  @GetMapping("/login")
  public String showLoginForm(Model model,
          @RequestParam(name = "error",  required = false) String error,
          @RequestParam(name = "logout", required = false) String logout
  ) {
    LOG.info("METHOD: showLoginForm -- PARAMS error " + error + "logout: " +logout);

    model.addAttribute("userCredentials",new UserCredential());
    model.addAttribute("error",error);
    model.addAttribute("logout",logout);
    return ViewConstant.LOGIN;
  }

  @PostMapping("login-check")
  public String LoginCheck(@ModelAttribute(name="userCredentials") UserCredential credentials) {
    LOG.info("METHOD: login-check -- PARAMS: "+credentials.toString());
    if (credentials.getUserName().equals("user") && credentials.getPassword().equals("user")) {
      //Página principal
      return ViewConstant.CONTACTS;
    } else {
      return ("redirect:/login?error");
    }
  }
}
