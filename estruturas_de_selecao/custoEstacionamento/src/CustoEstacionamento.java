public class CustoEstacionamento {
    public static void main(String[] args) {
    	//testes
        System.out.println(custoEstacionamento(6, 30, 23, 0));
    }
    
    public static double custoEstacionamento(int horaEntrada, 
    		int minutoEntrada, int horaSaida, int minutoSaida){
        
    	//variaveis de escopo
    	double totalPagar;
        double totalMinutos;
        double horaExtra;
        totalMinutos = (horaSaida*60 + minutoSaida) - (horaEntrada*60 + minutoEntrada);
        
        if (totalMinutos <= 180){
            totalPagar = 2;
        }else {
            totalPagar = 2 + (horaSaida - horaEntrada - 3)*0.5;
            if(totalPagar > 8) {
		totalPagar = 8;
            }
        }
        return totalPagar;
    }
}
