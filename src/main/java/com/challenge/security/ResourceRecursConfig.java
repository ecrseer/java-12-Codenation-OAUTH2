package com.challenge.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceRecursConfig extends ResourceServerConfigurerAdapter {


    @Override
    public  void configure(HttpSecurity httpSecurity) throws Exception{
        System.out.println("Chamou HttpSecurity");
        httpSecurity
                //.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/company*").authenticated()
                .antMatchers(HttpMethod.GET,"/user*").permitAll()

        ;
    }
}
