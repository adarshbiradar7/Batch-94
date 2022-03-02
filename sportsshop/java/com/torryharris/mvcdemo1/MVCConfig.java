package com.torryharris.mvcdemo1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.torryharris.mvcdemo1"})
public class MVCConfig extends WebMvcConfigurerAdapter{

	
}
