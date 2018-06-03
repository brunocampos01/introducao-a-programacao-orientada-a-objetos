//declaracao da classe e tipo de retorno
import java.util.Scanner;

public class AumentoSalarioWHILE {
    public static void main(String[] args) {
        
//declaracao de variaveis
        
        int i, anoA;
        double porcentagem, salario0, novoSal;
        Scanner entrada = new Scanner(System.in);
        
// atribuicoes
        i = 2007;
        salario0 = 1000;
        porcentagem = 0.015;
        novoSal = salario0 + porcentagem*salario0;
        System.out.println("digite o ano:");
        anoA = entrada.nextInt();
        
//estrutura de repeticao
        while(i<=anoA)
        {
            porcentagem *= 2;
            novoSal += porcentagem*novoSal;
            i++;
        }
        System.out.println("o novo salario é:"+novoSal);
    }
    
}
