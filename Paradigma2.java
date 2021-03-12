
//Seguir desde Getters y Setters

public class Paradigma2{
	public static void main(String[] args){
		System.out.println("-- cuenta1 --");
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(60000);
		cuenta1.depositar(35000);
		cuenta1.debitar(12000);
		System.out.println(cuenta1.getEstado());
		
		//System.out.println("-- cliente1 --");
		//Cliente cliente1=new Cliente(1,"Juan Perez","Larrea 233");
		//cliente1.setCuenta(new Cuenta(2,"arg$"));
		
		System.out.println("-- cliente2 --");
		Cliente cliente2=new Cliente(2,"Diego Sosa","Lima 222",new Cuenta(3,"U$S"));
		cliente2.getCuenta().depositar(10000);
		
		System.out.println("-- cliente3 --");
		Cliente cliente3=new Cliente(3,"Debora Lopez","Lima 222",cliente2.getCuenta());
		cliente3.getCuenta().debitar(2000);
		
		System.out.println(cliente2.getEstado());
		System.out.println(cliente3.getEstado());
		
		System.out.println("-- cliente4 --");
		Cliente cliente4=new Cliente(4,"Lorena Bracamonte","Viel 234",4,"Reales");
		System.out.println(cliente4.getEstado());
		
		
		
	}
}

class Cliente{
	private int numero;
	private String nombre;
	private String direccion;
	private Cuenta cuenta;
	
	//El cliente se puede crear sin cuenta.
	//public Cliente(int numero, String nombre, String direccion){
	//	this.numero=numero;
	//	this.nombre=nombre;
	//	this.direccion=direccion;
	//}
	
	//El cliente se crea con una cuenta.
	//Una Cuenta puede pertenecer a más de un cliente.
	public Cliente(int numero, String nombre, String direccion, Cuenta cuenta){
		this.numero=numero;
		this.nombre=nombre;
		this.direccion=direccion;
		this.cuenta=cuenta;
	}
	
	//El cliente se crea una cuenta.
	//Una cuenta solo pertenece a este cliente.
	public Cliente(int numero, String nombre, String direccion, int nroCuenta, String moneda){
		this.numero=numero;
		this.nombre=nombre;
		this.direccion=direccion;
		this.cuenta=new Cuenta(nroCuenta, moneda);
	}
	
	//Este método permite poner o cambiar una cuenta.
	public void setCuenta(Cuenta cuenta){
		this.cuenta=cuenta;
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
	
	public String getEstado(){
		return nombre+", "+direccion+", "+cuenta.getEstado();
	}
}

class Cuenta{
	//atributos
	private int numero;
	private String moneda;
	private double saldo;
	
	//método constructor
	public Cuenta(int numero, String moneda){
		this.numero=numero;
		this.moneda=moneda;
		this.saldo=0;
	}
	
	public void depositar(double monto){
		saldo = saldo + monto;
	}
	
	public void debitar(double monto){
		if(monto <= saldo){
			saldo = saldo - monto;
		}else{
			System.out.println("Saldo Insuficiente!");
		}
	}
	
	public String getEstado(){
		return numero+", "+moneda+", "+saldo;
	}
}
