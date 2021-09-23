package pl.sda.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import pl.sda.service.impl.UserServiceImpl;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserServiceImpl userService;

    public SecurityConfig(UserServiceImpl userService) {
        this.userService = userService;
    }

    // Użyj beana typu UserService do wybierania użytkownika o zadanej nazwie
    // (żeby sprawdzić, czy istnieje i żeby następnie porównać hasło).
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    // Konfiguracja zabezpieczeń żądań HTTP.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                ////////////////////////////////////////////////////////////////
                // Konfigurujemy zabezpieczenia tyczące się konkretnych żądań:
                .authorizeRequests()

                // Żądania wysłane pod poniższe ścieżki
                .antMatchers("/", "/favicon.ico", "/tour/list",
                        "/user/register")
                // będą dostępne dla każdego.
                .permitAll()

                // Żądanie wysłane pod ścieżkę /admin-only
                .antMatchers("/admin-only", "/location/list", "/location/add","/location/result")
                // będzie wymagało posiadania roli ADMIN
                .hasRole("ADMIN")

                // Wszystkie pozostałe żądania
                .anyRequest()
                // będą wymagały autentykacji.
                .authenticated()
                ////////////////////////////////////////////////////////////////

                .and()
                // Będziemy używali logowania z wykorzystaniem formularza (metoda post, parametry username i password).
                .formLogin()
                // Wskażemy ścieżkę, dla której będzie obsłużone żądanie tyczące się logowania.
                .loginPage("/");
    }
}
