//exmplo pg 212 eh o mesmo caderno de notas sendo com provas do semestre inteiro

package Gradebook;

public class GradeBookBidimensional {

	private String nomeDoCurso;
	private int[][]grades; //notas
	
	//metodos
	
	//construtor
	public GradeBookBidimensional (String nome, int[][] arrayNotas){
		//inicializa as variaveis		
		nomeDoCurso = nome;			
		grades = arrayNotas;
	}
	//configura o nome do curso
	public void setnomeDoCurso(String name){
		nomeDoCurso = name;
	}
	//obtem o nome do curso
	public String getnomeDoCurso(){
		return nomeDoCurso;
	}
	//exibe mensagem inicial
	public void displayMenssage(){
		System.out.printf("Bem vindo ao %s! \n\n", getnomeDoCurso());
	}
	
	public void processGrades(){
		outputGrades();
		//calcula a media da turma
		//System.out.printf("\nA nota média é: %5f\n", getAverage());
		//chama o metodo com a maior e menor nota
		System.out.printf("Lower grade is %d\nHighest grade is %d\n\n",getMinimum(), getMaximum());
		//chama o metodo para gerar um grafico
		outputBarChart();
	}
	
	public int getMinimum(){
		int lowGrade = grades[0][0]; //assume lowgrade como 0
		
		//percorre o array notas
		// loop pelas linha do array de notas grades
		for(int[] studentGrades: grades){
			
			//loop pelas colunas da linha atual
			for(int grade : studentGrades){
				if (grade< lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}
	public int getMaximum(){
		int highGrade = grades[0][0]; //assume highGrade como 0
		
		//percorre o array notas
		for(int[] studentGrades: grades){
			
			//loop pelas colunas da linha atual
			for(int grade : studentGrades){
				if (grade> highGrade)
					highGrade = grade;
			}
		}
		return highGrade;
	}
	
	//determina media
	public double getAverage(int[] setOfGrades){
		int total=0;
		//soma todas as notas
		for(int grade: setOfGrades)
			total += grade;
		return (double) total/setOfGrades.length;
	}
	
	//gera saida em grafico
	public void outputBarChart(){
		System.out.println("overall de notas"); 
		
		//array armazena a frequencia de notas
		int[] frequency = new int[11];
		
		//incrementa para cada nota que se repetiu
		for(int[] studentsGrades : grades)
		{
			for(int grade : studentsGrades)
				++frequency[grade/10];    //por ex, se aqui for grade=85 ele incrmenta em frequency=8
		}
			
		for(int contador=0; contador<frequency.length; contador++){
			//monta os rotulos
			if(contador==10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf(" %02d-%02d ", contador*10, contador*10+9);
			
			//imprime barrras em asteriscos
			for(int stars=0; stars<frequency[contador]; stars ++)
				System.out.print("*");
			System.out.println();
			

				
		}
	}
	//gera as notas de cada aluno
	public void outputGrades(){
		
		System.out.println("As notas são:\n");
		System.out.print("                "); //alinha titulos de coluna
		
		//cria titulo para cada coluna
		for(int test=0; test<grades[0].length; test++)
			System.out.printf("Test %d  ", test + 1);
			System.out.println("média ´averange´");
		
		// cria linha e colunas para notas do array
		for(int student=0; student<grades.length; student++)
		{
			System.out.printf(" Student %2d: ", student + 1);
		
			for(int test : grades[student])
				System.out.printf("%8d", test);
			
			//chama metodo p calcular a average
			double average = getAverage( grades[student]);
			System.out.printf("%9.2f\n", average);
		}
	}
}
