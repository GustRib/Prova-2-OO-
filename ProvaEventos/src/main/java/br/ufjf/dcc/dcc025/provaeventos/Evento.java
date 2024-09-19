package br.ufjf.dcc.dcc025.provaeventos;
// Gustavo Vieira Fernandes Ribeiro
// 202165059AB
import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private float valor;
    protected Data data;
    private String nome;
    protected int capacidade;
    protected List<Pessoa> participantes;

    public Evento(float va, Data da, String no, int ca) {
        this.valor = va;
        this.data = da;
        this.nome = no;
        this.capacidade = ca;
        this.participantes = new ArrayList<>();
    }

    public boolean temVaga() /* retornar true se a quantidade de pessoas nao tiver atingido a capacidade do evento */ {
    if(participantes.size() < capacidade)
        return true;
    else {
        return false;
    }
}
    public abstract boolean pessoaPodeParticipar(Pessoa a);

    public void adicionaPessoa(Pessoa a) {
        if(pessoaPodeParticipar(a) == true){
            participantes.add(a);
        } else {
            System.out.println("Pessoa nao foi adicionada pois nao tem vaga.");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Pessoa> participantes) {
        this.participantes = participantes;
    }
}
