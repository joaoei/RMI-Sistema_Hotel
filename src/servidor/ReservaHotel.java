/*
 ===============================================================================
 ARQUIVO............: ReservaHotel.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao de uma interface 
 					  remota, que especifica os metodos a serem providos do lado
 					  servidor.
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ReservaHotel  extends UnicastRemoteObject implements IReserva {
	
	private ArrayList<ArrayList<Quarto>> quartos = new ArrayList<ArrayList<Quarto>>();
	
	protected ReservaHotel() throws RemoteException { 
		super();
		
		ArrayList<Quarto> tipo1 = new ArrayList<Quarto>();
		ArrayList<Quarto> tipo2 = new ArrayList<Quarto>();
		ArrayList<Quarto> tipo3 = new ArrayList<Quarto>();
		ArrayList<Quarto> tipo4 = new ArrayList<Quarto>();
		ArrayList<Quarto> tipo5 = new ArrayList<Quarto>();
		
		tipo1.add(new Quarto(100.0));
		tipo1.add(new Quarto(100.0));
		tipo1.add(new Quarto(100.0));
		tipo1.add(new Quarto(100.0));
		
		tipo2.add(new Quarto(55.0));
		tipo2.add(new Quarto(55.0));
		tipo2.add(new Quarto(55.0));
		
		tipo3.add(new Quarto(73.50));
		tipo3.add(new Quarto(73.50));
		tipo3.add(new Quarto(73.50));
		tipo3.add(new Quarto(73.50));
		tipo3.add(new Quarto(73.50));
		
		tipo4.add(new Quarto(90.0));
		tipo4.add(new Quarto(90.0));
		
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		tipo5.add(new Quarto(30.0));
		
		quartos.add(tipo1);
		quartos.add(tipo2);
		quartos.add(tipo3);
		quartos.add(tipo4);
		quartos.add(tipo5);
	}
	
	@Override
	public ArrayList<ArrayList<Quarto>> listarQuartosDisponiveis() throws RemoteException {
		ArrayList<ArrayList<Quarto>> quartos_disponiveis = new ArrayList<ArrayList<Quarto>>();
		
		for (int i = 0; i < 5 ; i++) {
			ArrayList<Quarto> list = new ArrayList<Quarto>();
			
			for (int j = 0; j < quartos.get(i).size(); j++) {
				if ( quartos.get(i).get(j).isVago() ) {
					list.add(quartos.get(i).get(j));
				}
			}
			
			quartos_disponiveis.add(list);
		}

		return quartos_disponiveis;
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) throws RemoteException {
		if (tipo_quarto > 0 && tipo_quarto <= 5) {
			for (int i = 0; i < quartos.get(tipo_quarto - 1).size(); i++) {
				if (quartos.get(tipo_quarto - 1).get(i).isVago()) {
					quartos.get(tipo_quarto - 1).get(i).reservarQuarto(nome_cliente);
					return true;
				}
			}
			
			return false;
		} else {
			return false;
		}
	}
}
 