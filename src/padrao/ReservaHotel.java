package padrao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ReservaHotel  extends UnicastRemoteObject implements IReserva {
	//Cinco tipos de quartos com diferentes valores de diária
	
	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	
	protected ReservaHotel() throws RemoteException { 
		super(); 
		quartos.add(new Quarto(10, 0, 10.0));
		quartos.add(new Quarto(10, 0, 25.0));
		quartos.add(new Quarto(10, 0, 35.0));
		quartos.add(new Quarto(10, 0, 60.0));
		quartos.add(new Quarto(10, 0, 100.0));
	}
	

	@Override
	public String listarQuartosDisponiveis() throws RemoteException {
		
		System.out.println("Tipo 1 - vagas: " + quartos.get(0).getVagas()+" preço: "+quartos.get(0).getPreco_diaria());
		System.out.println("Tipo 2 - vagas: " + quartos.get(1).getVagas()+" preço: "+quartos.get(1).getPreco_diaria());
		System.out.println("Tipo 3 - vagas: " + quartos.get(2).getVagas()+" preço: "+quartos.get(2).getPreco_diaria());
		System.out.println("Tipo 4 - vagas: " + quartos.get(3).getVagas()+" preço: "+quartos.get(3).getPreco_diaria());
		System.out.println("Tipo 5 - vagas: " + quartos.get(4).getVagas()+" preço: "+quartos.get(4).getPreco_diaria());
		
		
		return ("Tipo 1 - vagas: " + quartos.get(0).getVagas()+" preço: " +quartos.get(0).getPreco_diaria() +"\n"
				+"Tipo 2 - vagas: " + quartos.get(1).getVagas()+" preço: "+quartos.get(1).getPreco_diaria() + "\n"
				+"Tipo 3 - vagas: " + quartos.get(2).getVagas()+" preço: "+quartos.get(2).getPreco_diaria() + "\n"
				+"Tipo 4 - vagas: " + quartos.get(3).getVagas()+" preço: "+quartos.get(3).getPreco_diaria() + "\n"
				+"Tipo 5 - vagas: " + quartos.get(4).getVagas()+" preço: "+quartos.get(4).getPreco_diaria());
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException {
		if(quartos.get(tipo_quarto).getQuartosDisponiveis() > 0) {
			quartos.get(tipo_quarto).reservarQuarto();
			return true;
		}else
			return false;
	}
}
 