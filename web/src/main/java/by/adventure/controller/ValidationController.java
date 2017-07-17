package by.adventure.controller;

import by.adventure.entity.User;
import by.adventure.entity.other.ValidationMessage;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;
import javax.validation.Valid;

@Controller
public class ValidationController {


    @GetMapping("/signin")
    public String openLoginPage() {
        return "signin";
    }

    @PostMapping("/signin")
    @ResponseBody
    public ValidationMessage login(@Valid @RequestBody User user, Errors errors){
        System.out.println(user);
        if (StringUtils.isEmpty(user.getName())) {
            return new ValidationMessage("Username is Empty");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            return new ValidationMessage("Password is Empty");
        }
        return new ValidationMessage("Welcome");
    }
}
