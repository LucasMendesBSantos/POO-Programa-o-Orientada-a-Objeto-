public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            // Se a data for inválida, inicializa com uma data padrão
            System.out.println("Data inválida! Inicializando com 01/01/2000."); //Estava pensado em tirar e colocar erro, mas teria que fazer um laço para voltar para a data valida

            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validarData(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1 || d > 31) return false;
        return d <= diasNoMes(m, a);
    }

    private int diasNoMes(int m, int a) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      //poderia fazer um if para colocar ano bissexto, mas acho desnecessario por enquanto.
        return diasPorMes[m];
    }

    public void avancar() {
        dia++;
        if (dia > diasNoMes(mes, ano)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
    }

    public boolean eMaisAntiga(Data outra) {
        if (this.ano < outra.ano) return true;
        if (this.ano > outra.ano) return false;

        if (this.mes < outra.mes) return true;
        if (this.mes > outra.mes) return false;

        return this.dia < outra.dia;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}