package by.adventure.controller;

import by.adventure.entity.User;
import by.adventure.entity.other.ValidationMessage;
import by.adventure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

@Controller
public class SignInSugnUpController {
    private final UserService userService;

    @Autowired
    public SignInSugnUpController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public User user(){
        return new User();
    }

    @GetMapping(path = "/signin")
    public String getSignInPage(){
       return "signin";
    }

    @GetMapping(path = "/signup")
    public String getSignUpPage(){
        return "signup";
    }



    @PostMapping("/signup")
    public String saveUser(User user){
        userService.create(user);
        return "signup";
    }

}
