package com.reliance.sb.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class RelianceBankSecurityConfig {

    /*
    * Spring security with Basic authentication.
    * need to add below properties in the application.properties file to test it.
    * spring.security.user.name=test
    * spring.security.user.password=test
    * */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().
                requestMatchers("/reliance/*").authenticated().
                requestMatchers("/notices", "/contact").permitAll().and().httpBasic();
        return http.build();
    }


    /*
     * Spring security with In-memory authentication.
     * need to comment/remove below properties in the application.properties file to test it.
     * spring.security.user.name=test
     * spring.security.user.password=test
     * */
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails admin = User.withDefaultPasswordEncoder().
                username("admin").password("admin").authorities("admin").build();
        UserDetails user = User.withDefaultPasswordEncoder().
                username("test").password("test").authorities("read").build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}
