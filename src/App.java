import java.time.LocalDate;

import domain.Curso;
import domain.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda Java do básico ao avançado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Aprenda Python do básico ao avançado");
        curso2.setCargaHoraria(6);
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Tire suas dúvidas sobre Java com um especialista");
        mentoria1.setData(LocalDate.of(2023, 10, 1));

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Python");
        mentoria2.setDescricao("Tire suas dúvidas sobre Python com um especialista");
        mentoria2.setData(LocalDate.of(2023, 10, 2));

        System.out.println(mentoria1.toString());
        System.out.println(mentoria2.toString());
    }
}
