
public class FrequenciaDeRespostas {
	public static void main(String[] args) {
		//atributos - arrays
		int [] respostas = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
		int [] frequencia = new int[11];
		
		//percorre o array respostas (20 elementos)
		//pega cada resposta e armazena no indice do array frequencia
		for(int x=0; x<respostas.length; x++)
			++frequencia[respostas[x]];
			System.out.printf("%s%20s\n", "taxa", "frequencia");
		
		//imprime a frequencia
		//eh aqui q o elemento 0 di array frequencia eh ignorado
		for(int taxa=1; taxa < frequencia.length; taxa++)
			System.out.printf("%d%20d\n", taxa,frequencia[taxa]);
	}
}
