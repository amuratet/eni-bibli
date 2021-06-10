package fr.eni.bibli.securingWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MonUserDetailsService implements UserDetailsService{

	private List<UserDetails> utilisateurs;

	public MonUserDetailsService(PasswordEncoder passwordEncoder) {
		utilisateurs = new ArrayList<>();
		utilisateurs.add(new User("lewis", passwordEncoder.encode("titi"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
		utilisateurs.add(new User("amilcar", passwordEncoder.encode("tutu"), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		for(UserDetails u: utilisateurs) {
			if(username.equals(u.getUsername())){
				return u;
			}
		}
		return null;
	}

}

