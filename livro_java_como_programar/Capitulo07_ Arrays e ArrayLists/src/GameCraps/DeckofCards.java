package GameCraps;
import java.util.Random;
public class DeckofCards {
	// atributos
	private Card [] deck; //deck - baralho
	private int indiceCard; //indice do prox Card a ser distribuido
	private static final int NUMBER_OF_CARDS = 52; //numeros de cartas
	
	//gerador de cartas
	private static final Random randomNumbers = new Random();
	
	//construtor do baralho de cartas
	public DeckofCards (){
		String[] faces = {" ace" , " deuce" , " three" , " four" , " five" , " six" , " seven" , " eight" , " nine" , " ten" ," jack" , " queen" , " king" };
		String [] naipes = {" ouro" ," copas" ," paus" ," espadas" };
		
		deck = new Card[NUMBER_OF_CARDS]; //cria um array de card com 52
		indiceCard = 0; // a primeira card criada ficara no array de indice 0
		
		//preenche o baralho com objeto card
		for (int contador=1; contador<deck.length; contador++)
			deck [contador]= new Card(faces[contador%13], naipes[contador/13]); 
		//temos 13 faces: 1/13 tem resto 8=¨seven¨ 
		//4 naipes 52/13=4; 26/13=2; 13/13=1...
	}
	//embaralhador de cards
	public void shuffle(){
		//depois de embaralhar a distribuicao de cartas comeca pelo no indice 0
		indiceCard = 0;
		
		//compara cada card
		for(int first=0; first<deck.length; first++)
		{
			
			//seleciona um numeros entre 0 e 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			//compara card atual com card aleatoria
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	//distribui um card
	public Card distribuiCards(){
		//determina se ha cartas a serem distribuidas
		if(indiceCard <deck.length)
			return deck[indiceCard++];
		else
			return null;
	}
}
