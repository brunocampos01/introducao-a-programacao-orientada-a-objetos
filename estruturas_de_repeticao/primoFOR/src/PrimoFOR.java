/*3 Verificar se número é primo

Verificar se um número é primo ou não:

public static boolean ehPrimo(int numero)*/
import java.util.Calendar;

public class PrimoFOR {
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
     
     System.out.println(1+2+3+"teste");
     System.out.println("teste"+1+2+3);
     
     int a= 1;
     int b = 5;
     System.out.println(a/(double)b);
     //casting
     

     
     System.out.println((a));
     
     double nota =  Math.random();
     System.out.println(nota >= 0.5 ? "arpovado" : "reprovado");
     
     a = 10;
     int j = ++a + a--;
     System.out.println(j);
     
     
     String v ="     Bruno Moura     ";
     
     System.out.println(v.length()); // comprimento
     System.out.println(v.charAt(0));
     System.out.println(v.substring(6,8));
     System.out.println(v.replaceAll("Bruno", "Campos"));
     System.out.println(v.trim( ));
     System.out.println(v.contains("Bruno"));
     System.out.println(v.contains("bruno"));
 }
 
}

