package formatacaodedatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatacaoDeDatas {

    public static void main(String[] args) throws ParseException {
        
        Calendar c = Calendar.getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        Date data = c.getTime();
        System.out.println(data);
        //FORMATACAO DE DATAS
        DateFormat f = DateFormat.getDateInstance();
        System.out.println(f.format(data));
        //FORMATACAO DE HORARIO
        f = DateFormat.getTimeInstance();
        System.out.println(f.format(data));
        //FORMATACAO DE DATA E HORA
        f = DateFormat.getDateTimeInstance();
        System.out.println(f.format(data));
        //ESTILOS
        f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(data));
        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(f.format(data));
        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(f.format(data));
        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(f.format(data));
        
        Date data2 = f.parse("12/02/1980");
        System.out.println(data2);
        
        //VER DOCUMENTACAO PRA VER O QUE CADA LETRA SIGNIFICA
        //EXITE MUITAS OUTRAS
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(data));
        System.out.println(sdf.parse("10/10/2010"));
    }
}
