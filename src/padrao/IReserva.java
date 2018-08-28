package padrao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReserva extends Remote {
	public String listarQuartosDisponiveis() throws RemoteException;
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException;
}
