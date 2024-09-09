package www.unoplus.com.ao.gestaodedespesas.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatUtil {

    public java.sql.Date formatarDataDiaMesAno(String dataStr) throws ParseException {
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato1.parse(dataStr); 
        return new java.sql.Date(data.getTime()); 
    }

    public java.sql.Date formatarDataMesDiaAno(String dataStr) throws ParseException {
        SimpleDateFormat formato2 = new SimpleDateFormat("MM/dd/yyyy");
        Date data = formato2.parse(dataStr); 
        return new java.sql.Date(data.getTime()); 
    }
}
