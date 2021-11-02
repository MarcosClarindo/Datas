package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws Exception {

        // Criação do objeto SimpleDateFormat

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Referenciando hora, minutos e segundos 
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Instanciando a data no formato UTC
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Instanciando uma data atual
        Date x1 = new Date();

        // Outra forma de instanciar a data atual
        Date x2  = new Date(System.currentTimeMillis());
        // Criando uma data para 5/01/1970
        Date x4 = new Date(1000l * 60l * 60l * 5l);

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:01");
        // Criando uma data no formato ISO
        Date y3 = Date.from(Instant.parse("2018-06-25t15:42:07z"));


        // Imprimindo com a formatação padrão do Java
        System.out.println("---------------------------------");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x4 = " + x4);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + y3);

        System.out.println("---------------------------------");
        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("x4 = " + sdf2.format(x4));
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("y3 = " + sdf2.format(y3));
        System.out.println("---------------------------------");
        System.out.println("x1 = " + sdf3.format(x1));
        System.out.println("x2 = " + sdf3.format(x2));
        System.out.println("x4 = " + sdf3.format(x4));
        System.out.println("y1 = " + sdf3.format(y1));
        System.out.println("y2 = " + sdf3.format(y2));
        System.out.println("y3 = " + sdf3.format(y3));
    }
}
