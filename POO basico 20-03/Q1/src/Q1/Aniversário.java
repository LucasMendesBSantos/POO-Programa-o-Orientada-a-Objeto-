package Q1;

public class Aniversário {

    String[] pessoas;
    String[] datas;
    int tamanho;

    public Aniversário(int capacidade) {
        pessoas = new String[capacidade];
        datas = new String[capacidade];
        tamanho = 0;
    }

    // adicionar amigo
    public void adicionarAmigo(String nome, String data) {
        if (tamanho < pessoas.length) {
            pessoas[tamanho] = nome;
            datas[tamanho] = data;
            tamanho++;
        }
        else {
            System.out.println("Lista cheia!");
        }
    }

    // atualizar amigo
    public void atualizarAmigo(String nome, String novaData) {
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].equals(nome)) {
                datas[i] = novaData;
                System.out.println("Aniversário atualizado!");
                return;
            }
        }
        System.out.println("Amigo não encontrado.");
    }
    // remover amigo
    public void removerAmigo(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (pessoas[i].equals(nome)) {

                for (int j = i; j < tamanho - 1; j++) {
                    pessoas[j] = pessoas[j + 1];
                    datas[j] = datas[j + 1];
                }

                tamanho--;
                System.out.println("Amigo removido!");
                return;
            }
        }
        System.out.println("Amigo não encontrado.");
    }

    // mostrar lista
    public void mostrarLista() {
        System.out.println("Lista de aniversários:");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(pessoas[i] + " - " + datas[i]);
        }
    }


}
