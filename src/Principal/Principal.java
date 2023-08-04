package Principal;

import java.util.Scanner;

import Entity.Sucursalemexico;
import Implementacion.Implementacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos nuestras VariablesRestaurante
		String nombre;
		String Entidad;
		Number telefono;
		// Nuevamente declaramos nuestros atributos Sucursal
		String calle;
		String colonia;
		String munCiu;

		// Instanciamos nuestra clase Implementacion
		Implementacion imp = new Implementacion();

		// Declaramos nuestras vaiables de control

		int menuP, Submenu, Menu, indice;

		// Guardamos espacio en memoria

		Sucursalemexico sucu = null;
		Scanner leer = null;

		// comenzamos con nuestro primero switch

		do {
			System.out.println("Menu Principal");
			System.out.println("1.-CRUD RESTAURANTE");
			System.out.println("2.- Salir");
			leer = new Scanner(System.in);
			menuP = leer.nextInt();

			switch (menuP) {
			case 1:
				do {
					// Comenzamos el menu del crud restaurante
					System.out.println("CRUD Restaurante");
					System.out.println("1.- ALTA");
					System.out.println("2.- BUSCAR");
					System.out.println("3.- EDITAR");
					System.out.println("4.- ELIMINAR");
					System.out.println("5.- LISTAR");
					System.out.println("6.- HOME");
					leer = new Scanner(System.in);
					Menu = leer.nextInt();

					switch (Menu) {
					case 1:

						System.out.println("/Opcion 1 Alta/");
						System.out.println("Ingrese el nombre del Restaurante");
						leer = new Scanner(System.in);
						nombre = leer.nextLine();
						System.out.println("Ingrese la entidad Federativa");
						leer = new Scanner(System.in);
						Entidad = leer.nextLine();
						System.out.println("Ingrese el telefono");
						leer = new Scanner(System.in);
						telefono = leer.nextLong();
						System.out.println("Ingrese el nombre de la calle");
						leer = new Scanner(System.in);
						calle = leer.nextLine();
						System.out.println("Ingrese el nombre de la colonia");
						leer = new Scanner(System.in);
						colonia = leer.nextLine();
						System.out.println("Ingrese el municipio o ciudad");
						leer = new Scanner(System.in);
						munCiu = leer.nextLine();

						sucu = new Sucursalemexico(nombre, Entidad, telefono, calle, colonia, munCiu);
						imp.guardar(sucu);
						System.out.println("Sucursal Agregada Correctamente");
						break;
					case 2:
						// Mostrar
						System.out.println("/Opcion 2 Buscar/");
						imp.indDes();

						// Buscar
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						sucu = (Sucursalemexico) imp.buscar(indice);
						System.out.println("Sucursal Encontrada :" + " " + sucu.getNombre());

						break;
					case 3:
						do {
							System.out.println("/Submenu de edition/");
							System.out.println("1.-Nombre de la sucursal");
							System.out.println("2.- Home");

							leer = new Scanner(System.in);
							Submenu = leer.nextInt();

							switch (Submenu) {
							case 1:
								//MOstrar
								imp.indDes();
								System.out.println("Ingrese indice a editar el nombre");
								leer = new Scanner(System.in);
								indice = leer.nextInt();
								
								//Editar
								System.out.println("Ingrese el nombre a editar");
								leer = new Scanner(System.in);
								nombre = leer.nextLine();
                                sucu.setNombre(nombre);
								imp.editar(indice, sucu);
								
								System.out.println("Se edito el nombre a " + " " + nombre);
								break;
							case 2:
								System.out.println("regresando al Home");

							default:
								break;
							}

						} while (Submenu != 2);

						break;
					case 4:
						// Mostrar
						System.out.println("/Opcion 4 Eliminar/");
						imp.indDes();
						System.out.println("Ingrese el indice a eliminar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						sucu = (Sucursalemexico) imp.buscar(indice);
						// Eliminar
						imp.eliminar(indice);

						System.out.println("Se elimino la sucursal:" + " " + sucu.getNombre());

						break;
					case 5:
						// Mostrar
						System.out.println("/Opcion 5 Mostrar/");
						imp.listar();

						break;
					case 6:
						System.out.println("/*Regresando al menu*/");
						break;

					default:
						break;
					}

				} while (Menu != 6);

				break;
			case 2:
				System.out.println("Vuelva Pronto");
				break;

			default:
				break;
			}
		} while (menuP != 2);
	}

}
