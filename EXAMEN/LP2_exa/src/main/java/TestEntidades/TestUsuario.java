package TestEntidades;

import DaoImp.TblUsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		TblUsuariocl2 tblusu=new TblUsuariocl2();
		TblUsuarioImp tblimp=new TblUsuarioImp();
		
		tblusu.setUsuariocl2("Josue");
		tblusu.setPasswordcl2("1234");
		
		tblimp.RegistrarUsuario(tblusu);
		
		System.out.println("Dato Registrado en la BD");
		
	}

}
