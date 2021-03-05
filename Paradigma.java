public class Paradigma{
	public static void main(String[] args){
		//punto de entrada
		System.out.println("Hola Mundo");
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();
		auto1.marca="Fiat";
		auto1.modelo="Idea";
		auto1.color="Rojo";
		auto1.acelerar();			// 10
		auto1.acelerar();			// 20
		auto1.acelerar();			// 30
		auto1.frenar();				// 20
		
		System.out.println(auto1.marca+", "+auto1.modelo+", "+auto1.color+", "+auto1.velocidad);
	
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Ford";
		auto2.modelo="Ka";
		auto2.color="Negro";
		for(int a=0;a<=60;a++){
			auto2.acelerar();
		}
		System.out.println(auto2.marca+", "+auto2.modelo+", "+auto2.color+", "+auto2.velocidad);
	
		
	} // end main
} // end class

//declaración de clases
class Auto{
	
	//Atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//Métodos
	void acelerar(){
		velocidad=velocidad+10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
} //end class
