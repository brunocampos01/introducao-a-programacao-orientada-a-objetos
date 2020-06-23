import java.util.Calendar;

public class MostraDiaMesAnoHoraMin {
    public static void main(String[] nomeDaVariavel) {
        //variaveis (atributos)
        int dia, mes, ano, hora, min;
        Calendar c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH) + 1;
        ano = c.get(Calendar.YEAR);
        hora = c.get(Calendar.HOUR);
        min = c.get(Calendar.MINUTE);
        System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano);
        System.out.println("Hora Atual: " + hora + ":" + min);
    }
}