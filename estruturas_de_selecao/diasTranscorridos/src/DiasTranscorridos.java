import java.util.Calendar;

public class DiasTranscorridos {
    private static int mes;
    public static void main(String[] args) {
      System.out.println(diasTranscorridosAteHojeNoAno(5));
    }
    public static int diasTranscorridosAteHojeNoAno(int diasTranscorridosAteHojeNoAno)
    {
        Calendar hoje = Calendar.getInstance();
	int diaA = hoje.get(Calendar.DAY_OF_MONTH );
	int mesA = hoje.get(Calendar.MONTH) + 1;
	int anoA = hoje.get(Calendar.YEAR);
        
        // Avalia o valor da variável mes para escrever o mêiasTras equivalente
   switch(mes)
    { case 1: 
    	diasTranscorridosAteHojeNoAno = 30;
	    break;
       case 2: 
       	diasTranscorridosAteHojeNoAno = 60;
	    break;
       case 3: 
       	diasTranscorridosAteHojeNoAno = 90;
	    break;
       case 4: 
       	diasTranscorridosAteHojeNoAno = 120;
	    break;
       case 5: 
       	diasTranscorridosAteHojeNoAno = 150;
	    break;
        }
        return diasTranscorridosAteHojeNoAno;
    }
    
    
}
