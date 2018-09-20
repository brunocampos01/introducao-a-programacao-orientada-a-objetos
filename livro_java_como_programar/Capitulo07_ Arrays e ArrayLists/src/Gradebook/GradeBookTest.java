package Gradebook;

public class GradeBookTest {

	public static void main(String[] args) {
		int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};
		
		GradeBook meuGradeBook = new GradeBook (" Projeto - dando a volta por cima", gradesArray);
		
		meuGradeBook.displayMenssage();
		meuGradeBook.processGrades();
	}

}
