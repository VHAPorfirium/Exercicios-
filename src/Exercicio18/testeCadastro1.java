package Exercicio18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testeCadastro1 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataNascimento1 = sdf.parse("15/08/2001");
        Date dataNascimento2 = sdf.parse("12/05/1995");
        Date dataNascimento3 = sdf.parse("23/11/1988");
        Date dataNascimento4 = sdf.parse("03/02/2003");

        Moradores morador1 = new Moradores("Victor Hugo", 22, "0421251651564", dataNascimento1, "Masculino", "hsdfthyert@gmail.com", "626558945894", 'B', 2, 001);
        Moradores morador2 = new Moradores("Ana Paula", 29, "1234567890123", dataNascimento2, "Feminino", "anapaula", "6299999999", 'A', 3, 002);
        Moradores morador3 = new Moradores("João Carlos", 35, "9876543210987", dataNascimento3, "Masculino", "joaocarlos", "6298888888", 'C', 1, 003);
        Moradores morador4 = new Moradores("Mariana Silva", 21, "1597534561230", dataNascimento4, "Feminino", "marianasilva", "6297777777", 'D', 4, 004);

        System.out.println(morador1);

        System.out.println("------------------------------------------------");

        System.out.println(morador2);

        System.out.println("------------------------------------------------");

        System.out.println(morador3);

        System.out.println("------------------------------------------------");

        System.out.println(morador4);


    }
}
