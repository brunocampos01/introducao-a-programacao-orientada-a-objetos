import java.util.ArrayList;

//ex pg 222
public class ClasseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		
		//acrescenta elemento
		itens.add("vermelho");
		
		//acrescenta elemento em um local especifico
		itens.add(0,"azul");
		
		//imprimi o arrayList
		for(int i=0; i<itens.size(); i++){
			System.out.println(itens.get(i));
		}
		
		//imprimi a quantidadde de elementos
		System.out.println(itens.size());
		
		//remove elementos
		itens.remove(1);
	}
}
