package com.mounirboulwafa.springmvctpxbankapp.web;

import com.mounirboulwafa.springmvctpxbankapp.SpringMvcTPxBankAppApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class WebInitiatizer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(SpringMvcTPxBankAppApplication.class);
    }
}
