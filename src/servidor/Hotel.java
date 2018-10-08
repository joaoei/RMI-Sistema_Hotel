package servidor;

import java.util.ArrayList;

public class Hotel {

	private int quantidade_quartos;
	private ArrayList<ArrayList<Quarto>> quartos = new ArrayList<ArrayList<Quarto>>();
	
	// os três pontos serve para dizer que o tamanho das variáveis é flexível, podem ser 1 ou 1 milhão de tipos e precos, sendo par a par, 1
	// preco 1 tipo. 2 preco 2 tipo e assim sucessivamente

	public Hotel() { 
		super();
		
	}
}
