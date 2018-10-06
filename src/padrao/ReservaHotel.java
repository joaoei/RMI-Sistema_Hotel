/*
 ===============================================================================
 ARQUIVO............: ReservaHotel.java
 DESCRICAO..........: Codigo-fonte correspondente a implementação de uma interface 
 					  remota.
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package padrao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ReservaHotel  extends UnicastRemoteObject implements IReserva {
	
	private ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	protected ReservaHotel() throws RemoteException { 
		super(); 
		quartos.add(new Quarto(15, 0, 10.0));
		quartos.add(new Quarto(10, 0, 25.0));
		quartos.add(new Quarto(10, 0, 35.0));
		quartos.add(new Quarto(5, 0, 60.0));
		quartos.add(new Quarto(2, 0, 100.0));
	}
	

	@Override
	public String listarQuartosDisponiveis() throws RemoteException {
		return ("\nTipo 1 - vagas: " + quartos.get(0).getQuartosDisponiveis()+" preço: " +quartos.get(0).getPreco_diaria() +"\n"
				+"Tipo 2 - vagas: " + quartos.get(1).getQuartosDisponiveis()+" preço: "+quartos.get(1).getPreco_diaria() + "\n"
				+"Tipo 3 - vagas: " + quartos.get(2).getQuartosDisponiveis()+" preço: "+quartos.get(2).getPreco_diaria() + "\n"
				+"Tipo 4 - vagas: " + quartos.get(3).getQuartosDisponiveis()+" preço: "+quartos.get(3).getPreco_diaria() + "\n"
				+"Tipo 5 - vagas: " + quartos.get(4).getQuartosDisponiveis()+" preço: "+quartos.get(4).getPreco_diaria());
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException {
		if (tipo_quarto > 0 && tipo_quarto <= 5) {
			if(quartos.get(tipo_quarto-1).getQuartosDisponiveis() > 0) {
				quartos.get(tipo_quarto-1).reservarQuarto();
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
 