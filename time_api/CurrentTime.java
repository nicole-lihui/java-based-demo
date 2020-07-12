import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * CurrentTime
 */
public class CurrentTime {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(df.format(date));

        Calendar cDate = Calendar.getInstance();
        System.out.println(df.format(cDate.getTime()));

        String startStr = "2020-1-2 20:0:0";
        Date startTime = df.parse(startStr);
        
        long start = startTime.getTime();
        long end = date.getTime();
        long inMil = end - start;

        System.out.println("Dif day : " + (inMil/ (1000 * 60 * 60 * 24)) + "\nDif hour: " + (inMil/ (1000 * 60 * 60)));

    }
}
