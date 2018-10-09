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

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "service.IReserva")
public class Reserva implements IReserva {
	
	protected Reserva() { 
		super();
		
		//ALGO
	}
	
	@Override
	public ArrayList<ArrayList<Quarto>> listarQuartosDisponiveis() {
		ArrayList<ArrayList<Quarto>> quartos_disponiveis = new ArrayList<ArrayList<Quarto>>();

		return quartos_disponiveis;
	}

	@Override
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente) {
		boolean a = true;
		
		//ALGO
		
		return a;
	}
}
 