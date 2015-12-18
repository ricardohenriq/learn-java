package internacionalizacaodataafins;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class InternacionalizacaoDataAfins {

    public static void main(String[] args) {
        
        //Locale /LINGUA ISO 639 /PAIS ISO 3166
        Calendar c = Calendar.getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        Date data = c.getTime();
        
        Locale padrao = Locale.getDefault();
        System.out.println(padrao);
        Locale EUA = new Locale("en","US");
        Locale india = new Locale("hi","IN");
        Locale alemanha = Locale.GERMAN;
        
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(data));
        
        f = DateFormat.getDateInstance(DateFormat.FULL, EUA);
        System.out.println(f.format(data));
        
        f = DateFormat.getDateInstance(DateFormat.FULL, india);
        System.out.println(f.format(data));
        
        f = DateFormat.getDateInstance(DateFormat.FULL, alemanha);
        System.out.println(f.format(data));
    }
}
