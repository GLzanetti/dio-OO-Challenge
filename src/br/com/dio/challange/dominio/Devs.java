package br.com.dio.challange.dominio;

import java.util.HashSet;
import java.util.Set;

public class Devs {

    private String nome;
    private Set<Bootcamp> bootcampsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void setBootcampsInscritos(Set<Bootcamp> bootcampsInscritos) {
        this.bootcampsInscritos = bootcampsInscritos;
    }
}
