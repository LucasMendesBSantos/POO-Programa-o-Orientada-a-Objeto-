package Q1;

public class main {

        public static void main(String[] args) {

            Aniversário lista = new Aniversário(10);

            lista.adicionarAmigo("Maria", "10/05");
            lista.adicionarAmigo("João", "22/11");
            lista.adicionarAmigo("Pedro", "01/01");

            lista.mostrarLista();

            System.out.println();

            lista.atualizarAmigo("Maria", "11/05");

            lista.removerAmigo("Pedro");

            System.out.println();

            lista.mostrarLista();
        }

}
