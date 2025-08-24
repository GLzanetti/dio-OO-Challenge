import br.com.dio.challange.dominio.Bootcamp;
import br.com.dio.challange.dominio.Curso;
import br.com.dio.challange.dominio.Devs;
import br.com.dio.challange.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java Completo");
        curso.setDescricao("Curso de Java do iniciante ao avançado");
        curso.setCargaHoraria(77);

        Curso curso2 = new Curso();
        curso.setTitulo("SpringBoot");
        curso.setDescricao("Curso de Java do framework SpringBoot");
        curso.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java com IA");
        mentoria.setDescricao("Mentoria sobre Java e a utilização IA para a geração de código");
        mentoria.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT com Java");
        bootcamp.setDescricao("Bootcamp focado no aprendizado da linguagem Java ");
        bootcamp.adicionarAssunto(mentoria);
        bootcamp.adicionarAssunto(curso);
        bootcamp.adicionarAssunto(curso2);

        Devs devGabriel = new Devs();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println(devGabriel.calcXpTotal());

        devGabriel.progredir();
        devGabriel.progredir();

        System.out.println(devGabriel.getBootcampsInscritos());
        System.out.println(devGabriel.getBootcampsCompletos());
        System.out.println(devGabriel.calcXpTotal());
        System.out.println(devGabriel.nivel());

        devGabriel.progredir();

        System.out.println(devGabriel.getBootcampsInscritos());
        System.out.println(devGabriel.getBootcampsCompletos());
        System.out.println(devGabriel.calcXpTotal());
        System.out.println(devGabriel.nivel());
    }
}