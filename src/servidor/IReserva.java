/*
 ===============================================================================
 ARQUIVO............: IReserva.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao de uma interface 
 					  remota, que especifica os metodos a serem providos do lado
 					  servidor.
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IReserva extends Remote {
	public ArrayList<ArrayList<Quarto>> listarQuartosDisponiveis() throws RemoteException;
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException;
}
