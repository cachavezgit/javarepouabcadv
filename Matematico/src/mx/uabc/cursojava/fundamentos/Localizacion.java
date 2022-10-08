package mx.uabc.cursojava.fundamentos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Localizacion {
    public  static  void main (String args[]) {
        Locale locale = Locale.getDefault();

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayName());

        Locale localeSP = new Locale("es", "MX");
        System.out.println(localeSP.getLanguage());
        System.out.println(localeSP.getCountry());
        System.out.println(localeSP.getDisplayName());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dfSP = DateFormat.getDateInstance(DateFormat.FULL, localeSP);
        System.out.println(df.format(calendar.getTime()));
        System.out.println(dfSP.format(calendar.getTime()));

        DateFormat dfTime = DateFormat.getTimeInstance(DateFormat.FULL, locale);
        DateFormat dfSPTime = DateFormat.getTimeInstance(DateFormat.FULL, localeSP);
        System.out.println(dfTime.format(calendar.getTime()));
        System.out.println(dfSPTime.format(calendar.getTime()));

        DateFormat dfDateTime = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, locale);
        DateFormat dfSPDateTime = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, localeSP);
        System.out.println(dfDateTime.format(calendar.getTime()));
        System.out.println(dfSPDateTime.format(calendar.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:MM:SS",Locale.getDefault());
        System.out.println(sdf.format(calendar.getTime()));

        NumberFormat nf = NumberFormat.getInstance(locale);
        NumberFormat nfSP = NumberFormat.getInstance(localeSP);

        double valor = 123987145.34;


        System.out.println(nf.format(valor));
        System.out.println(nfSP.format(valor));




    }
}
