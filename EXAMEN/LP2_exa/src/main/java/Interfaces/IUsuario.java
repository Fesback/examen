package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {
	
	void RegistrarUsuario(TblUsuariocl2 usuario);
	void ActualizarUsuraio(TblUsuariocl2 usuario);
	void EliminarUsuario(TblUsuariocl2 usuario);
	List<TblUsuariocl2> ListarUsuario();
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario);
	
	

}
