package com.vernonliu.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //User the following line for reference to necessary configs
        //super.configure(httpSecurity);

        httpSecurity.authorizeRequests().antMatchers("/inbox**").authenticated()
                .and().formLogin()
                .and().httpBasic();
        httpSecurity.authorizeRequests().anyRequest().permitAll();

        httpSecurity.csrf().disable();
        httpSecurity.cors().disable();
    }
}
