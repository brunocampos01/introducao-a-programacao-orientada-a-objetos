//exemplo pg 194
public class InicializadorArray {
	public static void main(String[] args) {
		
		//lista inicializadora
		int [] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; 
		//o array nasce com 10 indices e todos preenchidos
		
		System.out.printf(" %s%8s\n", "�ndice", "valores"); // titulo das colunas
		
		//percorre o array
		for(int contador=0; contador < array.length; contador ++){
			System.out.printf("%5d%8d\n", contador, array[contador]);
		}
	}
}
