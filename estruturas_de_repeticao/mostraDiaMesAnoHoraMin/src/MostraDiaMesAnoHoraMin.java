import java.util.Calendar;

public class MostraDiaMesAnoHoraMin {
public static void main(String[] nomeDaVariavel) {

     int dia, mes, ano , hora, min;
     Calendar c = Calendar.getInstance();
     dia = c.get(Calendar.DAY_OF_MONTH);
     mes = c.get(Calendar.MONTH) + 1;
     ano = c.get(Calendar.YEAR);
     
     System.out.println("Data Atual: "+dia+"/"+mes+"/"+ano);
     
     hora = c.get(Calendar.HOUR);
     min = c.get(Calendar.MINUTE);
     
     System.out.println("Hora Atual: "+hora+":"+min);
     
     double numero = Math.random()*100;
     System.out.println(numero);
     

    }
}