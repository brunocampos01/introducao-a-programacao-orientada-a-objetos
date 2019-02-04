import java.util.*;

public class Idade {
    public static void main(String[] args) {
    	//testes
        System.out.println ( idade (2, 7, 1990));
    }
    
    public static int idade(int diaNasc, int mesNasc, int anoNasc) {
        // data atual - data nasc = idade
        int idade = 0;
        Calendar hoje = Calendar.getInstance();
        int dia = hoje.get(Calendar.DAY_OF_MONTH );
        int mes = hoje.get(Calendar.MONTH) + 1;
        int ano = hoje.get(Calendar.YEAR);
        
        System.out.println( "Hoje = " + dia + "/" + mes + "/" + ano);
        idade = ano - anoNasc;
        
        //calcula idade
        if (mes < mesNasc){
            return -- idade;
        }else{
            return idade;
                }
    }
}
