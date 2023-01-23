package ma.tms.tms.sec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder passwordEncoder= passwordEncoder();
        String encodePWD= passwordEncoder.encode("123");
        System.out.println(encodePWD);
        auth.inMemoryAuthentication().withUser("Conducteur").password(encodePWD).roles("Conducteur");
        auth.inMemoryAuthentication().withUser("Agent").password(encodePWD).roles("Agent Commercial");
        auth.inMemoryAuthentication().withUser("Admin").password(encodePWD).roles("Admin");
        auth.inMemoryAuthentication().withUser("Gestionnaire de flotte").password(encodePWD).roles("Gestionnaire de flotte");
        auth.inMemoryAuthentication().withUser("Dispatch").password(encodePWD).roles("Dispatch");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http.authorizeRequests().antMatchers("/").permitAll();
            http.formLogin();
            /*http.authorizeRequests().antMatchers("/AjouterCommande/**").hasRole(" Agent Commercial ");*/
        http.authorizeHttpRequests().antMatchers("/webjars/**").permitAll();
            http.authorizeRequests().anyRequest().authenticated();
            http.exceptionHandling().accessDeniedPage("/403");

        }

    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
}
