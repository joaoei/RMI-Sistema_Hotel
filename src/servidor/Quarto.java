/*
 ===============================================================================
 ARQUIVO............: Quarto.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao da classe Quarto  
 					  que representa os tipos de quartos disponíveis no Hotel
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package servidor;

import java.io.Serializable;

public class Quarto implements Serializable {

	private boolean vago;
	private String nome_cliente;
	private double preco_diaria;
	
	public Quarto(double preco_diaria) {
		this.vago = true;
		this.nome_cliente = "";
		this.preco_diaria = preco_diaria;
	}

	public void reservarQuarto(String nome_cliente) {
		this.nome_cliente = nome_cliente;
		vago = false;
	}

	public boolean isVago() {
		return vago;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public double getPreco_diaria() {
		return preco_diaria;
	}
}
