/*
 ===============================================================================
 ARQUIVO............: Quarto.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao da classe Quarto  
 					  que representa os tipos de quartos disponíveis no Hotel
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package padrao;

public class Quarto {

	private int vagas;
	private int qtd_quartos_reservados;
	private double preco_diaria;
	
	public Quarto(int vagas, int qtd_quartos_reservados, double preco_diaria) {
		this.vagas = vagas;
		this.qtd_quartos_reservados = qtd_quartos_reservados;
		this.preco_diaria = preco_diaria;
	}

	public int getVagas() {
		return vagas;
	}

	public int getQtd_quartos_reservados() {
		return qtd_quartos_reservados;
	}

	public double getPreco_diaria() {
		return preco_diaria;
	}

	public void reservarQuarto() {
		this.qtd_quartos_reservados = this.qtd_quartos_reservados + 1;
	}
	
	public int getQuartosDisponiveis() {
		return getVagas() - getQtd_quartos_reservados();
	}
}
