package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class TblProveedorImp implements IProveedor {

	public void RegistarProveedor(TblProveedorcl2 proveedor) {
			
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
			     try{
				
				em.getTransaction().begin();
				
				em.persist(proveedor);
				
				em.getTransaction().commit();
			     }catch(RuntimeException ex){
			    	
			    	ex.getMessage(); 
			     }finally{
				
				em.close();
			     }
			
			}
	

	public void ActualizarProveedor(TblProveedorcl2 proveedor) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
		EntityManager em=emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(proveedor);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
			
			
		}
		
		
	}

	public void EliminarProveedor(TblProveedorcl2 proveedor) {
			
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
				try{
				
				em.getTransaction().begin();
				
				TblProveedorcl2 codelim=em.find(TblProveedorcl2.class,proveedor.getIdproveedorcl2());
				
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
	
	
	public List<TblProveedorcl2> ListarProveedor() {
		
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
				EntityManager em=emf.createEntityManager();
				List<TblProveedorcl2> listado=null;
				try{
				
				em.getTransaction().begin();
				
				 listado=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
				 em.getTransaction().commit();
				}catch(RuntimeException ex){
					ex.getMessage();
				}finally{
				em.close();
				}
				return listado;
			}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveedor) {
			
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_exa");
		   EntityManager em=emf.createEntityManager();
		   TblProveedorcl2 buscarpro=null;
		   try{
		   
		   em.getTransaction().begin();
		   
		    buscarpro=em.find(TblProveedorcl2.class,proveedor.getIdproveedorcl2());
		 
		   em.getTransaction().commit();
		   }catch(RuntimeException ex){
			   ex.getMessage();
		   }finally{
		   
		   em.close();
		   }
		   return buscarpro;
		} 

	}