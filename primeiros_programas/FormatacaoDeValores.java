public class FormatacaoDeValores {        
        public static void main(String[] args) {
        	//variaveis
            String nome = "50.9";
            int idade = 23;
            double peso = 85.840428;
            
            double c = Double.parseDouble(nome);
            System.out.println(c);
            System.out.printf("O %1$s tem %2$d anos e pesa %3$f kg\n", nome, idade, peso);
        }
    
}
