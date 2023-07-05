import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Instant;

public class Aula113 {
    public static void main(String[] args) throws Exception{
        LocalDate d01 = LocalDate.parse("2023-06-20");
        LocalDateTime d02 = LocalDateTime.parse("2023-06-20T02:30:25");
        Instant d03 = Instant.parse("2023-06-20T01:30:26Z");

        // -minus- e  -plus- para diminuir ou aumentar

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        System.out.println("7 dias atrás: " + pastWeekLocalDate);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println("7 dias a frente: " + nextWeekLocalDate);
        System.out.println();

        LocalDateTime hoursAgo = d02.minusHours(6);
        System.out.println("6 horas a menos: " + hoursAgo);
        System.out.println();

        // -minus(QUANT, ChronoUnit.TIPO)- e -plus(QUANT, ChronoUnit.TIPO)-
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(nextWeekInstant);
        System.out.println();

        //Duration para calcular duração entre duas datas
        //Duration.between(data1, data2)
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("Duração em dias: " + t1.toDays());

        //Duration t2 = Duration.between(pastWeekLocalDate, d01);
        //System.out.println("Duração em dias: " +  t2.toDays());
        //Da errado porque LOCALDATE não tem hora 
    }
}
 