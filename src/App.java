import java.time.LocalDate;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java e se torne um desenvolvedor Java completo");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("==========================");

        Dev dev = new Dev();
        dev.setNome("Gabriel");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos Concluídos de " + dev.getNome() + ": " + dev.getConteudosConcluidos());

        System.out.println("==========================");

        Dev dev2 = new Dev();
        dev2.setNome("Ana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());

    }
}
