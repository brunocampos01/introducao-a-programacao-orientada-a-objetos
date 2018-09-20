package GameCraps;
//exmplo pg 199
public class Card {
	
	//atributos
	 private String face; //ace, key...
	 private String naipe; // ouro, copas...
	
	//Métodos
	
	//construtor
	//serve para que outra classe consigam acessar as variaveis da classe Card
	public Card(String cardFace, String cardNaipe){
		face = cardFace; // inicializa face da carta
		naipe = cardNaipe; // inicializa naipe da carta
	}
	
	//retorna a carta
	public String toString()
	{
		return face + " de"  +naipe;
	}
}
