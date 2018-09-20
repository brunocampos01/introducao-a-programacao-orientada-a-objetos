public class OrdencaoPesquisaComparacao {
	
	//atributos
	double[] arrayDeDoubles = {8.4, 9.3, 0.2, 7.9, 3.4};
	double[] arrayDeDoubles2 = {8.4, 9.3, 0.2, 7.9, 3.4};
	
	//ORDENAÇÃO (sort)
	Arrays.sort(arrayDeDoubles);
	Arrays.sort(arrayDeDoubles2);
	
	//imprime array com forech
	for(double valor: arrayDeDoubles)
		System.out.printf("%.1f ", valor);
		System.out.println(" ");
		
		
	//Pesquisa um valor no array
	int resultadoPesquisa = Arrays.binarySearch(arrayDeDoubles, 8.4);
	if(resultadoPesquisa >= 0)
		System.out.println("Encontrado na posicão (començando no indice 0): "+resultadoPesquisa);
	else
		System.out.println("Não encontrado.");
				
	
	//Compara 2 arrays
	boolean comparador = Arrays.equals(arrayDeDoubles, arrayDeDoubles2);
	System.out.println(comparador);

	if(comparador == true)
		System.out.println("arrayDeDoubles == arrayDeDoubles2");
	else
		System.out.println("arrayDeDoubles É DIFERENTE arrayDeDoubles2");
}
