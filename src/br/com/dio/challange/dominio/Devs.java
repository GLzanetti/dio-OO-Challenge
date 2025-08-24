package br.com.dio.challange.dominio;

import java.util.*;

public class Devs {

    private String nome;
    private Set<Assuntos> bootcampsInscritos = new HashSet<>();
    private List<Assuntos> bootcampsCompletos = new ArrayList<>();
    private double xpTotal;
    private double nivel = 1;
    private int proxNivel = 150;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Assuntos> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void setBootcampsInscritos(Set<Assuntos> bootcampsInscritos) {
        this.bootcampsInscritos = bootcampsInscritos;
    }

    public List<Assuntos> getBootcampsCompletos() {
        return bootcampsCompletos;
    }

    public void setBootcampsCompletos(List<Assuntos> bootcampsCompletos) {
        this.bootcampsCompletos = bootcampsCompletos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        bootcampsInscritos.addAll(bootcamp.getAssuntos());
        bootcamp.getDevs().add(this);
    }

    public void progredir(){
        Optional<Assuntos> assuntos = bootcampsInscritos.stream().findFirst();
        if(assuntos.isPresent()){
            bootcampsCompletos.add(assuntos.get());
            bootcampsInscritos.remove(assuntos.get());
        } else {
            System.err.println("Voce completou o bootcamp");
        }
    }

    public double getNivel() {
        return nivel;
    }

    public double nivel(){
        if (xpTotal >= proxNivel) {
            nivel += 1;
            proxNivel *= 2;
        }

        return nivel;
    }

    public double calcXpTotal(){
        xpTotal = bootcampsCompletos.stream().mapToDouble(Assuntos::calcularXp).sum();
        return xpTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(bootcampsInscritos, devs.bootcampsInscritos) && Objects.equals(bootcampsCompletos, devs.bootcampsCompletos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, bootcampsInscritos, bootcampsCompletos);
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", bootcampsInscritos=" + bootcampsInscritos +
                ", bootcampsCompletos=" + bootcampsCompletos +
                '}';
    }
}
