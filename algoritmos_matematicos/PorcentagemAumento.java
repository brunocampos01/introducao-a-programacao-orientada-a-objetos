
public class PorcentagemAumento {
	public static void main(String[] args) {
		
		//atributos
		double salario = RandomSalario();
		double aumento = salario*0.25;
		double novoSalario =  salario + aumento;
		
		System.out.println("Sal�rio atual: " +salario);
		System.out.println("Sal�rio com reajuste: " +novoSalario);
	}
	
		//m�todos
		public static double RandomSalario(){
				double salarioMinimo = Math.random()*1000;
				return salarioMinimo;
		}

}
