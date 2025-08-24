package br.com.dio.challange.dominio;

import java.awt.im.spi.InputMethodDescriptor;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = LocalDate.now().plusDays(45);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria){
        mentorias.add(mentoria);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cursos=" + cursos +
                ", mentorias=" + mentorias +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}
