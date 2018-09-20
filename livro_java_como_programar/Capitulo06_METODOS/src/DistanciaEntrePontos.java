public class DistanciaEntrePontos {
	public static void main(String[] args) {
		//teste
		System.out.println(distance(2,3,4,5));
	}
	public static double distance(double x1, double y1, double x2, double y2){
		double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		return d;
	}

}
