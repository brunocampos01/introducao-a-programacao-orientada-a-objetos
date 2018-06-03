package matematicaBasica;

public class PorcentagemAumento {
	public static void main(String[] args) {
		
		//atributos
		double salario = RandomSalario();
		double aumento = salario*0.25;
		double novoSalario =  salario + aumento;
		
		System.out.println("Salário atual: " +salario);
		System.out.println("Salário com reajuste: " +novoSalario);
	}
	
		//métodos
		public static double RandomSalario(){
				double salarioMinimo = Math.random()*1000;
				return salarioMinimo;
		}

}
