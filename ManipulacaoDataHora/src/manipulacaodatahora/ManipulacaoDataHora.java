package manipulacaodatahora;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDataHora {

    public static void main(String[] args) {
        
        //AS DATAS SAO REPRESENTADAS POR OBJETOS Date
        //E MANIPULADA POR OBJETOS Calendar
        //EM JAVA TODO TEMPO E REPRESENTADO EM 
        //MILISEGUNDO COM O TIPO long, TEMPO
        //ZERO EM JAVA 01 DE JAN DE 1970
        System.out.println(System.currentTimeMillis());
        
        Date dataAtual = new Date();
        System.out.println(dataAtual);
        
        Date dataApartir = new Date(1_000_000_000_000L);
        System.out.println(dataApartir);
        
        //METODOS
        //RETORNA A QUANTIDADE DE MILISEGUNDO DAQUELE TEMPO
        System.out.println(dataApartir.getTime());
        //DEFINIR OS MILISEGUNDOS
        dataApartir.setTime(1_000_000_000_000L);
        System.out.println(dataApartir.compareTo(dataAtual));
        
        Calendar c = Calendar.getInstance();
        //OU
        //new GregorianCalendar();
        c.set(1980,Calendar.FEBRUARY,12);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        c.set(Calendar.YEAR,1979);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.MONTH));
        c.set(Calendar.MONTH,3);
        System.out.println(c.get(Calendar.MONTH));
        c.set(Calendar.MONTH,Calendar.AUGUST);
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        c.clear(Calendar.HOUR_OF_DAY);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -6);
        System.out.println(c.getTime());
        
        //METODO rool FUNCIONA DE FORMA SEMELHANTE AO add 
        //SO QUE O add ADICIONA E QUANDO O NUMEROS ESTOURA 
        //A QTDE DE DIAS E MUDA O MES E CONTINUA CONTADO
        //O rool NAO MUDA O MES E FICA CONTANDO DENTRO DELE 
        //SEM QUEBRA O LIMITE DE DIAS DO MES, LOGICO
        c.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.getTime());
        
    }
}
