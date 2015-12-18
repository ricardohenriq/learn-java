package internacionalizacaonumerosafins;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class InternacionalizacaoNumerosAfins {

    public static void main(String[] args) throws ParseException {
        
        double saldo = 123_456.789;
                
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.format(saldo));
        
        nf = NumberFormat.getIntegerInstance();
        System.out.println(nf.format(saldo));
        
        nf = NumberFormat.getPercentInstance();
        System.out.println(nf.format(0.25));
        
        nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(saldo));
        
        nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(saldo));

        //INTERNACIONALIZACAO
        nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(saldo));
        
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(saldo));
        
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(nf.format(saldo));
        
        nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.parse("R$ 1.105,25"));
        
        
        
    }
}
