public class Paradigma3{
	public static void main(String[] arg$){
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("Ford","Ka","Negro");
		System.out.println(auto1.getMarca());
		auto1.setColor("Rojo");
		auto1.acelerar(35);
		System.out.println(auto1.getVelocidad());
		//auto1.velocidad=300;
		
		System.out.println("-- direccion1 --");
		Direccion direccion1=new Direccion("Larrea",123,1,"a");
		System.out.println(direccion1.getEstado());
		
		/*
		System.out.println("-- persona1 --");
		Persona persona1=new Persona("Juan","Mendez",direccion1,30);
		System.out.println(persona1.getEstado());
		persona1.saludar();
		*/
		
		System.out.println("-- empleado1 --");
		Empleado empleado1=new Empleado(1,"Andrea","Moretti",direccion1,23,80000);
		System.out.println(empleado1.getEstado());
		empleado1.saludar();
		
		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1,"Javier","Larrea",direccion1,30,new Auto("VW","UP","Blanco"));
		System.out.println(cliente1.getEstado());
		cliente1.saludar();
		
		System.out.println("******************************************");
		Persona p1=empleado1;
		Persona p2=cliente1;

		p1.saludar();
		p2.saludar();
		
		System.out.println("******************************************");
		Auto autoX=new Auto("Renault","Clio","Blanco");
		System.out.println(autoX.getEstado()+", "+autoX.getVelocidad());
	}
}

//Un auto se puede crear teniendo un precio o no
//Un auto siempre tiene marca, modelo y color.
class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	private double precio;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	public Auto(String marca, String modelo, String color, double precio){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.precio=precio;
	}
	
	public void acelerar(int kilometros){
		this.velocidad=velocidad+kilometros;
	}
	
	public void frenar(int kilometros){
		this.velocidad=velocidad-kilometros;
	}

	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getVelocidad(){
		return velocidad;
	}
}

class Direccion{
	private String calle;
	private int nro;
	private int piso;
	private String depto;
	
	public Direccion(String calle, int nro, int piso, String depto){
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
		this.depto = depto;
	}
	
	public String getEstado(){
		return calle+", "+nro+", "+piso+", "+depto;
	}
}

abstract class Persona{
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private int edad;
	
	public Persona(String nombre, String apellido, Direccion direccion, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
	}
	
	public String getEstado(){
		return nombre+", "+apellido+", "+direccion.getEstado()+", "+edad;
	}
	
	public void saludar(){
		System.out.println("Hola soy una persona");
	}
}

class Empleado extends Persona {
	private int nroLegajo;
	private double sueldoBasico;
	
	public Empleado(int nroLegajo, String nombre, String apellido, Direccion direccion, int edad, double sueldoBasico){
		super(nombre, apellido, direccion, edad);
		this.nroLegajo = nroLegajo;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getEstado(){
		return nroLegajo+", "+super.getEstado()+", "+sueldoBasico;
	}

	public void saludar(){
		System.out.println("Hola soy un Empleado!");
	}

}

class Cliente extends Persona {
	private int nroCliente;
	private Auto auto;
	
	public Cliente(int nroCliente, String nombre, String apellido, Direccion direccion, int edad, Auto auto){
		super(nombre, apellido, direccion, edad);
		this.nroCliente = nroCliente;
		this.auto = auto;
	}
	
	public String getEstado(){
		return nroCliente+", "+super.getEstado()+", "+auto.getEstado();
	}
	
	public void saludar(){
		System.out.println("Hola soy un Cliente!");
	}
}














