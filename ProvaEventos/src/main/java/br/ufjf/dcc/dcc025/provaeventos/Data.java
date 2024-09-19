package br.ufjf.dcc.dcc025.provaeventos;
// Gustavo Vieira Fernandes Ribeiro
// 202165059AB
public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) throws DataException {
        if (!validarData(dia, mes, ano)) {
            throw new DataException("Data invalida.");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12) {
            return false;
        }else
            return true;
    }

    public static Data parser(String dataString) throws DataException {
        String[] partes = dataString.split("/");
        if (partes.length != 3) {
            throw new DataException("Data invalida.");
        }
        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            return new Data(dia, mes, ano);
        } catch (NumberFormatException e) {
            throw new DataException("Erro, data invalida.");
        }
    }

    public int diferenca(Data outra) {
        int dias1 = this.ano * 360 + this.mes * 30 + this.dia;
        int dias2 = outra.ano * 360 + outra.mes * 30 + outra.dia;
        return dias1 - dias2;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
