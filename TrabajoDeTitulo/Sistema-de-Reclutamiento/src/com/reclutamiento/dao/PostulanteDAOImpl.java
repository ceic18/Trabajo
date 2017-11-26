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
import com.reclutamiento.bean.informe_psicologico;

@Service ("PostulanteDAO")
public class PostulanteDAOImpl implements PostulanteDAO {

    private JdbcTemplate jdbcTemplate;
    
    public PostulanteDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    


    // =========================================================================
    // DAO SECRETARIA - INICIO =================================================
    // =========================================================================
    
    public void guardarPostulante(Postulante postulante) {
    	 String sql = "INSERT INTO `postulante`(`idpostulante`, `nombre`, `apellido`, `rut`, `edad`, `anos_exp`, `pretencion_sueldo`, `telefono`, `direccion`, `curriclum`, `clave`, `estado`)"
                 + " VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'Curriculum Ingresado')";
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

	public void eliminarPostulante(String rut) {
	    String sql = "DELETE FROM postulante WHERE rut=?";
	    jdbcTemplate.update(sql, rut);
	    
	    String sql2 = "DELETE FROM usuario WHERE rut=? and cargo='ROLE_USER'";
	    jdbcTemplate.update(sql2, rut);
	}
	
	
	public void guardarCambiosPostulante(Postulante postulante) {
		
        String sql2 = "UPDATE usuario SET nombre=?, apellido=?, rut=?, clave=? WHERE rut=? and cargo='ROLE_USER'";
        jdbcTemplate.update(sql2, postulante.getNombre(), 
					    		  postulante.getApellido(), 
					    		  postulante.getRut(), 
					    	      postulante.getClave(),
					    	      postulante.getRut());
        
        String sql = "UPDATE postulante SET nombre=?, apellido=?, rut=?, direccion=?, edad=?, anos_exp=?, pretencion_sueldo=?, telefono=?, clave=? WHERE idpostulante=?";
        jdbcTemplate.update(sql, postulante.getNombre(), 
					    		  postulante.getApellido(), 
					    		  postulante.getRut(), 
					    		  postulante.getDireccion(), 
					    		  postulante.getEdad(), 
					    		  postulante.getAnos_exp(), 
					    		  postulante.getPretencion_sueldo(), 
					    		  postulante.getTelefono(), 
					    	      postulante.getClave(),
					    	      postulante.getIdpostulante());
	}

	public Postulante modificarPostulante(String rut) {
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
    				postulante.setEdad(rs.getInt("edad"));
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

    // =========================================================================
    // DAO SECRETARIA - FIN ====================================================
    // =========================================================================

	
	
    // =========================================================================
    // DAO PSICOLOGO - INICIO ==================================================
    // =========================================================================
	
	public void guardarInformePostulante(informe_psicologico informe) {
   	 String sql = "INSERT INTO `informe_psicologico`(`id_informe`, `nota`, `comentario`, `informePDF`, `rut_postulante`)"
             + " VALUES (null, ?, ?, ?, ?)";
   	 jdbcTemplate.update(sql, informe.getNota(), 
   			 				  informe.getComentario(),
   			 				  informe.getInformePDF(),
   			 				  informe.getRut_postulante());
   	 
   	 String sql2 ="UPDATE postulante SET estado = 'Entrevista con Psicologico Realizado' where rut = ?";
     jdbcTemplate.update(sql2, informe.getRut_postulante());
	}

	public informe_psicologico modificarInforme(String rut_postulante) {
	   	final informe_psicologico informe = new informe_psicologico();
        String sql = "SELECT * FROM informe_psicologico WHERE rut_postulante='" + rut_postulante+"'";
        return jdbcTemplate.query(sql, new ResultSetExtractor<informe_psicologico>() {
 
            public informe_psicologico extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                	informe.setId_informe(rs.getInt("id_informe"));
                	informe.setRut_postulante(rs.getString("rut_postulante"));
                	informe.setNota(rs.getInt("nota"));
                	informe.setComentario(rs.getString("comentario"));
//                	informe.setInformepdf(rs.getInt("edad"));
                }
                return informe;
            }
     
        });
	}
	
	public void guardarCambiosInforme(informe_psicologico informe) {
		System.out.println(informe.getId_informe());
        String sql = "UPDATE informe_psicologico SET nota=?, comentario=?, rut_postulante=? WHERE id_informe=?";
        jdbcTemplate.update(sql, informe.getNota(), 
        		informe.getComentario(),
        		informe.getRut_postulante(),
        		informe.getId_informe());
		
	}

	
    public informe_psicologico searchInforme(String rut_postulante) {
    	
    	final informe_psicologico informe = new informe_psicologico();
        String sql = "SELECT * FROM informe_psicologico WHERE rut_postulante='" + rut_postulante+"'";
        return jdbcTemplate.query(sql, new ResultSetExtractor<informe_psicologico>() {
 
            public informe_psicologico extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                	informe.setId_informe(rs.getInt("id_informe"));
                	informe.setRut_postulante(rs.getString("rut_postulante"));
                	informe.setNota(rs.getInt("nota"));
                	informe.setComentario(rs.getString("comentario"));
                }
                return informe;
            }
     
        });
    }
    
	public void eliminarInforme(String rut_postulante) {
	    String sql = "DELETE FROM informe_psicologico WHERE rut_postulante=?";
	    jdbcTemplate.update(sql, rut_postulante);
	}

    // =========================================================================
    // DAO PSIOCOLGO - FIN =====================================================
    // =========================================================================

	
	
    // =========================================================================
    // DAO RRHH - INICIO =======================================================
    // =========================================================================
	
	
	public void elegirCandidato() {
		// TODO Auto-generated method stub
		
	}

	public List<Postulante> mejoresCandidatos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void rechazarCandidato() {
		// TODO Auto-generated method stub
		
	}

	public void ordenarCandidatos(String Accion) {
		// TODO Auto-generated method stub
		
	}

	public List<Postulante> listaTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
    // =========================================================================
    // DAO RRHH - FIN ==========================================================
    // =========================================================================

	
	
    // =========================================================================
    // DAO USUARIO - INICIO ====================================================
    // =========================================================================
	

    public Postulante verEstadoPostulacion(String rut) {
    	final Postulante postulante = new Postulante();
        String sql = "SELECT * FROM postulante WHERE rut='" + rut+"'";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Postulante>() {
 
            public Postulante extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
    				postulante.setNombre(rs.getString("nombre"));
    				postulante.setRut(rs.getString("rut"));
    				postulante.setEstado(rs.getString("estado"));
                }
                return postulante;
            }
     
        });
    	
    }

    // =========================================================================
    // DAO USUARIO - FIN =======================================================
    // =========================================================================
    


	
	
	
}
