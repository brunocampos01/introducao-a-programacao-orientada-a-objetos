public class ProgramaImpressaoGraficoDeBarras {
	public static void main(String[] args) {
		
		int numero = geradorNumeros();
		System.out.println(numero);

		for (int i=1; i<=numero; i++){
			System.out.print("*");
		}

	}
	public static int geradorNumeros (){
		int gerador = (int) (Math.random()*10);
		return gerador;
	}

}
