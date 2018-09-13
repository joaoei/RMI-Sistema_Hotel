/*
 ===============================================================================
 ARQUIVO............: Cliente.java
 DESCRICAO..........: Codigo-fonte correspondente a implementacao do cliente,
 					  fazendo invocao de metodos remotos disponibilizados no
 					  servidor. 
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package padrao;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.rmi.ConnectException;

public class Cliente {

	public static void main(String[] args) throws RemoteException, 
	NotBoundException, MalformedURLException, ConnectException {
		IReserva stub = null;
		
		Scanner input = new Scanner(System.in);
		int op = 0;
		int tipo_quarto;
		String nome_cliente;
		boolean status;
		boolean conexao = false;
		
		
			while (true) {
				System.out.print("\n\nSistema de Reserva de Hotel");
				System.out.print("\n1 - Reservar Quarto \n2 - Listar Quartos Disponiveis \n3 - Sair");
				System.out.print("\n\nEscolha uma opcao: ");
				
				try {
					op = input.nextInt();
					
					//Primeira conexão e Reconexão
					if (!conexao) {
						stub = (IReserva) Naming.lookup("rmi://localhost/ReservaHotel");
					}
					
					switch (op) {
						case 1: // Reserva
							System.out.print("\nDigite o tipo do quarto: ");
							tipo_quarto = input.nextInt();
							
							System.out.print("\nDigite o nome do cliente: ");
							nome_cliente = input.next();
							
							status = stub.reservarQuarto(tipo_quarto, nome_cliente);
							
							if (status) {
								System.out.print("\nQuarto reservado com sucesso para " + nome_cliente + "\n");
							} else {
								System.out.print("\nTipo de quarto indisponivel \n");
							}
							
							System.out.print(stub.listarQuartosDisponiveis());
							break;
						case 2: // Listar
							System.out.print(stub.listarQuartosDisponiveis());
							
							break;
						case 3:	// Sair
							System.out.println("O programa sera encerrado.");
							
							return;
						default:
							System.out.println("Opcao invalida. Por favor, tente novamente.");
					}
				} catch (ConnectException e) {
					System.out.println("Erro: Conexão perdida com o servidor, tente novamente.");
					conexao = false;
				}
			}
	}
}
