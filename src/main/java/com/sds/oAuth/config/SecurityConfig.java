package com.sds.oAuth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER,ADMIN");
        auth.inMemoryAuthentication().withUser("park").password("jeep8walrus").roles("USER");
        auth.inMemoryAuthentication().withUser("jimmy").password("jeep8walrus").roles("USER");
        auth.inMemoryAuthentication().withUser("scott").password("jeep8walrus").roles("USER");
        auth.inMemoryAuthentication().withUser("tim").password("jeep8walrus").roles("USER");
        auth.inMemoryAuthentication().withUser("russel").password("jeep8walrus").roles("USER");
        auth.inMemoryAuthentication().withUser("keen").password("jeep8walrus").roles("USER");
    }

    @Bean
    @Override public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
