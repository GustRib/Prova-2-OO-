package br.ufjf.dcc.dcc025.provaeventos;
import java.util.ArrayList;
import java.util.List;
// Gustavo Vieira Fernandes Ribeiro
// 202165059AB
public class Pessoa {
    protected Data dataNascimento;
    private String nome;
    private List<Evento> eventos;

    public Pessoa(Data dn, String nm) {
        this.dataNascimento = dn;
        this.nome = nm;
        this.eventos = new ArrayList<>();
    }

    public boolean podeParticiparEvento(Evento e) {
        for(Evento i : eventos) {
            if(i.getData() != (e.getData())) {
                return true;
            }
        }
        return false;
    }

    public boolean agendarEvento(Evento e) {
        if(podeParticiparEvento(e)) {
            eventos.add(e);
            return true;
        }
        return false;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento;
    }
}