package GameCraps;
public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckofCards meuBaralho = new DeckofCards();
		meuBaralho.shuffle();
		
		//imprime todas as cartas
		for (int i=1; i<=52; i++){
			System.out.printf(" %-19s" , meuBaralho.distribuiCards());
		
		if(i%6 ==0)//4 colunas de cartas
			System.out.println();
		}
	}
}
