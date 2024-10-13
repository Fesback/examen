package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario{

	public void RegistrarUsuario(TblUsuariocl2 usuario) {
			
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
			     try{
				
				em.getTransaction().begin();
				
				em.persist(usuario);
				
				em.getTransaction().commit();
			     }catch(RuntimeException ex){
			    	
			    	ex.getMessage(); 
			     }finally{
				
				em.close();
			     }
			
			}
	
	public void ActualizarUsuraio(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			
		}
		
		
	}

	public void EliminarUsuario(TblUsuariocl2 usuario) {
			
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
				try{
				
				em.getTransaction().begin();
				
				TblUsuariocl2 codelim=em.find(TblUsuariocl2.class,usuario.getIdUsuariocl2());
				
				if(codelim!=null){
					em.remove(codelim);
				}
				
				em.getTransaction().commit();
				}catch(RuntimeException ex){
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					ex.getMessage();
				}finally{
				
				em.close();
				}
			}
	
	
	public List<TblUsuariocl2> ListarUsuario() {
			
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
				List<TblUsuariocl2> listado=null;
				try{
				
				em.getTransaction().begin();
				
				 listado=em.createQuery("select p from TblUsuariocl2 p",TblUsuariocl2.class).getResultList();
				 em.getTransaction().commit();
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				em.close();
				}
				return listado;
			}

	
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
		   EntityManager em=emf.createEntityManager();
		   TblUsuariocl2 buscausu=null;
		   try{
		   
		   em.getTransaction().begin();
		   
		   buscausu=em.find(TblUsuariocl2.class,usuario.getIdUsuariocl2());
		  
		   em.getTransaction().commit();
		   }catch(RuntimeException ex){
			   ex.getMessage();
		   }finally{
		  
		   em.close();
		   }
		   return buscausu;
		} 

	}
