import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Loader
{
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(1989, Calendar.FEBRUARY, 2);

        Calendar calendar2 = Calendar.getInstance();

        int currentYearCount = calendar2.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE", new Locale("ru"));

        for(int i = 0; i <= currentYearCount; i++)
        {
            Date date = calendar.getTime();
            calendar.add(Calendar.YEAR, 1);
            System.out.println(i + " - " + dateFormat.format(date));
        }

    }
}
