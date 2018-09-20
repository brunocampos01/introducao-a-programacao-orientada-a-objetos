// exemplo da pg 168
import java.util.Random;

public class Craps {
	
	//atributos
	private static final Random randomNumbers = new Random();
	
	// status do jogo
	private enum Status {CONTINUE, WOW, LOST};
	
	// resultados dos lançamentos dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	//comeca a partida
	public void play(){
		int pontuacaoacumulada = 0;
		Status gameStatus;
	
		//primeira rodada
		int rodada = rollDice();
		
		switch(rodada){
		
		//ganha
		case SEVEN: // ganha com 7 na primeira jogada
		case YO_LEVEN: // ganha com 11 na prmeira jogada
			gameStatus = Status.WOW;
			break;
		
			//perde
		case SNAKE_EYES: //2 perde - na primeira rodada
		case TREY: //3 perde - na primeira rodada
		case BOX_CARS: // 12 perde - na primeira rodada
			gameStatus = Status.LOST;
			break;
		
		//continua
		default: // continue - registra a pontuaçao
			gameStatus = Status.CONTINUE;
			pontuacaoacumulada = rodada;
			System.out.println("Minha pontuacao eh: " +rodada);
			break;
		}
		
		while (gameStatus == Status.CONTINUE){
			rodada = rollDice();
			
			//determina o status apos a nova rodada
			if(rodada == pontuacaoacumulada){
				gameStatus = Status.WOW;
			}else if(rodada == SEVEN) //somou 7 perdeu
					gameStatus = Status.LOST;
		}
		//mensagem de ganha ou perde
		if(gameStatus == Status.WOW)
			System.out.println("WINNER");
		else
			System.out.println("LOST");
	}
		public int rollDice() {
			int die01 = 1 + randomNumbers.nextInt(6);
			int die02 = 1 + randomNumbers.nextInt(6);
			int soma = die01 +die02;
			
			//imprime resultado do lançamento
			System.out.println("dados 01 e 02: " +die01+ ", " +die02);
			System.out.println("soma " +soma);
			
			return soma;
	}
}
