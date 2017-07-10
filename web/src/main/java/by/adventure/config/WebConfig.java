package by.adventure.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"by.adventure.controller"})
@EnableWebMvc
@Import(value = {LocalizationConfig.class, ThymeleafConfig.class})
public class WebConfig{


}
