package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebConf {

    @Configuration
    @EnableWebMvc
    @ComponentScan(basePackages = {"com.boraji.tutorial.spring.controller"})
    public class WebConfig extends WebMvcConfigurerAdapter {

    }
}
