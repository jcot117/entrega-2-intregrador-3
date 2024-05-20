package model;

import java.util.ArrayList;

import java.util.Calendar;

import java.util.Collections;

public class Controller {

    
	private ArrayList<Area> almacenamientoArea;

	private ArrayList<Colab> almacenamientoColab;
    
	private ArrayList<Proyect> almacenamiento;

	// Constructor
	public Controller() {

		almacenamiento = new ArrayList<Proyect>();
		almacenamientoArea = new ArrayList<Area>();
		almacenamientoColab = new ArrayList<Colab>();

    }

    public String listPriority() {

		Priority[] arregloPriority = Priority.values();

		String lista = "";

		for (int i = 0; i < arregloPriority.length; i++) {

			lista += "\n" + (i + 1) + "- " + arregloPriority[i];

		}

		return lista;

	}

    public String listaComunity() {

		Comunity[] arregloComunity = Comunity.values();

		String lista = "";

		for (int i = 0; i < arregloComunity.length; i++) {

			lista += "\n" + (i + 1) + "- " + arregloComunity[i];

		}

		return lista;

	}


    public String listType() {

		Type[] arregloType = Type.values();

		String lista = "";

		for (int i = 0; i < arregloType.length; i++) {

			lista += "\n" + (i + 1) + "- " + arregloType[i];

		}

		return lista;

	}



    public boolean registerProyectknowlegde(String code, String name, String status, String fecha, int priority,
			String leader,String nameProcess, int comunity, int type) {

		String[] arregloFecha = fecha.split("-");
		int dia = Integer.parseInt(arregloFecha[0]);
		int mes = Integer.parseInt(arregloFecha[1]) - 1;
		int anio = Integer.parseInt(arregloFecha[2]);

		Calendar nuevaFecha = Calendar.getInstance();
		nuevaFecha.set(anio, mes, dia);

		for (int i = 0; i < almacenamiento.size(); i++) {

			if (almacenamiento.get(i).getCode().equals(code)) {

				return false;

			}

		}

		return almacenamiento.add(new knowlegde(code, name, status, nuevaFecha, Priority.values()[priority - 1], leader, nameProcess, Comunity.values()[comunity-1], Type.values()[type-1]));

	}

	public boolean registerProyectTransformation(String code, String name, String status, String fecha, int priority,
			String leader,String codeProcess) {

		String[] arregloFecha = fecha.split("-");
		int dia = Integer.parseInt(arregloFecha[0]);
		int mes = Integer.parseInt(arregloFecha[1]) - 1;
		int anio = Integer.parseInt(arregloFecha[2]);

		Calendar nuevaFecha = Calendar.getInstance();
		nuevaFecha.set(anio, mes, dia);

		for (int i = 0; i < almacenamiento.size(); i++) {

			if (almacenamiento.get(i).getCode().equals(code)) {

				return false;

			}

		}

		return almacenamiento.add(new transformation(code, name, status, nuevaFecha, Priority.values()[priority - 1], leader, codeProcess));

	}
	
	public boolean registerArea(String name,String code){


		for (int i = 0; i < almacenamientoArea.size(); i++) {

			if (almacenamientoArea.get(i).getCode().equals(code)) {

				return false;

			}

		}

		return almacenamientoArea.add(new Area(name,code));


	}



	public boolean registerColab(String name, String id, String email){

		for (int i = 0; i < almacenamientoColab.size(); i++) {

			if (almacenamientoColab.get(i).getId().equals(id)) {

				return false;

			}

		}

		return almacenamientoColab.add(new Colab(name,id,email));



	}


    
}
