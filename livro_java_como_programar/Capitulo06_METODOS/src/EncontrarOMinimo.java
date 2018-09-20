//6.23
public class EncontrarOMinimo {
	public static void main(String[] args) {
		//teste
		System.out.println(minumum3(5,45872,300));
	}
	
	public static float minumum3(float n1, float n2, float n3){
		float menor;
		if (n1<n2 && n1<n3){
			return menor = n1;
		}else
			if (n2<n1 && n2<n3){
				return menor = n2;
			}else{
				return menor = n3;
			}
	}

}
