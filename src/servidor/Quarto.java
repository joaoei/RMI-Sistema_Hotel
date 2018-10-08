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
	private String tipo;
	private double preco_diaria;
	
	public Quarto(String tipo, double preco_diaria) {
		this.vago = true;
		this.tipo = tipo;
		this.preco_diaria = preco_diaria;
	}

	public boolean isVago() {
		return vago;
	}

	public String getTipo() {
		return tipo;
	}

	public double getPreco_diaria() {
		return preco_diaria;
	}

	public void setVago(boolean vago) {
		this.vago = vago;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void getPreco_diaria(double preco_diaria) {
		this.preco_diaria = preco_diaria;
	}
}
