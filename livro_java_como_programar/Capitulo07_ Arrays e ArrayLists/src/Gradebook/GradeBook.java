package Gradebook;

public class GradeBook {
	private String nomeDoCurso;
	private int[]grades; //notas
	
	//metodos
	
	//construtor
	public GradeBook (String nome, int[] arrayNotas){
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
		System.out.printf("\nA nota média é: %5f\n", getAverage());
		//chama o metodo com a maior e menor nota
		System.out.printf("Lower grade is %d\nHighest grade is %d\n\n",getMinimum(), getMaximum());
		//chama o metodo para gerar um grafico
		outputBarChart();
	}
	
	public int getMinimum(){
		int lowGrade = grades[0]; //assume lowgrade como 0
		
		//percorre o array notas
		for(int grade: grades){
			if (grade< lowGrade)
				lowGrade = grade;
		}
		return lowGrade;
	}
	public int getMaximum(){
		int highGrade = grades[0]; //assume highGrade como 0
		
		//percorre o array notas
		for(int grade: grades){
			if (grade> highGrade)
				highGrade = grade;
		}
		return highGrade;
	}
	
	//determina media
	public double getAverage(){
		int total=0;
		//soma todas as notas
		for(int grade: grades)
			total += grade;
		return (double) total/grades.length;
	}
	//gera saida em grafico
	public void outputBarChart(){
		System.out.println("Distribuicao de notas"); 
		
		//array armazena a frequencia de notas
		int[] frequency = new int[11];
		
		//incrementa para cada nota que se repetiu
		for(int grade: grades)
			++frequency[grade/10];    //????
		
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
		System.out.println(" As notas sao: \n");
		
		for(int student=0; student<grades.length;student++)
			System.out.printf(" Student %2d: %3d\n",student + 1, grades [student]);
	}
}
