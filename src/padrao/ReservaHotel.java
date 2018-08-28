package padrao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReservaHotel  extends UnicastRemoteObject implements IReserva {
	//Cinco tipos de quartos com diferentes valores de diária
	
	protected ReservaHotel() throws RemoteException { 
		super(); 
	}

	@Override
	public String listarQuartosDisponiveis() throws RemoteException {
		return "\nLista de Quartos: \nTipo 1 por 10 reais/dia: 0 vagas \nTipo 2 por 60 reais/dia: 3 vagas \n";
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
 