package br.com.dio.challange.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private Set<Assuntos> assuntos = new HashSet<>();
    private List<Devs> devs = new ArrayList<>();
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Devs> getDevs() {
        return devs;
    }

    public void setDevs(List<Devs> devs) {
        this.devs = devs;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Assuntos> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(Set<Assuntos> assuntos) {
        this.assuntos = assuntos;
    }

    public void adicionarAssunto(Assuntos assuntos){
        this.assuntos.add(assuntos);
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(assuntos, bootcamp.assuntos) && Objects.equals(devs, bootcamp.devs) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, assuntos, dataInicial, dataFinal);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", assuntos=" + assuntos +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}
