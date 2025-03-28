package com.tomillo.hoja.configurations;

import org.springframework.security.core.userdetails.User;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

        @Bean
        CorsConfigurationSource corsConfigurationSource() {

                CorsConfiguration config = new CorsConfiguration();
                config.addAllowedHeader("X-XSRF-TOKEN");
                config.addAllowedHeader("Content-Type");
                config.setAllowedHeaders(Arrays.asList("*"));
                config.setAllowedMethods(Arrays.asList("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS"));
                config.setAllowedOrigins(
                                Arrays.asList("http://localhost", "http://localhost:4200",
                                                "https://cloudreport.davnar.com.ar/"));
                config.setAllowCredentials(true); // This is important since we are using session cookies
                config.addExposedHeader("Content-Disposition");
                final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                source.registerCorsConfiguration("/**", config);
                return source;
        }

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http
                                .authorizeHttpRequests((requests) -> requests
                                                .requestMatchers("/", "home", "/public", "/css/**").permitAll()
                                                .requestMatchers("/admin", "/resource").hasRole("ADMIN")
                                                .requestMatchers("/user").hasRole("USER")
                                                .anyRequest().authenticated())
                                .formLogin((form) -> form
                                                .loginPage("/login")
                                                .failureUrl("/login?error=true")
                                                .permitAll())
                                .logout((logout) -> logout.permitAll())
                                .cors(Customizer.withDefaults())
                                .exceptionHandling((exceptions) -> exceptions
                                                .accessDeniedPage("/403"));
                return http.build();
        }

        @Bean
        public UserDetailsService userDetailsService() {
                UserDetails admin = User.builder()
                                .username("admin")
                                .password(passwordEncoder().encode("admin123")) // Replace with a secure password
                                .roles("ADMIN")
                                .build();

                UserDetails user = User.builder()
                                .username("user")
                                .password(passwordEncoder().encode("user123")) // Replace with a secure password
                                .roles("USER")
                                .build();

                return new InMemoryUserDetailsManager(admin, user);
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }
}
