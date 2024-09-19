package br.ufjf.dcc.dcc025.provaeventos;
// Gustavo Vieira Fernandes Ribeiro
// 202165059AB
public class Natal extends Evento {
    public Natal(float va, Data da, String no, int ca) {
        super(va, da, no, ca);
    }
    @Override
    public boolean pessoaPodeParticipar(Pessoa a){
        // if(Pessoa.dataNascimento <= 01/01/2019 && participantes.size() < capacidade){ /*idade >= 5 && capacidade != participantes*/
        // }
        return true;
    }
}
