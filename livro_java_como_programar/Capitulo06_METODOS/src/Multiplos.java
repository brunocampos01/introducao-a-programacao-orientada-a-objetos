//6.16
public class Multiplos {
	public static void main(String[] args) {
		System.out.println(isMultiple(5,30));		
		}
		static boolean isMultiple(int valor1, int valor2){
			if(valor1%valor2 == 0 || valor2%valor1 == 0){
				return true;
			}
			return false;
	}

}
