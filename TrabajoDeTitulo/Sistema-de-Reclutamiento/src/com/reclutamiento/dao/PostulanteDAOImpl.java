package com.reclutamiento.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;
 
 
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.bean.Usuario;

@Service ("PostulanteDao")
public class PostulanteDAOImpl implements PostulanteDAO {

    private JdbcTemplate jdbcTemplate;
    
    public PostulanteDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void guardarPostulante(Postulante postulante) {
    	 String sql = "INSERT INTO postulante (idpostulante, nombre, apellido, rut, edad, anos_exp, pretencion_sueldo, telefono, direccion, curriclum)"
                 + " VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     jdbcTemplate.update(sql, postulante.getNombre(), postulante.getApellido(), postulante.getRut(), postulante.getEdad(), postulante.getAnos_exp(), postulante.getPretencion_sueldo(), postulante.getTelefono(), postulante.getDireccion(), postulante.getCurriclum());
	}

	public void buscarPostulante(Postulante postulante) {
		// TODO Auto-generated method stub
		
	}

	
	
}
