import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {
    public static void main(String[] args) throws Exception {
        LocalDate d01 = LocalDate.parse("2023-06-19");
        LocalDateTime d02 = LocalDateTime.parse("2023-06-19T15:39:22");
        Instant d03 = Instant.parse("2023-06-19T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d01.format(fmt1)); //ou fmt1.format(d01)

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(fmt2.format(d02));

        //Instant não permite format, pois não é uma data local, depende do fuso horário.
        //Logo, para customizar, precisa informar o fuso horário que vai usar.

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
        //withZone = Especifica o fuso horário
        //ZoneId.systemDefault = fuso horário do computador local
        System.out.println(fmt3.format(d03));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(fmt4.format(d02));
        //System.out.println(fmt4.format(d03)); Da erro porque é Instant

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(fmt5.format(d03));
    }
}
