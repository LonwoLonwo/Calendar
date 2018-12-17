import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Loader
{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(1989, Calendar.FEBRUARY, 2);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEE");

        for(int i = 0; i < 30; i++)
        {
            Date date = calendar.getTime();
            calendar.add(Calendar.YEAR, 1);
            System.out.println(i + " - " + dateFormat.format(date));
        }

    }
}
