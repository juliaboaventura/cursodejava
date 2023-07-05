import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula110 {
    public static void main(String[] args) throws Exception {
        //LocalDate - dia mes ano
        //LocalDateTime - dia mes ano hora
        //Instant - data hora com fuso horário GMT
        //Duration - duração

        LocalDate d01 = LocalDate.now();
        System.out.println("Apenas dia, mês e ano = " + d01.toString());
        System.out.println();

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Dia, mês, ano e horário = " + d02.toString());
        System.out.println();

        Instant d03 = Instant.now();
        System.out.println("Dia, mês, ano e horário GMT = " + d03.toString());
        System.out.println();

        LocalDate d04 = LocalDate.parse("2004-10-26");
        System.out.println("Meu aniversário = " + d04.toString());
        System.out.println();

        LocalDateTime d05 = LocalDateTime.parse("2004-10-26T01:40:00");
        System.out.println("Horário que nasci = " + d05.toString());
        System.out.println();

        Instant d06 = Instant.parse("2004-10-26T04:40:00Z");
        System.out.println("Horário que nasci = " + d06.toString());
        System.out.println();

        Instant d07 = Instant.parse("2023-06-19T01:30:26");
        System.out.println("Horário GMT para São Paulo = " + d07.toString());
        System.out.println();

        //DateTimeFormatter - formatar hora
        //DateTimeFormatter.ofPattern("COMO O HORÁRIO VAI FICAR")

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

        LocalDate d08 = LocalDate.parse("19/06/2023", fmt1);
        System.out.println(d08.toString());
        System.out.println();

        LocalDateTime d09 = LocalDateTime.parse("19/06/2023 12:56:34", fmt2);
        System.out.println(d09.toString());
        System.out.println();

        LocalDate d10 = LocalDate.of(2023, 6, 19);
        System.out.println(d10.toString());
        System.out.println();

        LocalDateTime d11 = LocalDateTime.of(2023, 6, 19, 15, 0, 0);
        System.out.println(d11.toString());
        System.out.println();
    }
}
