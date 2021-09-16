package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    public String displayAddUserForm() {
        return "user/add";
    }
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
        User newUser = new User(user.getUsername(), user.getEmail(), user.getPassword());
        model.addAttribute("user" , newUser);
        model.addAttribute("password", verify);
        return "menu";
    }
}
