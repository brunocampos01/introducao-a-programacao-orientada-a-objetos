//6.15

public class CalculosDaHipotenusa {

	public static void main(String[] args) {
		System.out.println(hipotenuse(3,4));
		System.out.println(hipotenuse(5,12));
		System.out.println(hipotenuse(8,15));

	}
	static double hipotenuse(double side1,double side2){
		double hipotenusa = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2));
		return hipotenusa;
	}

}
