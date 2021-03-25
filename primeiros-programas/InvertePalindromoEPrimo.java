/*
7. Crie uma classe para guardar um numero inteiro positivo ´ n com os seguintes metodos: ´
• inv(n): inverte a ordem dos d´ıgitos de n. Exemplo: inv(782) = 287.
• palindromo(n): verifica se n e ou n ´ ao pal ˜ ´ındromo, ou seja, se inv(n) == n. Exemplos de pal´ındromos:
34543, 1, 99.
• primo(n): verifica se n e primo, ou seja, que tem apenas dois divisores diferentes (1 e ele mesmo). ´
Exemplos de primos: 2, 3, 5, ..., 577, ..., 997.
 */
public class InvertePalindromoEPrimo {
    public static void main(String[] args) {
        System.out.println(inverteNumero(7631));
        System.out.println(palindromo(3113));
        System.out.println(primo(30));
    }

    // 1º método - inverteNumero
    public static int inverteNumero(int n) {
        int i = 0;

        while (n > 0) {
            i *= 10;
            i += (n % 10);
            n /= 10;
        }
        return i;
    }

    //2º método - palindromo
    public static boolean palindromo(int numero) {
        int milhar;
        int centena;
        int dezena;
        int unidade;
        int resto;

        milhar = numero / 1000;
        resto = numero % 1000;
        centena = resto / 100;
        resto = resto % 100;
        dezena = resto / 10;
        unidade = resto % 10;

        return milhar == unidade && centena == dezena;

    }

    //3º método - primo
    public static boolean primo(int x) {
        int cont = 0;
        for (int a = 1; a <= x; a++) {
            if (x % a == 0)
                cont++;
        }
        if (cont == 2) {
            return true;
        } else {
            return false;
        }
    }
}
