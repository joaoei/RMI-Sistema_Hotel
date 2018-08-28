package padrao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReservaHotel  extends UnicastRemoteObject implements IReserva {
	//Cinco tipos de quartos com diferentes valores de diária
	
	private int qtd_quarto1 = 10;
	private int qtd_quarto2 = 10;
	private int qtd_quarto3 = 10;
	private int qtd_quarto4 = 10;
	private int qtd_quarto5 = 10;
	
	
	private double preco_quarto1 = 10.0;
	private double preco_quarto2 = 25.0;
	private double preco_quarto3 = 35.0;
	private double preco_quarto4 = 60.0;
	private double preco_quarto5 = 100.0;
	
	protected ReservaHotel() throws RemoteException { 
		super(); 
	}

	@Override
	public String listarQuartosDisponiveis() throws RemoteException {
		
		System.out.println("Tipo 1 - vagas: " + qtd_quarto1+" preço: "+preco_quarto1);
		System.out.println("Tipo 2 - vagas: " + qtd_quarto2+" preço: "+preco_quarto2);
		System.out.println("Tipo 3 - vagas: " + qtd_quarto3+" preço: "+preco_quarto3);
		System.out.println("Tipo 4 - vagas: " + qtd_quarto4+" preço: "+preco_quarto4);
		System.out.println("Tipo 5 - vagas: " + qtd_quarto5+" preço: "+preco_quarto5);
		
		
		return ("Tipo 1 - vagas: " + qtd_quarto1+" preço: "+preco_quarto1 +"\n"
				+"Tipo 2 - vagas: " + qtd_quarto2+" preço: "+preco_quarto2 + "\n"
				+"Tipo 3 - vagas: " + qtd_quarto3+" preço: "+preco_quarto3 + "\n"
				+"Tipo 4 - vagas: " + qtd_quarto4+" preço: "+preco_quarto4 + "\n"
				+"Tipo 5 - vagas: " + qtd_quarto5+" preço: "+preco_quarto5);
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException {
		//Se tipo do quarto não estiver disponivel
		if (tipo_quarto == 1) {
			return false;
		} 
		//Se tipo do quarto estiver disponivel
		else {
			return true;
		}
	}
}
 