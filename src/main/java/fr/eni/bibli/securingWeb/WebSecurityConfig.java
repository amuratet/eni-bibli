package fr.eni.bibli.securingWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.antMatchers("/film/ajouter").authenticated()
			.anyRequest().permitAll()
			.and()
		.formLogin()
			.loginPage("/login")
			.and()
		.logout()
			.permitAll();
	}


	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		List<UserDetails> utilisateurs = new ArrayList<>();
		utilisateurs.add(new User("Lewis", encoder.encode("titi"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//		utilisateurs.add(new User("Lewis", "titi", Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
		utilisateurs.add(new User("Amilcar", encoder.encode("tutu"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//		utilisateurs.add(new User("Amilcar", "tutu", Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));

		return new InMemoryUserDetailsManager(utilisateurs);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
