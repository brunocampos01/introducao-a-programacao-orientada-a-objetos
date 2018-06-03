public class PremioSeguro {
    public static void main(String[] args)
    {
     System.out.println(premio(Math.random()*100, 'a', true, true));
     System.out.println(premio(10000, 'b', true, true));
     System.out.println(premio(10000, 'c', true, false));
    }
    public static double premio(double valorVeiculo, char classeDesconto, boolean ehCarroNacional, boolean temMais24Anos)
    {
        double valorPremio = 0;
        
        System.out.println("O valor do veiculo é:" +valorVeiculo);
        if(temMais24Anos == true){
                if(ehCarroNacional == true){
                    if(classeDesconto =='a'){
                    valorPremio = valorVeiculo * 0.1 +valorVeiculo * 0.1 + valorVeiculo * 0.3;
                    }if(classeDesconto =='b'){
                    valorPremio = valorVeiculo * 0.1 +valorVeiculo * 0.1 + valorVeiculo * 0.2;
                    }if(classeDesconto =='c'){
                    valorPremio = valorVeiculo * 0.1 +valorVeiculo * 0.1 + valorVeiculo * 0.1;
                    }                
                }else {
                    if(classeDesconto =='a'){
                    valorPremio = valorVeiculo * 0.15 + valorVeiculo * 0.1 + valorVeiculo * 0.3;
                    }if(classeDesconto =='b'){
                    valorPremio = valorVeiculo * 0.15 + valorVeiculo * 0.1 + valorVeiculo * 0.2;
                    }if(classeDesconto =='c'){
                    valorPremio = valorVeiculo * 0.15 + valorVeiculo * 0.1 + valorVeiculo * 0.1;
                    }
                }
        }else{
                if(ehCarroNacional == true){
                    if(classeDesconto =='a'){
                    valorPremio = valorVeiculo * 0.1 + valorVeiculo * 0.3;
                    }if(classeDesconto =='b'){
                    valorPremio = valorVeiculo * 0.1  + valorVeiculo * 0.2;
                    }if(classeDesconto =='c'){
                    valorPremio = valorVeiculo * 0.1  + valorVeiculo * 0.1;
                }else {
                    if(classeDesconto =='a'){
                    valorPremio = valorVeiculo * 0.15  + valorVeiculo * 0.3;
                    }if(classeDesconto =='b'){
                    valorPremio = valorVeiculo * 0.15  + valorVeiculo * 0.2;
                    }if(classeDesconto =='c'){
                    valorPremio = valorVeiculo * 0.15 + valorVeiculo * 0.1;
                    }
                }
                }
        }
        return valorPremio;
    }
}
           
    
          
    
