package com.reclutamiento.dao;

import javax.sql.DataSource;
 
 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.reclutamiento.bean.Usuario;

@Service ("UsuarioDao")
public class UsuarioDAOImpl implements UsuarioDAO {

    private JdbcTemplate jdbcTemplate;
    
    public UsuarioDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void guardarUsuario(Usuario usuario) {
    	 String sql = "INSERT INTO postulante (idusuario, nombre, apellido, contraseña, rut, cargo, enabled)"
                 + " VALUES (null, ?, ?, ?, ?, 'ROLE_USER', 1)";
     jdbcTemplate.update(sql, usuario.getNombre(), 
				    		  usuario.getApellido(), 
				    		  usuario.getClave(), 
				    		  usuario.getRut()); 
	}


	
	
}
