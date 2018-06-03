package matematicaBasica;

public class Questao17SalarioEmissaoCheques {
	
	//atributos
			static double salario = (int) recebimento();
			static double cheque1 = emissaoCheque();
			static double valorDoCheque;
			static double saldoAtual;

	public static void main(String[] args) {
		
		System.out.println("salario: " +salario);
		System.out.println("valorDoCheque: " +valorDoCheque);
		System.out.println("Saldo apos o 1 cheque : " +cheque1);
	}
	//metodos
	public static double recebimento(){
		double bufunfa = Math.random() * 1000;
		return bufunfa;	
	}
	
	public static double emissaoCheque(){
		valorDoCheque =  ((Math.random()*10)*1.0038) ;
		saldoAtual = (salario - valorDoCheque);
		return saldoAtual;
	}

}
