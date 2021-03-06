package com.cuatro.cursoboot.controller;

import com.cuatro.cursoboot.constants.ViewConstant;
import com.cuatro.cursoboot.model.ContactModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
  private static final Log LOG = LogFactory.getLog(ContactController.class);


  @GetMapping("/cancel")
  private String cancel(){
    return ViewConstant.CONTACTS;
  }

  @GetMapping("/contact-form")
  private String redirectContactForm(Model model){
    model.addAttribute("contactModel",new ContactModel());
    return ViewConstant.CONTACT_FORM;
  }

  @PostMapping("/add-contact")
  private String addContact (@ModelAttribute(name="contactModel") ContactModel contactModel,
                             Model model){
    LOG.info("METHOD: addContact -- PARAMS contactModel: "+contactModel.toString());
    model.addAttribute("result",1);

    return ViewConstant.CONTACTS;
  }
}
