package com.udea.product.service;

import com.udea.product.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // En un proyecto real, buscarías al usuario en una base de datos.
        // Aquí, simulamos un usuario en memoria para la demostración.
        if ("admin".equals(username)) {
            return new User("admin", "{noop}password"); // {noop} es un prefijo para que Spring sepa que no hay encriptación.
        }
        throw new UsernameNotFoundException("Usuario no encontrado con username: " + username);
    }
}
