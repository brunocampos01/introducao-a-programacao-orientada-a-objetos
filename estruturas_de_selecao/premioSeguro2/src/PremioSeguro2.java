public class PremioSeguro2 {
    public static void main(String[] args) {
       System.out.println(premio(18, 'm', 10000));
       System.out.println(premio(18, 'f', 10000));
       System.out.println(premio(30, 'm', 10000));
       System.out.println(premio(35, 'm', 10000));
    }
    public static double premio(int idade, char sexo, double valorVeiculo)
    {
        double valorPremio = 0; 
        if(sexo =='m'){
            if (idade <= 24){
                valorPremio = 0.1 * valorVeiculo;
            }else if (idade > 24 && idade <= 33){
                valorPremio = 0.1 * valorVeiculo + 0.1 * valorVeiculo;
            }else{
                valorPremio = 0.1 * valorVeiculo + 0.2 * valorVeiculo;
            }
        }else if (sexo =='f'){
            if (idade <= 24){
                valorPremio = 0.1 * valorVeiculo + 0.05 * valorVeiculo;
            }else if (idade > 24 && idade <= 33){
                valorPremio = 0.1 * valorVeiculo + 0.2 * valorVeiculo;
            }else{
                valorPremio = 0.1 * valorVeiculo + 0.35 * valorVeiculo;
            }
        }
        return valorPremio;
    }
}