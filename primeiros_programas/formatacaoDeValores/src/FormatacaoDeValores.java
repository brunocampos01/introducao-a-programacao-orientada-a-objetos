public class FormatacaoDeValores {
    public static void main(String[] args) {
        
        String nome = "50";
        int idade = 23;
        double peso = 85.840428;
        
        System.out.printf("o %1$s tem %2$d anos e pesa %3$f kg\n", nome, idade, peso);
        
        int c = Integer.parseInt(nome);
        System.out.println(c);
    }
    
}
