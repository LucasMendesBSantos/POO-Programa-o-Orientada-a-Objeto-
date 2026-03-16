import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        int MenorQueZero = 0;

                //Leitura de vetor
                //caso tenha que colocar numeros decimais, eu teria que trocar tudo para Float, nada demais. ************
        System.out.println("Digite 10 numeros inteiros");
        for (int i = 0; i < vetor.length; i++){ //coloquei vetor.length para ver se vai ser pelo tamanho do vetor ou para o conteudo dentro do endereço ele
            //deu bom, vetro.length é top [V]
           System.out.println("Posição [" + i + "]  ");
           vetor[i] = sc.nextInt();


        //item B contar os < 0

        if (vetor[i] < 0) {
            MenorQueZero++;
        }



        //item C (somar dois numeros) professor disse alguma coisa sobre verbo no infinitivo, mas eu não lembro, logo, irei usar o "Somar", perdão professor se esse comentario for para o pdf
        //irei usar o operador += que soma a variavel a uma segunda variavel e atribui o resultado a primeira
        //ex: (X += Y) == X = (X+Y)

        soma += vetor[i]; //A soma de todos os numeros do vetor
        }

        System.out.println("\n Resultados \n");

        //item A Bublle Sort para ver os numeros iguais
        //vou printar logo o titulo que ai o que for repetindo, vai printando também e aparece como resultado

        //percebi que ao imprimir, estavam tudo um colado no outro, então vou colocar \n pra separar
        System.out.println("\n"); //esse print é só pra pular linha e ficar bonitinho
        System.out.println("\n");

        System.out.println("Numeros iguais");
        for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++){
                if(vetor[i] == vetor[j]){
                    System.out.println(vetor[i]);
                }
            }
        }

        //item D inverterndo o vetor
        // Ao testar o código, percebi que se não colocar o titulo do proximo processo, não da pra entender nada. kkkkk  [V]
        //infelizmente não ta imprimindo o vetor invertido[V]
        System.out.println("\n"); //esse print é só pra pular linha e ficar bonitinho
        System.out.println("\n");
            System.out.println("Vetor Inverso");
                for (int i = vetor.length - 1; i >= 0; i--){
                    System.out.println(vetor[i]);
                }
        //item E outro Bublle Sort para ordenar
        //Queria dps ver um outro metodo de ordenação, Bubble Sort é muito ineficaz [V]
        //Fui pesquisar os metodos de ordenação e descobri que na biblioteca java já tem um para organizar arrays, já amo JAVA [V]

                Arrays.sort(vetor);

        System.out.println("\n"); //esse print é só pra pular linha e ficar bonitinho
        System.out.println("\n");
                System.out.println("Vetor ordenado");
                for(int i = 0; i < vetor.length; i++){
                    System.out.println(vetor[i]);

                }

        System.out.println("\n"); //esse print é só pra pular linha e ficar bonitinho
        System.out.println("\n");
        System.out.println("Quantidade de numeros negaticos é:" + MenorQueZero);

        System.out.println("\n"); //esse print é só pra pular linha e ficar bonitinho
        System.out.println("\n");
        System.out.println(" A soma dos numeros do vetor são: " + soma);

        sc.close();
    }

}

