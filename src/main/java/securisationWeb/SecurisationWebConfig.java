package securisationWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurisationWebConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/home").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
	}

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		List<UserDetails> utilisateurs = new ArrayList<>();
		utilisateurs.add(new User("bob", encoder.encode("azerty"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
		utilisateurs.add(new User("jane", encoder.encode("Pa$$w0rd"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
		return new InMemoryUserDetailsManager(utilisateurs);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
