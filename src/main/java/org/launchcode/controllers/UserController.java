package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(){
        return "/user/add";
    }

   @PostMapping("/user")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if(Objects.equals(verify, user.getPassword())){
            System.out.println("Welcome " + user.getUsername());
        }
        return "/user/add";
    }
}
