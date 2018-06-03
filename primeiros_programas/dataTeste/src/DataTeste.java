/*
Acrescente a implementac¸ao de um m ˜ etodo que incremente em um dia a data representada pela ´
instancia ˆ
– Acrescente a implementac¸ao de um m ˜ etodo que retorne o dia da semana (por extenso) correspon- ´
dente a data representada pelo objeto. O numero do dia da semana ( ´ Nd) de uma data pode ser
determinado por:
Nd = (I + D + U + U/4 + P/4 − 2 ∗ P)%7
onde:
∗ I = parte inteira de (2.6 ∗ M − 0.1)
∗ M = deve representar o numero do m ´ es; deve ser tomado como 1 se m ˆ es for marc¸o, 2 se o ˆ
mes for abril e assim por diante at ˆ e 10 para o m ´ es de dezembro; caso a data tenha como m ˆ esˆ
janeiro ou fevereiro, esta deve ser tomada respectivamente como novembro ou dezembro do
ano anterior; assim, se a data for 25/2/2005, para efeitos de calculos, deve ser tomada a data ´
de 25/12/2004
∗ D = dia do mesˆ
∗ U = numero formado pelos dois ´ ultimos algarismos do ano ´
∗ P = numero formado pelos dois primeiros algarismos do ano ´
Os dias da semana sao numerados de 0 a 6, sendo que 0 corresponde a domingo, 1 corresponde a ˜
segunda-feira e assim por diante.
 */
class Data {
    
    protected int dia;
    protected int mes;
    protected int ano;
    
    public Data(int vDia, int vMes, int vAno) {
        dia = vDia;
        if (dia < 1)
            dia = 1;
        else
            if (dia > 31)
                dia = 31;
        mes = vMes;
        if (mes < 1)
            mes = 1;
        else
            if (mes > 12)
                mes = 12;
        ano = vAno;
        if (ano < 1950)
            ano = 1950;
        this.ajusteDia(); //o vlor do dia sera' ajustado em funcao do valor do mes e ano
    }

    public void ajusteDia() {
        switch(mes) {
            case 2: if (dia >= 28)
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
                    dia = 29;
                else
                    dia = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11: if (dia == 31)
                dia = 30;
        }
    }

    public int informeDia() {
        return dia;
    }
    public int informeMes() {
        return mes;
    }
    public int informeAno() {
        return ano;
    }
    
    public String fornecaMesExtenso() {
        switch(mes) {
            case 1 : return "Janeiro";
            case 2 : return "Fevereiro";
            case 3 : return "Marco";
            case 4 : return "Abril";
            case 5 : return "Maio";
            case 6 : return "Junho";
            case 7 : return "Julho";
            case 8 : return "Agosto";
            case 9 : return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mes invalido";
        }
        
        public boolean e_Maior_Igual(Data outra) {
            return  (ano  > outra.ano) ||
                    (ano == outra.ano) && (mes  > outra.mes) ||
                    (ano == outra.ano) && (mes == outra.mes) && (dia >= outra.dia);
        }
    }
}


public class dataTeste {

    public static void main(String[] args) {
        Data d = new Data(24, 9, 2014);
        System.out.println(d.informeDia() + "/" + d.informeMes() + "/" + d.informeAno());
    }
    
}