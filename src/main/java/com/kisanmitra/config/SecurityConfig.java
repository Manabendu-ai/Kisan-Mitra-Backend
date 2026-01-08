//package com.kisanmitra.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider dao = new DaoAuthenticationProvider(userDetailsService);
//        dao.setPasswordEncoder(new BCryptPasswordEncoder(10));
//        return dao;
//    }
//
//    @Bean
//    public SecurityFilterChain customSecurity(HttpSecurity http) {
//
//        return http.csrf(x -> x.disable())
//                .authorizeHttpRequests(
//                        x ->
//                                x.
//
//                                        requestMatchers(
//                                                "/KisanMitra/users/**")
//                                        .permitAll()
//                                        .anyRequest().authenticated()
//                )
////                .httpBasic(Customizer.withDefaults())
//                .sessionManagement(
//                        x -> {
//                            x.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                        }
//                ).build();
//    }
//}
