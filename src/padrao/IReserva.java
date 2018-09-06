/*
 ===============================================================================
 ARQUIVO............: IReserva.java
 DESCRICAO..........: Codigo-fonte correspondente a implementação de uma interface 
 					  remota, que especifica os metodos a serem providos do lado
 					  servidor.
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package padrao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReserva extends Remote {
	public String listarQuartosDisponiveis() throws RemoteException;
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException;
}
