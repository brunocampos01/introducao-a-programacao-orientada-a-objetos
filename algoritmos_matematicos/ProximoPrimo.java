public class ProximoPrimo {
    public static void main(String[] args) {
        System.out.println(proximoPrimo(7));
    }
    public static int proximoPrimo(int n){
        int cont = 0;
        boolean primo;
        n = n +1;
        
        //estrutura de selecao
		for(int i=2; i<=n-1 ; i++) {
			if(n%i==0) {
				n = n+1;
			}
		}
		return n;
    }
}
