package br.com.dio.challange.dominio;

import java.time.LocalDate;

public class Mentoria extends Assuntos{

    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return Xp_Padrao + 10;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
