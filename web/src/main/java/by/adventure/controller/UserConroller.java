package by.adventure.controller;

import by.adventure.entity.User;
import by.adventure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserConroller {

    private final UserService userService;

    @Autowired
    public UserConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    public String startPage(){
        return "index";
    }

    @GetMapping(path = "/user")
    public String getUser(Model model){
        User user = userService.getByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("user", user);
        return "user";
    }
}
