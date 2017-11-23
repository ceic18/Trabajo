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

@Service ("PostulanteDAO")
public class PostulanteDAOImpl implements PostulanteDAO {

    private JdbcTemplate jdbcTemplate;
    
    public PostulanteDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void guardarPostulante(Postulante postulante) {
    	 String sql = "INSERT INTO `postulante`(`idpostulante`, `nombre`, `apellido`, `rut`, `edad`, `anos_exp`, `pretencion_sueldo`, `telefono`, `direccion`, `curriclum`, `clave`)"
                 + " VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     jdbcTemplate.update(sql, postulante.getNombre(), 
				    		  postulante.getApellido(), 
				    		  postulante.getRut(), 
				    		  postulante.getEdad(), 
				    		  postulante.getAnos_exp(), 
				    		  postulante.getPretencion_sueldo(), 
				    		  postulante.getTelefono(), 
				    		  postulante.getDireccion(), 
				    	      postulante.getCurriclum(),
				    	      postulante.getClave());
     
	 String sql2 = "INSERT INTO usuario (idusuario, nombre, apellido, clave, rut, cargo, enabled)"
             + " VALUES (null, ?, ?, ?, ?, 'ROLE_USER', 1)";
	 jdbcTemplate.update(sql2, postulante.getNombre(), 
							   postulante.getApellido(), 
							   postulante.getClave(), 
							   postulante.getRut()); 
	}

    public Postulante get(String rut) {
    	
    	final Postulante postulante = new Postulante();
        String sql = "SELECT * FROM postulante WHERE rut='" + rut+"'";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Postulante>() {
 
            public Postulante extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                	postulante.setIdpostulante(rs.getInt("idpostulante"));
    				postulante.setNombre(rs.getString("nombre"));
    				postulante.setApellido(rs.getString("apellido"));
    				postulante.setRut(rs.getString("rut"));
    				postulante.setAnos_exp(rs.getInt("anos_exp"));
    				postulante.setPretencion_sueldo(rs.getInt("pretencion_sueldo"));
    				postulante.setTelefono(rs.getInt("telefono"));
    				postulante.setDireccion(rs.getString("direccion"));
//    				postulante.setCurriclum(rs.getByte("curriclum"));
    				postulante.setClave(rs.getInt("clave"));
                }
                return postulante;
            }
     
        });
    }

	public List<Postulante> list() {
		String sql = "SELECT * FROM postulante";
		List<Postulante> listaPostulantes = jdbcTemplate.query(sql, new RowMapper<Postulante>() {

			public Postulante mapRow(ResultSet rs, int rowNum) throws SQLException {
				Postulante postulante = new Postulante();
	
            	postulante.setIdpostulante(rs.getInt("idpostulante"));
				postulante.setNombre(rs.getString("nombre"));
				postulante.setApellido(rs.getString("apellido"));
				postulante.setRut(rs.getString("rut"));
				postulante.setAnos_exp(rs.getInt("anos_exp"));
				postulante.setPretencion_sueldo(rs.getInt("pretencion_sueldo"));
				postulante.setTelefono(rs.getInt("telefono"));
				postulante.setDireccion(rs.getString("direccion"));
//				postulante.setCurriclum(rs.getByte("curriclum"));
				postulante.setClave(rs.getInt("clave"));
				
				return postulante;
			}
			
		});
		
		return listaPostulantes;
	}
    

//	public List<Postulante> list() {
//		String sql = "SELECT * FROM postulante";
//		String sql2 = "SELECT * FROM informe_psicologico";
//		String sql3 = "SELECT * FROM prueba";
//	    List<Postulante> listContact = jdbcTemplate.query(sql, new RowMapper<Postulante>() {
//	 
//	        public Postulante mapRow(ResultSet rs, int rowNum) throws SQLException {
//	        	Postulante aContact = new Postulante();
//	 
//	            aContact.setId(rs.getInt("contact_id"));
//	            aContact.setName(rs.getString("name"));
//	            aContact.setEmail(rs.getString("email"));
//	            aContact.setAddress(rs.getString("address"));
//	            aContact.setTelephone(rs.getString("telephone"));
//	 
//	            return aContact;
//	        }
//	 
//	    });
//	 
//	    return listContact;
//		return null;
//	}

	
	
	
}
