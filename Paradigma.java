import java.util.Date;
import javax.swing.JOptionPane;
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
		
		System.out.println(auto1.marca+", "+auto1.modelo+", "+auto1.color+", "+auto1.getVelocidad());
	
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Ford";
		auto2.modelo="Ka";
		auto2.color="Negro";
		for(int a=0;a<=60;a++){
			auto2.acelerar();
		}
		System.out.println(auto2.marca+", "+auto2.modelo+", "+auto2.color+", "+auto2.getVelocidad());
	
		System.out.println("-- auto3 --");
		Auto auto3=new Auto();
		auto3.acelerar();		//10
		//auto3.acelerar(16);		//26
		//auto3.acelerar(12);		//38
		auto3.acelerar(20,true);//78
		//auto3.velocidad=369;
		System.out.println(auto3.marca+", "+auto3.modelo+", "+auto3.color+", "+auto3.getVelocidad());
		
		auto3.imprimirVelocidad();
		System.out.println(auto3.getVelocidad());
		//JOptionPane.showMessageDialog(null,"velocidad: "+auto3.getVelocidad());
	
		//Las variables deben ser inicializadas
		//int nro;
		//String texto;
		
		//System.out.println(nro);			//Error
		//System.out.println(texto);		//Error
		
		/*
		 * //php
		 * $nro;							
		 * $texto;	
		 * $nro='hola';	
		 * $nro=3;
		 * $nro=True;
		 * $nro=3.24;
		 * echo $nro;						//Error
		 * echo $texto;						//Error
		 * 
		 * //javascript
		 * var nro;
		 * var texto;
		 * alert(nro);
		 * alert(texto);
		 * 
		*/ 
		
	} // end main
} // end class

//declaración de clases
class Auto{
	
	//Atributos
	public String marca;
	public String modelo;
	public String color;
	private int velocidad;
	
	//Métodos
	public void acelerar(){										//acelerar
		//velocidad=velocidad+10;
		//if(velocidad>100){
		//	velocidad=100;
		//}
		acelerar(10);
	}
	
	//Método sobrecargado
	private void acelerar(int kilometros){							//acelerarInt
		velocidad = velocidad + kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	public void acelerar(int kilometros, boolean nitro){			//acelerarIntBoolean
		if(nitro==true){
			acelerar(kilometros*2);		//Llamado a método de la misma clase
		}else{
			acelerar(kilometros);
		}
	}
	
	void acelerar(boolean x, int x2){						//acelerarBooleanInt
	}
	
	//void acelerar(int x){									//acelerarInt
	//}
	
	//int acelerar(int x){}									//acelerarInt
	
	void acelerar(int x,int y){								//acelerarIntInt
	}
	
	void acelerar(String kilometros){						//acelerarString
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	int getVelocidad(){
		return velocidad;
	}
	
} //end class

class Cliente{
	int nro;
	String nombre;
	int edad;
	Cuenta cuenta;
}

class Cuenta{
	int nro;
	String moneda;
	double saldo;
}

class ClientePyme{
	
	// Atributos aquí
	String razonSocial;
	String direccion;
	Date fechaDeAlta;
	CuentaCorriente cuenta;
	
	// Métodos aquí
	
}

class CuentaCorriente {}
