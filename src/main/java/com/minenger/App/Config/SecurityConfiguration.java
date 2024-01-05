package com.minenger.App.Config;

import com.mysql.cj.protocol.AuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
public class SecurityConfiguration {

    /*private final JwtAuthenticationFilter jwtAuthFilter;

    private final AuthenticationProvider authenticationProvider;?/

    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
        http
                .crsf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }*/

}
