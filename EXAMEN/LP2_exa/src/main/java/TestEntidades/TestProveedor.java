package TestEntidades;

import java.util.Date;

import DaoImp.TblProveedorImp;
import model.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tblpro=new TblProveedorcl2();
		TblProveedorImp tblimp=new TblProveedorImp();
		
		tblpro.setNomproveecl2("asf");
		tblpro.setRucproveecl2("12388123");
		tblpro.setRsocialproveecl2("music");
		tblpro.setEmailproveecl2("sony@gmail.com");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblpro.setFeingproveecl2(fechasql);
		
		
		

	}

}
