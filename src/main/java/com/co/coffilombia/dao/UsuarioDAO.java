
package com.co.coffilombia.dao;

import com.co.coffilombia.pojo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
    
}
