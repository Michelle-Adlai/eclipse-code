package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Entity.Sucursalemexico;
import Interface.MetodProce;

public class Implementacion implements MetodProce {

	// Creamos nuestra lista a trabajar
	List<Object> listaObj = new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		listaObj.add(obj);

	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaObj.remove(indice);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Auto-generated method stub
		listaObj.set(indice, obj);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listaObj.get(indice);
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println(listaObj);

	}

	// Metodo personalizado -- indice y una descripcion
	public void indDes() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < listaObj.size(); i++) {
			if (listaObj.get(i).getClass().equals(Sucursalemexico.class)) {
				Sucursalemexico suc = (Sucursalemexico) listaObj.get(i);
				System.out.printf("[%d]=>" + suc.getNombre() + "\n", i);
			}
		}
	}
	
	public  void listar(){
		System.out.println(listaObj);
	}

}
