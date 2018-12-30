package com.scr.market.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.scr.market.data.MyUserDetailsService;

import java.util.logging.Logger;
//.antMatchers("/css/**", "/js/**", "/img/**").permitAll().anyRequest().permitAll()    
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	  @Autowired
	    private CustomAuthenticationProvider authProvider;
    private static final Logger mLog = Logger.getLogger(WebSecurityConfig.class.getName());
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        mLog.info("starting configure");
        http
            .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/css/**", "/vendor/**", "/js/**", "/img/**").permitAll().anyRequest().permitAll() 
                .anyRequest().authenticated()            
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

   
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }

    
    /*
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        mLog.info("starting userDetailService");
        //mUserDetailsService.loadUserByUsername(username)
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("a@aol.com")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
    */
    @Override
    public void configure(WebSecurity web) throws Exception {
       
      // web.ignoring().antMatchers("/resources/**");
    }
}