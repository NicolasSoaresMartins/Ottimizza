import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dataFormater {

        public static String convertDate(String dateString) {

            DateTimeFormatter[] dateFormats = new DateTimeFormatter[] {
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                    DateTimeFormatter.ofPattern("dd MM yyyy"),
                    DateTimeFormatter.ofPattern("ddMMyyyy"),
                    DateTimeFormatter.ofPattern("yyyy MM dd")
            };

            for (DateTimeFormatter format : dateFormats) {
                try {
                    LocalDate date = LocalDate.parse(dateString, format);
                    return date.format(DateTimeFormatter.ofPattern("yyyy/MM"));
                } catch (Exception e) {
                }
            }
            return null;
        }
    }


