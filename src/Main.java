import br.com.dio.challange.dominio.Bootcamp;
import br.com.dio.challange.dominio.Curso;
import br.com.dio.challange.dominio.Mentoria;

import java.lang.invoke.VolatileCallSite;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java Completo");
        curso.setDescricao("Curso de Java do iniciante ao avançado");
        curso.setCargaHoraria(77);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java com IA");
        mentoria.setDescricao("Mentoria sobre Java e a utilização IA para a geração de código");
        mentoria.setDataMentoria(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT com Java");
        bootcamp.setDescricao("Bootcamp focado no aprendizado da linguagem Java ");
        bootcamp.adicionarCurso(curso);
        bootcamp.adicionarMentoria(mentoria);

        System.out.println(bootcamp);
    }
}