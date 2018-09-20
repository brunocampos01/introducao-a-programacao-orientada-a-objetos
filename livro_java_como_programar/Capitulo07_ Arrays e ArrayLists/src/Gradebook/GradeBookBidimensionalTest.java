package Gradebook;

public class GradeBookBidimensionalTest {

	public static void main(String[] args) {
		int[][] gradesArray = {{ 87, 96, 70}, { 68, 87, 90}, {94,100,100}, {100, 81, 82}, {78, 87,65}, {85, 75, 83}, {91, 94, 100},{87, 93, 73}};
		
		GradeBookBidimensional myGradeBookBidimensional = new GradeBookBidimensional("Bem vindo ao curso java", gradesArray);
		myGradeBookBidimensional.displayMenssage();
		myGradeBookBidimensional.processGrades();
	}

}
