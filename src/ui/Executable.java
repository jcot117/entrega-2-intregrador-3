package ui;
import java.util.Scanner;
import model.Controller; 


public class Executable {

    private Scanner reader;
	private Controller control;

    public Executable(){
        reader = new Scanner(System.in);
		control = new Controller();
    }

    public static void main(String [] principal){
		
		Executable exe = new Executable();
		
		exe.menus();
		
	}
    

    
    public void menus(){
		
		boolean flag = true;
		
		do{
			
			System.out.println("Bienvenido ");
			System.out.println("1) registrar solicitud");
			System.out.println("2) registrar area");
			System.out.println("3) registrar colaborador lider");
			System.out.println("4) consultar");
			System.out.println("0) salir ");
			int opc = reader.nextInt();
			
			switch(opc){
				
				case 1:
				
				break;
				
				case 2: 
				
				break;
				
				case 0:
				flag = false;
				System.out.println("Gracias por usar nuestros servicios");
				break;
		
				
				default:
				System.out.println("Opcion Invalida. Intenta nuevamente");
				break;
			}
			
		}while(flag==true);
		
	}


    public void RegisterProyectKnowlegde (){

        reader.nextLine(); //arreglo bug Scanner 

        System.out.println("ingrese un codigo alfanumerico de 4 digitos");

		String code = reader.nextLine();

		System.out.println("ingrese el nombre del proyecto");
		String name = reader.nextLine();


		System.out.println("ingrese el estado del proyecto");
		String status = reader.nextLine();

		System.out.println("Por favor digite la fecha (dd-mm-aaaa)");
		String fecha = reader.nextLine();

		System.out.println("seleccione el tipo de prioridad");
		System.out.println(control.listPriority());
		int priority = reader.nextInt();

		System.out.println("Ingrese el lider del proyecto");
		String lider = reader.nextLine();

		System.out.println("ingrese el nombre del proceso a mejorar");
		String nameProcess = reader.nextLine();

		System.out.println("seleccione el tipo de comunidad afectada");
		System.out.println(control.listaComunity());
		int comunity = reader.nextInt();

		System.out.println("seleccione el tipo de proceso");
		System.out.println(control.listType());
		int type = reader.nextInt();

		boolean resultado = control.registerProyectknowlegde(code, name, status, fecha, priority, lider,nameProcess,comunity,type);

		if (resultado) {
			System.out.println("Proyecto registrado exitosamente");
		} else {
			System.out.println("Error, el proyecto no se ha podido registrar");
		}



 
	}


	public void RegisterProyectTransformation(){

        reader.nextLine(); //arreglo bug Scanner 

        System.out.println("ingrese un codigo alfanumerico de 4 digitos");
		String code = reader.nextLine();

		System.out.println("ingrese el nombre del proyecto");
		String name = reader.nextLine();


		System.out.println("ingrese el estado del proyecto");
		String status = reader.nextLine();

		System.out.println("Por favor digite la fecha (dd-mm-aaaa)");
		String fecha = reader.nextLine();

		System.out.println("seleccione el tipo de prioridad");
		System.out.println(control.listPriority());
		int priority = reader.nextInt();

		System.out.println("Ingrese el lider del proyecto");
		String lider = reader.nextLine();

		System.out.println("ingrese el codigo del proceso");
		String codeProcess = reader.nextLine();

		boolean resultado = control.registerProyectTransformation(code, name, status, fecha, priority, lider,codeProcess);

		if (resultado) {
			System.out.println("Proyecto registrado exitosamente");
		} else {
			System.out.println("Error, el proyecto no se ha podido registrar");
		}

    }


	public void registerArea(){

		System.out.println("digite el nombre del area que desea registrar");
		String name = reader.nextLine();

		System.out.println("digite el codigo del area");
		String code = reader.nextLine();

		boolean resultado = control.registerArea(code, name);

		if (resultado) {
			System.out.println("Proyecto registrado exitosamente");
		} else {
			System.out.println("Error, el proyecto no se ha podido registrar");
		}



	}

	public void registerColab(){

		System.out.println("digite el nombre del colaborador");
		String name = reader.nextLine();

		System.out.println("digete el numero de identificacion  del colaborador");
		String id = reader.nextLine();

		System.out.println("digite el email del colaborador");
		String email = reader.nextLine(); 

		boolean resultado = control.registerColab(name, id, email);

		if (resultado) {
			System.out.println("Proyecto registrado exitosamente");
		} else {
			System.out.println("Error, el proyecto no se ha podido registrar");
		}



	}






    
}
