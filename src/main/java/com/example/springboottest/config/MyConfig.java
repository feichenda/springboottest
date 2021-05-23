package com.example.springboottest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author feizai
 * @date 2021/5/23 0023 上午 9:35:14
 * @annotation
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**/").addResourceLocations("classpath:/static/");
    }
}
