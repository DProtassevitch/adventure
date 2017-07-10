package by.adventure.controller;

import by.adventure.entity.User;
import by.adventure.entity.other.ValidationMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

@RestController
public class ValidationController {

    @PostMapping("/signin")
    @ResponseBody
    public ValidationMessage login(@RequestBody User user){
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
