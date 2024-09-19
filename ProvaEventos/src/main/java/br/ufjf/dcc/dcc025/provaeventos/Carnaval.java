package br.ufjf.dcc.dcc025.provaeventos;
// Gustavo Vieira Fernandes Ribeiro
// 202165059AB
class Carnaval extends Evento {

    public Carnaval(int valor, Data data, String nome, int capacidade) {
        super(100, data, "Carnaval", capacidade);
    }

    @Override
    public boolean pessoaPodeParticipar(Pessoa pessoa) {
        return true;
    }
}

