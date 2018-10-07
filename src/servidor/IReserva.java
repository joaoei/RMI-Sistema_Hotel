package servidor;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IReserva {
	@WebMethod
	public ArrayList<ArrayList<Quarto>> listarQuartosDisponiveis();
	
	@WebMethod
	public boolean reservarQuarto(int tipo_quarto, String nome_cliente);
}
