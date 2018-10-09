package cliente;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import servidor.IReserva;

public class Cliente {
	public static void main(String[] args) {
		URL endpoint = null;
		try {
			//URL 
			endpoint = new URL("");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		QName qualifiedName = new QName("http://service/", "");
		Service service = Service.create(endpoint, qualifiedName);
		IReserva stub = service.getPort(IReserva.class);
		
		//Manipula os dados
		/*
			while (true) {
				System.out.print("\n\n-- Sistema de Reserva de Hotel --");
				System.out.print("\n1 - Reservar Quarto \n2 - Listar Quartos Disponíveis \n3 - Sair");
				System.out.print("\n\nEscolha uma opção: ");
				
				try {
					op = input.next();
					
					//Primeira conexão e Reconexão
					if (!conexao) {
						stub = (IReserva) Naming.lookup("rmi://localhost/ReservaHotel");
					}
					
					switch (op) {
						case "1": // Reserva
							System.out.print("\nDigite o tipo do quarto: ");
							tipo_quarto = input.nextInt();
							
							System.out.print("\nDigite o nome do cliente: ");
							nome_cliente = input.next();
							
							status = stub.reservarQuarto(tipo_quarto, nome_cliente);
							
							if (status) {
								System.out.print("\nQuarto reservado com sucesso para " + nome_cliente + ".\n");
								
								ArrayList<ArrayList<Quarto>> q = stub.listarQuartosDisponiveis();
								
								for (int i = 0; i < 5; i++) {
									System.out.print("\nQuarto do tipo "+ (i+1) +" - vagas: "+ q.get(i).size() +" preço: "+ q.get(i).get(0).getPreco_diaria() +".");
								}
							} else {
								System.out.print("\nTipo de quarto indisponível. \n");
							}
							
							break;
						case "2": // Listar
							ArrayList<ArrayList<Quarto>> quartos = stub.listarQuartosDisponiveis();
							
							for (int i = 0; i < 5; i++) {
								System.out.print("\nQuarto do tipo "+ (i+1) +" - vagas: "+ quartos.get(i).size() +" preço: "+ quartos.get(i).get(0).getPreco_diaria() +".");
							}
							
							break;
						case "3":	// Sair
							System.out.print("\nO programa será encerrado.");
							
							return;
						default:
							System.out.println("\nOpção inválida. Por favor, tente novamente.");
					}
				} catch (ConnectException e) {
					System.out.print("\nErro: Conexão perdida com o servidor, tente novamente.");
					conexao = false;
				} catch (InputMismatchException e) {
					System.out.print("\nErro: Formato da entrada inválido, tente novamente.");
					input.next();
				}
			}
		*/
	}
}
